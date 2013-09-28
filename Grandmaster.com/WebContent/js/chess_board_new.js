// JavaScript Document
var PIECE_PAWN = 0,
PIECE_CASTLE = 1,
PIECE_ROUKE = 2,
PIECE_BISHOP = 3,
PIECE_QUEEN = 4,
PIECE_KING = 5;

function draw()
{
    // Main entry point got the HTML5 chess board example
    canvas = document.getElementById('chess');
 
    // Canvas supported?
    if(canvas.getContext)
    {
        ctx = canvas.getContext('2d');
 
        // Calculdate the precise block size
        BLOCK_SIZE = canvas.height / NUMBER_OF_ROWS;
         
        // Draw the background
        drawBoard();
 
        defaultPositions();
         
        // Draw pieces
        pieces = new Image();
        pieces.src = 'pieces.png';
        pieces.onload = drawPieces;
 
        canvas.addEventListener('click', board_click, false);
    }
    else
    {
        alert("Canvas not supported!");
    }
}

function drawBoard()
{  
    for(iRowCounter = 0; iRowCounter < NUMBER_OF_ROWS; iRowCounter++)
    {
        drawRow(iRowCounter);
    }  
     
    // Draw outline
    ctx.lineWidth = 3;
    ctx.strokeRect(0, 0, NUMBER_OF_ROWS * BLOCK_SIZE, NUMBER_OF_COLS * BLOCK_SIZE);
}

function drawRow(iRowCounter)
{
    // Draw 8 block left to right
    for(iBlockCounter = 0; iBlockCounter < NUMBER_OF_ROWS; iBlockCounter++)
    {
        drawBlock(iRowCounter, iBlockCounter);
    }
}

function drawBlock(iRowCounter, iBlockCounter)
{  
    // Set the background
    ctx.fillStyle = getBlockColour(iRowCounter, iBlockCounter);
     
    // Draw rectangle for the background
    ctx.fillRect(iRowCounter * BLOCK_SIZE, iBlockCounter * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
 
    ctx.stroke();  
}

function getBlockColour(iRowCounter, iBlockCounter)
{
    var cStartColour;
     
    // Alternate the block colour
    if(iRowCounter % 2)
        cStartColour = (iBlockCounter % 2?BLOCK_COLOUR_1:BLOCK_COLOUR_2);
    else
        cStartColour = (iBlockCounter % 2?BLOCK_COLOUR_2:BLOCK_COLOUR_1);
         
    return cStartColour;
}


function defaultPositions()
{
    json =
    {
        "white":
        [
            {
                "piece": PIECE_CASTLE,
                "row": 0,
                "col": 0,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_ROUKE,
                "row": 0,
                "col": 1,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_BISHOP,
                "row": 0,
                "col": 2,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_KING,
                "row": 0,
                "col": 3,
                "status": IN_PLAY
            }, 
            {
                "piece": PIECE_QUEEN,
                "row": 0,
                "col": 4,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_BISHOP,
                "row": 0,
                "col": 5,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_ROUKE,
                "row": 0,
                "col": 6,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_CASTLE,
                "row": 0,
                "col": 7,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 1,
                "col": 0,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 1,
                "col": 1,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 1,
                "col": 2,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 1,
                "col": 3,
                "status": IN_PLAY
            }, 
            {
                "piece": PIECE_PAWN,
                "row": 1,
                "col": 4,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 1,
                "col": 5,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 1,
                "col": 6,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 1,
                "col": 7,
                "status": IN_PLAY
            }
        ],
        "black":
        [
            {
                "piece": PIECE_CASTLE,
                "row": 7,
                "col": 0,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_ROUKE,
                "row": 7,
                "col": 1,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_BISHOP,
                "row": 7,
                "col": 2,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_KING,
                "row": 7,
                "col": 3,
                "status": IN_PLAY
            }, 
            {
                "piece": PIECE_QUEEN,
                "row": 7,
                "col": 4,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_BISHOP,
                "row": 7,
                "col": 5,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_ROUKE,
                "row": 7,
                "col": 6,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_CASTLE,
                "row": 7,
                "col": 7,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 6,
                "col": 0,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 6,
                "col": 1,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 6,
                "col": 2,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 6,
                "col": 3,
                "status": IN_PLAY
            }, 
            {
                "piece": PIECE_PAWN,
                "row": 6,
                "col": 4,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 6,
                "col": 5,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 6,
                "col": 6,
                "status": IN_PLAY
            },
            {
                "piece": PIECE_PAWN,
                "row": 6,
                "col": 7,
                "status": IN_PLAY
            }
        ]      
    };
}


function drawPieces()
{
    drawTeamOfPieces(json.black, true);
    drawTeamOfPieces(json.white, false);
}

function drawTeamOfPieces(teamOfPieces, bBlackTeam)
{
    var iPieceCounter;
 
    // Loop through each piece and draw it on the canvas   
    for (iPieceCounter = 0; iPieceCounter < teamOfPieces.length; iPieceCounter++)
    {  
        drawPiece(teamOfPieces[iPieceCounter], bBlackTeam);
    }  
}


function drawPiece(curPiece, bBlackTeam)
{
    var imageCoords = getImageCoords(curPiece.piece, bBlackTeam)
         
    // Draw the piece onto the canvas
    ctx.drawImage(pieces,
        imageCoords.x, imageCoords.y, BLOCK_SIZE, BLOCK_SIZE,
        curPiece.col * BLOCK_SIZE, curPiece.row * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
                     
}

function getImageCoords(pieceCode, bBlackTeam)
{
    var imageCoords =
    {
        "x": pieceCode * BLOCK_SIZE,
        "y": (bBlackTeam?0:BLOCK_SIZE)
    };
     
    return imageCoords;
}

function board_click(ev)
{
    var x = ev.clientX - canvas.offsetLeft;
    var y = ev.clientY - canvas.offsetTop;
 
    var clickedBlock = screenToBlock(x, y);
     
    if(selectedPiece == null)
    {
        checkIfPieceClicked(clickedBlock);
    }
    else
    {
        processMove(clickedBlock);
    }
}

function checkIfPieceClicked(clickedBlock)
{
    var pieceAtBlock = getPieceAtBlock(clickedBlock);
     
    if (pieceAtBlock !== null)
    {
        selectPiece(pieceAtBlock);
    }
}

function getPieceAtBlock(clickedBlock)
{
    var team = (currentTurn === BLACK_TEAM ? json.black:json.white);
 
    return getPieceAtBlockForTeam(team, clickedBlock);
}

function getPieceAtBlockForTeam(teamOfPieces, clickedBlock)
{
    var curPiece = null,
        iPieceCounter = 0,
        pieceAtBlock = null;
     
    for (iPieceCounter = 0; iPieceCounter < teamOfPieces.length; iPieceCounter++)
    {
        curPiece = teamOfPieces[iPieceCounter];
         
        if (curPiece.status === IN_PLAY &&
            curPiece.col === clickedBlock.col &&
            curPiece.row === clickedBlock.row)
        {
            curPiece.position = iPieceCounter;
             
            pieceAtBlock = curPiece;
            iPieceCounter = teamOfPieces.length;
        }
    }
     
    return pieceAtBlock;
}

function selectPiece(pieceAtBlock)
{
    // Draw outline
    ctx.lineWidth = SELECT_LINE_WIDTH;
    ctx.strokeStyle = HIGHLIGHT_COLOUR;
    ctx.strokeRect((pieceAtBlock.col * BLOCK_SIZE) + SELECT_LINE_WIDTH,
        (pieceAtBlock.row * BLOCK_SIZE) + SELECT_LINE_WIDTH,
        BLOCK_SIZE - (SELECT_LINE_WIDTH * 2),
        BLOCK_SIZE - (SELECT_LINE_WIDTH * 2));
     
    selectedPiece = pieceAtBlock;
}

function processMove(clickedBlock)
{
    var pieceAtBlock = getPieceAtBlock(clickedBlock),
        enemyPiece = blockOccupiedByEnemy(clickedBlock);
     
    if (pieceAtBlock !== null)
    {
        removeSelection(selectedPiece);
        checkIfPieceClicked(clickedBlock);         
    }
    else if (canSelectedMoveToBlock(selectedPiece, clickedBlock, enemyPiece) === true)
    {
        movePiece(clickedBlock, enemyPiece);
    }
}

function canSelectedMoveToBlock(selectedPiece, clickedBlock, enemyPiece)
{
    var bCanMove = false;
     
    switch (selectedPiece.piece)
    {
        case PIECE_PAWN:
         
            bCanMove = canPawnMoveToBlock(selectedPiece, clickedBlock, enemyPiece);
             
        break;
         
        case PIECE_CASTLE:
             
            // TODO
             
        break;
         
        case PIECE_ROUKE:
         
            // TODO
             
        break;
         
        case PIECE_BISHOP:
 
            // TODO
             
        break;
         
        case PIECE_QUEEN:
         
            // TODO
                 
        break;
         
        case PIECE_KING:
         
            // TODO
             
        break;
    }
 
    return bCanMove;
 
}


function canPawnMoveToBlock(selectedPiece, clickedBlock, enemyPiece)
{
    var iRowToMoveTo = (currentTurn === WHITE_TEAM ? selectedPiece.row + 1:selectedPiece.row - 1),
        bAdjacentEnemy = (clickedBlock.col === selectedPiece.col - 1 ||
                    clickedBlock.col === selectedPiece.col + 1) &&
                    enemyPiece !== null,
        bNextRowEmpty = (clickedBlock.col === selectedPiece.col &&
                    blockOccupied(clickedBlock) === false);
                     
    return clickedBlock.row === iRowToMoveTo &&
            (bNextRowEmpty === true || bAdjacentEnemy === true);
}

function movePiece(clickedBlock, enemyPiece)
{
    // Clear the block in the original position
    drawBlock(selectedPiece.col, selectedPiece.row);
     
    var team = (currentTurn === WHITE_TEAM ? json.white:json.black);
    var opposite = (currentTurn !== WHITE_TEAM ? json.white:json.black);
 
    team[selectedPiece.position].col = clickedBlock.col;
    team[selectedPiece.position].row = clickedBlock.row;
     
    if (enemyPiece !== null)
    {
        // Clear the piece your about to take
        drawBlock(enemyPiece.col, enemyPiece.row); 
        opposite[enemyPiece.position].status = TAKEN;
    }
     
    // Draw the piece in the new position
    drawPiece(selectedPiece, (currentTurn === BLACK_TEAM));            
     
    currentTurn = (currentTurn === WHITE_TEAM ? BLACK_TEAM:WHITE_TEAM);
     
    selectedPiece = null;
}



