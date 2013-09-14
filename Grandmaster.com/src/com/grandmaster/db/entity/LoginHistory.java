package com.grandmaster.db.entity;

import java.sql.Timestamp;

public class LoginHistory {

    private final String TBL_NAME = "login_history";

    private final String INSERT_SQL_QUERY = "INSERT INTO " + TBL_NAME + "(id,user_id,last_logged_in_time,machine_ip) VALUES ( ";
	
    private final String UPDATE_SQL_QUERY = "UPDATE " + TBL_NAME + " SET ";
	
    private final String DELETE_SQL_QUERY = "DELETE FROM " + TBL_NAME + " where ";

    private final String INSERT_SQL_QUERY_V = "INSERT INTO " + TBL_NAME + "(id,user_id,last_logged_in_time,machine_ip) VALUES (null,?,?,?)";
    
    private Integer   id;
    private Integer   userId;
    private String    machineIp;
    private Timestamp lastLoggedInTime;

    public LoginHistory() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param id
     * @param userId
     * @param machineIp
     * @param lastLoggedInTime
     */
    public LoginHistory(Integer id, Integer userId, String machineIp, Timestamp lastLoggedInTime) {
        this.id = id;
        this.userId = userId;
        this.machineIp = machineIp;
        this.lastLoggedInTime = lastLoggedInTime;
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
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     *            the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return the machineIp
     */
    public String getMachineIp() {
        return machineIp;
    }

    /**
     * @param machineIp
     *            the machineIp to set
     */
    public void setMachineIp(String machineIp) {
        this.machineIp = machineIp;
    }

    /**
     * @return the lastLoggedInTime
     */
    public Timestamp getLastLoggedInTime() {
        return lastLoggedInTime;
    }

    /**
     * @param lastLoggedInTime
     *            the lastLoggedInTime to set
     */
    public void setLastLoggedInTime(Timestamp lastLoggedInTime) {
        this.lastLoggedInTime = lastLoggedInTime;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "LoginHistory [id=" + id + ", userId=" + userId + ", machineIp=" + machineIp + ", lastLoggedInTime="
                + lastLoggedInTime + "]";
    }
    
    public String getInsertStatement() {
		final String FIELD_SEP = " , ";
		final String FIELD_QUO = "'";
		String query = INSERT_SQL_QUERY;

		// Update values
		query += "null" + FIELD_SEP;
		query += this.getUserId() + FIELD_SEP;
		query += FIELD_QUO + this.getLastLoggedInTime() + FIELD_QUO + FIELD_SEP;
		query += FIELD_QUO + this.getMachineIp() + FIELD_QUO;
		return query + " );";
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
        result = prime * result + ((lastLoggedInTime == null) ? 0 : lastLoggedInTime.hashCode());
        result = prime * result + ((machineIp == null) ? 0 : machineIp.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
        if (!(obj instanceof LoginHistory)) {
            return false;
        }
        LoginHistory other = (LoginHistory) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (lastLoggedInTime == null) {
            if (other.lastLoggedInTime != null) {
                return false;
            }
        } else if (!lastLoggedInTime.equals(other.lastLoggedInTime)) {
            return false;
        }
        if (machineIp == null) {
            if (other.machineIp != null) {
                return false;
            }
        } else if (!machineIp.equals(other.machineIp)) {
            return false;
        }
        if (userId == null) {
            if (other.userId != null) {
                return false;
            }
        } else if (!userId.equals(other.userId)) {
            return false;
        }
        return true;
    }

}
