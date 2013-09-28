package com.grandmaster.db.entity;

/**
 * @author Rahul
 *
 */
public class GameProgress {

	public final static String TBL_NAME = "game_progress";

	public final String INSERT_SQL_QUERY = "INSERT INTO " + TBL_NAME + "(id,match_id,opponent_A_element_pos,opponent_B_element_pos) VALUES ( ";
	
	public final static String UPDATE_SQL_QUERY = "UPDATE " + TBL_NAME + " SET position = ? WHERE match_id = ?";
	
	public final static String DELETE_SQL_QUERY = "DELETE FROM " + TBL_NAME + " where ";
    
	public final static String INSERT_SQL_QUERY_V = "INSERT INTO " + TBL_NAME + "(id,match_id,position) VALUES (null, ?, ?)";

    private Integer id;
    private Integer matchId;
    private String  position;

    public GameProgress() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param id
     * @param matchId
     * @param opponentAPosition
     * @param opponentBPosition
     */
    public GameProgress(Integer id, Integer matchId, String position) {
        this.id = id;
        this.matchId = matchId;
        this.position = position;
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
     * @return the matchId
     */
    public Integer getMatchId() {
        return matchId;
    }

    /**
     * @param matchId
     *            the matchId to set
     */
    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "GameProgress [TBL_NAME=" + TBL_NAME + ", INSERT_SQL_QUERY=" + INSERT_SQL_QUERY + ", UPDATE_SQL_QUERY="
                + UPDATE_SQL_QUERY + ", DELETE_SQL_QUERY=" + DELETE_SQL_QUERY + ", INSERT_SQL_QUERY_V=" + INSERT_SQL_QUERY_V
                + ", id=" + id + ", matchId=" + matchId + ", position=" + position + "]";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((DELETE_SQL_QUERY == null) ? 0 : DELETE_SQL_QUERY.hashCode());
        result = prime * result + ((INSERT_SQL_QUERY == null) ? 0 : INSERT_SQL_QUERY.hashCode());
        result = prime * result + ((INSERT_SQL_QUERY_V == null) ? 0 : INSERT_SQL_QUERY_V.hashCode());
        result = prime * result + ((TBL_NAME == null) ? 0 : TBL_NAME.hashCode());
        result = prime * result + ((UPDATE_SQL_QUERY == null) ? 0 : UPDATE_SQL_QUERY.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((matchId == null) ? 0 : matchId.hashCode());
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        return result;
    }

    /* (non-Javadoc)
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
        if (!(obj instanceof GameProgress)) {
            return false;
        }
        GameProgress other = (GameProgress) obj;
        if (DELETE_SQL_QUERY == null) {
            if (other.DELETE_SQL_QUERY != null) {
                return false;
            }
        } else if (!DELETE_SQL_QUERY.equals(other.DELETE_SQL_QUERY)) {
            return false;
        }
        if (INSERT_SQL_QUERY == null) {
            if (other.INSERT_SQL_QUERY != null) {
                return false;
            }
        } else if (!INSERT_SQL_QUERY.equals(other.INSERT_SQL_QUERY)) {
            return false;
        }
        if (INSERT_SQL_QUERY_V == null) {
            if (other.INSERT_SQL_QUERY_V != null) {
                return false;
            }
        } else if (!INSERT_SQL_QUERY_V.equals(other.INSERT_SQL_QUERY_V)) {
            return false;
        }
        if (TBL_NAME == null) {
            if (other.TBL_NAME != null) {
                return false;
            }
        } else if (!TBL_NAME.equals(other.TBL_NAME)) {
            return false;
        }
        if (UPDATE_SQL_QUERY == null) {
            if (other.UPDATE_SQL_QUERY != null) {
                return false;
            }
        } else if (!UPDATE_SQL_QUERY.equals(other.UPDATE_SQL_QUERY)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (matchId == null) {
            if (other.matchId != null) {
                return false;
            }
        } else if (!matchId.equals(other.matchId)) {
            return false;
        }
        if (position == null) {
            if (other.position != null) {
                return false;
            }
        } else if (!position.equals(other.position)) {
            return false;
        }
        return true;
    }



  
}
