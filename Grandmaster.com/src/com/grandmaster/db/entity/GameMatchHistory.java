package com.grandmaster.db.entity;

import java.sql.Timestamp;

public class GameMatchHistory {

    private final String TBL_NAME = "game_match_history";

    private final String INSERT_SQL_QUERY = "INSERT INTO " + TBL_NAME + "(id,userAId,userBId,game_started,game_finished,winner,game_status) VALUES ( ";
	
    private final String UPDATE_SQL_QUERY = "UPDATE " + TBL_NAME + " SET ";
	
    private final String DELETE_SQL_QUERY = "DELETE FROM " + TBL_NAME + " where ";

    private final String INSERT_SQL_QUERY_V = "INSERT INTO " + TBL_NAME + "(id,userAId,userBId,game_started,game_finished,winner,game_status) VALUES (null,?,?,?,?,?,?)";

    private Integer   id;
    private Integer   userA;
    private Integer   userB;
    private Integer   winnerUser;
    private char      gameStatus;
    private Timestamp gameStarted;
    private Timestamp gameEnded;

    public GameMatchHistory() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param id
     * @param userA
     * @param userB
     * @param winnerUser
     * @param gameStatus
     * @param gameStarted
     * @param gameEnded
     */
    public GameMatchHistory(Integer id, Integer userA, Integer userB, Integer winnerUser, char gameStatus, Timestamp gameStarted, Timestamp gameEnded) {
        this.id = id;
        this.userA = userA;
        this.userB = userB;
        this.winnerUser = winnerUser;
        this.gameStatus = gameStatus;
        this.gameStarted = gameStarted;
        this.gameEnded = gameEnded;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the userA
     */
    public Integer getUserA() {
        return userA;
    }

    /**
     * @param userA
     *            the userA to set
     */
    public void setUserA(Integer userA) {
        this.userA = userA;
    }

    /**
     * @return the userB
     */
    public Integer getUserB() {
        return userB;
    }

    /**
     * @param userB
     *            the userB to set
     */
    public void setUserB(Integer userB) {
        this.userB = userB;
    }

    /**
     * @return the winnerUser
     */
    public Integer getWinnerUser() {
        return winnerUser;
    }

    /**
     * @param winnerUser
     *            the winnerUser to set
     */
    public void setWinnerUser(Integer winnerUser) {
        this.winnerUser = winnerUser;
    }

    /**
     * @return the gameStatus
     */
    public char getGameStatus() {
        return gameStatus;
    }

    /**
     * @param gameStatus
     *            the gameStatus to set
     */
    public void setGameStatus(char gameStatus) {
        this.gameStatus = gameStatus;
    }

    /**
     * @return the gameStarted
     */
    public Timestamp getGameStarted() {
        return gameStarted;
    }

    /**
     * @param gameStarted
     *            the gameStarted to set
     */
    public void setGameStarted(Timestamp gameStarted) {
        this.gameStarted = gameStarted;
    }

    /**
     * @return the gameEnded
     */
    public Timestamp getGameEnded() {
        return gameEnded;
    }

    /**
     * @param gameEnded
     *            the gameEnded to set
     */
    public void setGameEnded(Timestamp gameEnded) {
        this.gameEnded = gameEnded;
    }

    public String getInsertStatement() {
		final String FIELD_SEP = " , ";
		final String FIELD_QUO = "'";
		String query = INSERT_SQL_QUERY;

		// Update values
		query += "null" + FIELD_SEP;
		query += this.getUserA() + FIELD_SEP;
		query += this.getUserB() + FIELD_SEP;
		query += "'" + this.getGameStarted() + "'" + FIELD_SEP;
		query += "'" + this.getGameEnded() + "'" + FIELD_SEP;
		query += this.getWinnerUser() + FIELD_SEP; 
		query += "'" + this.getGameStatus() + "'";
		return query + " );";
	}


    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "GameMatchHistory [id=" + id + ", userA=" + userA + ", userB=" + userB + ", winnerUser=" + winnerUser
                + ", gameStatus=" + gameStatus + ", gameStarted=" + gameStarted + ", gameEnded=" + gameEnded + "]";
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gameEnded == null) ? 0 : gameEnded.hashCode());
        result = prime * result + ((gameStarted == null) ? 0 : gameStarted.hashCode());
        result = prime * result + gameStatus;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((userA == null) ? 0 : userA.hashCode());
        result = prime * result + ((userB == null) ? 0 : userB.hashCode());
        result = prime * result + ((winnerUser == null) ? 0 : winnerUser.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof GameMatchHistory)) {
            return false;
        }
        GameMatchHistory other = (GameMatchHistory) obj;
        if (gameEnded == null) {
            if (other.gameEnded != null) {
                return false;
            }
        } else if (!gameEnded.equals(other.gameEnded)) {
            return false;
        }
        if (gameStarted == null) {
            if (other.gameStarted != null) {
                return false;
            }
        } else if (!gameStarted.equals(other.gameStarted)) {
            return false;
        }
        if (gameStatus != other.gameStatus) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (userA == null) {
            if (other.userA != null) {
                return false;
            }
        } else if (!userA.equals(other.userA)) {
            return false;
        }
        if (userB == null) {
            if (other.userB != null) {
                return false;
            }
        } else if (!userB.equals(other.userB)) {
            return false;
        }
        if (winnerUser == null) {
            if (other.winnerUser != null) {
                return false;
            }
        } else if (!winnerUser.equals(other.winnerUser)) {
            return false;
        }
        return true;
    }

}
