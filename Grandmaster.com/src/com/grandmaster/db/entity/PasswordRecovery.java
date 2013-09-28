package com.grandmaster.db.entity;

import java.sql.Timestamp;

public class PasswordRecovery {

    public final static String TBL_PASSWORD_RECOVERY = "password_recovery";

    public final static String INSERT_QUERY          = "insert into " + TBL_PASSWORD_RECOVERY
                                                              + "(id,userId, UUID, expiration_time) values (null,?,?,?)";

    private Integer             id;
    private Integer             userId;
    private String              UUID;
    private Timestamp           expirationTime;

    public PasswordRecovery() {
    }

    /**
     * @param id
     * @param userId
     * @param uUID
     * @param expirationTime
     */
    public PasswordRecovery(Integer id, Integer userId, String uUID, Timestamp expirationTime) {
        this.id = id;
        this.userId = userId;
        UUID = uUID;
        this.expirationTime = expirationTime;
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
     * @return the uUID
     */
    public String getUUID() {
        return UUID;
    }

    /**
     * @param uUID
     *            the uUID to set
     */
    public void setUUID(String uUID) {
        UUID = uUID;
    }

    /**
     * @return the expirationTime
     */
    public Timestamp getExpirationTime() {
        return expirationTime;
    }

    /**
     * @param expirationTime
     *            the expirationTime to set
     */
    public void setExpirationTime(Timestamp expirationTime) {
        this.expirationTime = expirationTime;
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
        result = prime * result + ((UUID == null) ? 0 : UUID.hashCode());
        result = prime * result + ((expirationTime == null) ? 0 : expirationTime.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        if (!(obj instanceof PasswordRecovery)) {
            return false;
        }
        PasswordRecovery other = (PasswordRecovery) obj;
        if (UUID == null) {
            if (other.UUID != null) {
                return false;
            }
        } else if (!UUID.equals(other.UUID)) {
            return false;
        }
        if (expirationTime == null) {
            if (other.expirationTime != null) {
                return false;
            }
        } else if (!expirationTime.equals(other.expirationTime)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PasswordRecovery [id=" + id + ", userId=" + userId + ", UUID=" + UUID + ", expirationTime=" + expirationTime + "]";
    }

}
