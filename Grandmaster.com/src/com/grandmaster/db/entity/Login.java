package com.grandmaster.db.entity;

import java.sql.Timestamp;

public class Login {

    private final String TBL_NAME = "login";

    private final String INSERT_SQL_QUERY = "INSERT INTO " + TBL_NAME + "(id,username,password_hash,old_password_1,old_password_2,old_password_3,creation_time,modification_time,status) VALUES ( ";
	
    private final String UPDATE_SQL_QUERY = "UPDATE " + TBL_NAME + " SET ";
	
    private final String DELETE_SQL_QUERY = "DELETE FROM " + TBL_NAME + " where ";
    
    private final String INSERT_SQL_QUERY_V = "INSERT INTO " + TBL_NAME + "(id,username,password_hash,old_password_1,old_password_2,old_password_3,creation_time,modification_time,status) VALUES (null,?,?,?,?,?,?,?,?)";
    

    private Integer   userId;
    private String    email;
    private String    passwordHash;
    private String    oldPasswordHash1;
    private String    oldPasswordHash2;
    private String    oldPasswordHash3;
    private char      status;
    private Timestamp creationTime;
    private Timestamp modificationTime;

    public Login() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param userId
     * @param email
     * @param passwordHash
     * @param oldPasswordHash1
     * @param oldPasswordHash2
     * @param oldPasswordHash3
     * @param status
     * @param creationTime
     * @param modificationTime
     */
    public Login(Integer userId, String email, String passwordHash, String oldPasswordHash1, String oldPasswordHash2,
            String oldPasswordHash3, char status, Timestamp creationTime, Timestamp modificationTime) {
        this.userId = userId;
        this.email = email;
        this.passwordHash = passwordHash;
        this.oldPasswordHash1 = oldPasswordHash1;
        this.oldPasswordHash2 = oldPasswordHash2;
        this.oldPasswordHash3 = oldPasswordHash3;
        this.status = status;
        this.creationTime = creationTime;
        this.modificationTime = modificationTime;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the passwordHash
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * @param passwordHash
     *            the passwordHash to set
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * @return the oldPasswordHash1
     */
    public String getOldPasswordHash1() {
        return oldPasswordHash1;
    }

    /**
     * @param oldPasswordHash1
     *            the oldPasswordHash1 to set
     */
    public void setOldPasswordHash1(String oldPasswordHash1) {
        this.oldPasswordHash1 = oldPasswordHash1;
    }

    /**
     * @return the oldPasswordHash2
     */
    public String getOldPasswordHash2() {
        return oldPasswordHash2;
    }

    /**
     * @param oldPasswordHash2
     *            the oldPasswordHash2 to set
     */
    public void setOldPasswordHash2(String oldPasswordHash2) {
        this.oldPasswordHash2 = oldPasswordHash2;
    }

    /**
     * @return the oldPasswordHash3
     */
    public String getOldPasswordHash3() {
        return oldPasswordHash3;
    }

    /**
     * @param oldPasswordHash3
     *            the oldPasswordHash3 to set
     */
    public void setOldPasswordHash3(String oldPasswordHash3) {
        this.oldPasswordHash3 = oldPasswordHash3;
    }

    /**
     * @return the status
     */
    public char getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(char status) {
        this.status = status;
    }

    /**
     * @return the creationTime
     */
    public Timestamp getCreationTime() {
        return creationTime;
    }

    /**
     * @param creationTime
     *            the creationTime to set
     */
    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return the modificationTime
     */
    public Timestamp getModificationTime() {
        return modificationTime;
    }

    /**
     * @param modificationTime
     *            the modificationTime to set
     */
    public void setModificationTime(Timestamp modificationTime) {
        this.modificationTime = modificationTime;
    }
    
    public String getInsertStatement() {
		final String FIELD_SEP = " , ";
		final String FIELD_QUO = "'";
		String query = INSERT_SQL_QUERY;

		// Update values
		query += "null" + FIELD_SEP;
		query += this.getEmail() + FIELD_SEP;
		query += FIELD_QUO + this.getPasswordHash() + FIELD_QUO + FIELD_SEP;
		query += FIELD_QUO + this.getOldPasswordHash1() + FIELD_QUO + FIELD_SEP;
		query += FIELD_QUO + this.getOldPasswordHash2() + FIELD_QUO + FIELD_SEP;
		query += FIELD_QUO + this.getOldPasswordHash3() + FIELD_QUO + FIELD_SEP;
		query += FIELD_QUO + this.getCreationTime() + FIELD_QUO + FIELD_SEP;
		query += FIELD_QUO + this.getModificationTime() + FIELD_QUO + FIELD_SEP;
		query += FIELD_QUO + this.getStatus() + FIELD_QUO;
		return query + " );";
    }



    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Login [userId=" + userId + ", email=" + email + ", passwordHash=" + passwordHash + ", oldPasswordHash1="
                + oldPasswordHash1 + ", oldPasswordHash2=" + oldPasswordHash2 + ", oldPasswordHash3=" + oldPasswordHash3
                + ", status=" + status + ", creationTime=" + creationTime + ", modificationTime=" + modificationTime + "]";
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
        result = prime * result + ((creationTime == null) ? 0 : creationTime.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((modificationTime == null) ? 0 : modificationTime.hashCode());
        result = prime * result + ((oldPasswordHash1 == null) ? 0 : oldPasswordHash1.hashCode());
        result = prime * result + ((oldPasswordHash2 == null) ? 0 : oldPasswordHash2.hashCode());
        result = prime * result + ((oldPasswordHash3 == null) ? 0 : oldPasswordHash3.hashCode());
        result = prime * result + ((passwordHash == null) ? 0 : passwordHash.hashCode());
        result = prime * result + status;
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
        if (!(obj instanceof Login)) {
            return false;
        }
        Login other = (Login) obj;
        if (creationTime == null) {
            if (other.creationTime != null) {
                return false;
            }
        } else if (!creationTime.equals(other.creationTime)) {
            return false;
        }
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (modificationTime == null) {
            if (other.modificationTime != null) {
                return false;
            }
        } else if (!modificationTime.equals(other.modificationTime)) {
            return false;
        }
        if (oldPasswordHash1 == null) {
            if (other.oldPasswordHash1 != null) {
                return false;
            }
        } else if (!oldPasswordHash1.equals(other.oldPasswordHash1)) {
            return false;
        }
        if (oldPasswordHash2 == null) {
            if (other.oldPasswordHash2 != null) {
                return false;
            }
        } else if (!oldPasswordHash2.equals(other.oldPasswordHash2)) {
            return false;
        }
        if (oldPasswordHash3 == null) {
            if (other.oldPasswordHash3 != null) {
                return false;
            }
        } else if (!oldPasswordHash3.equals(other.oldPasswordHash3)) {
            return false;
        }
        if (passwordHash == null) {
            if (other.passwordHash != null) {
                return false;
            }
        } else if (!passwordHash.equals(other.passwordHash)) {
            return false;
        }
        if (status != other.status) {
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
