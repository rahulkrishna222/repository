package com.grandmaster.web.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grandmaster.db.entity.GameProgress;
import com.grandmaster.db.service.GameProgressService;
import com.grandmaster.db.service.impl.GameProgressServiceImpl;

/**
 * Servlet implementation class GameProgressServlet
 */
@WebServlet("/GameProgressServlet")
public class GameProgressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameProgressServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    if (request.getSession(false) != null && request.getSession(false).getAttribute("userId") != null){
            Integer userId = Integer.parseInt(request.getSession(false).getAttribute("userId").toString());
            
            Integer matchId = Integer.parseInt(request.getParameter("matchId"));
            if (matchId == null ){
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }else{
                GameProgressService gameProgressService = new GameProgressServiceImpl();
                GameProgress gameProgress = gameProgressService.select(matchId);
                // TODO Check game status if need now no time to do that
                PrintWriter out = response.getWriter();
                
                out.write(gameProgress.getPosition());
            }
	    }else{
            PrintWriter out = response.getWriter();
            out.write("NULL");
           // request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession(false) != null && request.getSession(false).getAttribute("userId") != null){
		    Integer userId = Integer.parseInt(request.getSession(false).getAttribute("userId").toString());
		    String userPositions = request.getParameter("gamePosition");
		    Integer gameId = Integer.parseInt(request.getParameter("gameId"));
		    
		    GameProgress gameProgress = new GameProgress();
		    gameProgress.setPosition(userPositions);
		    
		    GameProgressService gameProgressService = new GameProgressServiceImpl();
		    gameProgressService.update(gameProgress, gameId);
		    
		}else{
		    PrintWriter out = response.getWriter();
		    out.write("datasss");
		   // request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}

}
