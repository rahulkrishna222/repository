package com.grandmaster.db.entity;

public class GameProgress {

    private Integer id;
    private Integer matchId;
    private String  opponentAPosition;
    private String  opponentBPosition;

    public GameProgress() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param id
     * @param matchId
     * @param opponentAPosition
     * @param opponentBPosition
     */
    public GameProgress(Integer id, Integer matchId, String opponentAPosition, String opponentBPosition) {
        this.id = id;
        this.matchId = matchId;
        this.opponentAPosition = opponentAPosition;
        this.opponentBPosition = opponentBPosition;
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
     * @return the opponentAPosition
     */
    public String getOpponentAPosition() {
        return opponentAPosition;
    }

    /**
     * @param opponentAPosition
     *            the opponentAPosition to set
     */
    public void setOpponentAPosition(String opponentAPosition) {
        this.opponentAPosition = opponentAPosition;
    }

    /**
     * @return the opponentBPosition
     */
    public String getOpponentBPosition() {
        return opponentBPosition;
    }

    /**
     * @param opponentBPosition
     *            the opponentBPosition to set
     */
    public void setOpponentBPosition(String opponentBPosition) {
        this.opponentBPosition = opponentBPosition;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "GameProgress [id=" + id + ", matchId=" + matchId + ", opponentAPosition=" + opponentAPosition
                + ", opponentBPosition=" + opponentBPosition + "]";
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
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((matchId == null) ? 0 : matchId.hashCode());
        result = prime * result + ((opponentAPosition == null) ? 0 : opponentAPosition.hashCode());
        result = prime * result + ((opponentBPosition == null) ? 0 : opponentBPosition.hashCode());
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
        if (!(obj instanceof GameProgress)) {
            return false;
        }
        GameProgress other = (GameProgress) obj;
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
        if (opponentAPosition == null) {
            if (other.opponentAPosition != null) {
                return false;
            }
        } else if (!opponentAPosition.equals(other.opponentAPosition)) {
            return false;
        }
        if (opponentBPosition == null) {
            if (other.opponentBPosition != null) {
                return false;
            }
        } else if (!opponentBPosition.equals(other.opponentBPosition)) {
            return false;
        }
        return true;
    }

}
