package com.grandmaster.db.entity;

import java.sql.Timestamp;

public class UserProfile {

    public final static String TBL_NAME           = "user_profile";

    public final static String INSERT_SQL_QUERY   = "INSERT INTO "
                                                          + TBL_NAME
                                                          + "(id,first_name,last_name,dob,email,address1,address2,city,state,zip,country,mobile_number,home_number,creation_time,modification_time,is_admin) VALUES ( ";

    public final static String UPDATE_SQL_QUERY   = "UPDATE " + TBL_NAME + " SET ";

    public final static String DELETE_SQL_QUERY   = "DELETE FROM " + TBL_NAME + " where ";

    public final static String INSERT_SQL_QUERY_V = "INSERT INTO "
                                                          + TBL_NAME
                                                          + "(id,first_name,last_name,dob,email,address1,address2,city,state,zip,country,mobile_number,home_number,creation_time,modification_time,is_admin) VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    private Integer            userId;
    private String             firstName;
    private String             lastName;
    private Timestamp          dob;
    private String             email;
    private String             address1;
    private String             address2;
    private String             city;
    private String             state;
    private String             zipCode;
    private String             country;
    private Long               mobileNumber;
    private Long               homeNumber;
    private char               isAdmin;
    private Timestamp          creationTime;
    private Timestamp          modificationTime;

    public UserProfile() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param userId
     * @param firstName
     * @param lastName
     * @param dob
     * @param email
     * @param address1
     * @param address2
     * @param city
     * @param state
     * @param zipCode
     * @param country
     * @param mobileNumber
     * @param homeNumber
     * @param isAdmin
     * @param creationTime
     * @param modificationTime
     */
    public UserProfile(Integer userId, String firstName, String lastName, Timestamp dob, String email, String address1,
            String address2, String city, String state, String zipCode, String country, Long mobileNumber, Long homeNumber,
            char isAdmin, Timestamp creationTime, Timestamp modificationTime) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.mobileNumber = mobileNumber;
        this.homeNumber = homeNumber;
        this.isAdmin = isAdmin;
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dob
     */
    public Timestamp getDob() {
        return dob;
    }

    /**
     * @param dob
     *            the dob to set
     */
    public void setDob(Timestamp dob) {
        this.dob = dob;
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
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1
     *            the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2
     *            the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     *            the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode
     *            the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the mobileNumber
     */
    public Long getMobileNumber() {
        return mobileNumber;
    }

    /**
     * @param mobileNumber
     *            the mobileNumber to set
     */
    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * @return the homeNumber
     */
    public Long getHomeNumber() {
        return homeNumber;
    }

    /**
     * @param homeNumber
     *            the homeNumber to set
     */
    public void setHomeNumber(Long homeNumber) {
        this.homeNumber = homeNumber;
    }

    /**
     * @return the isAdmin
     */
    public char getIsAdmin() {
        return isAdmin;
    }

    /**
     * @param isAdmin
     *            the isAdmin to set
     */
    public void setIsAdmin(char isAdmin) {
        this.isAdmin = isAdmin;
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
        query += FIELD_QUO + this.getFirstName() + FIELD_QUO + FIELD_SEP;
        query += FIELD_QUO + this.getLastName() + FIELD_QUO + FIELD_SEP;
        query += FIELD_QUO + this.getDob() + FIELD_QUO + FIELD_SEP;
        query += FIELD_QUO + this.getEmail() + FIELD_QUO + FIELD_SEP;
        query += FIELD_QUO + this.getCity() + FIELD_QUO + FIELD_SEP;
        query += FIELD_QUO + this.getState() + FIELD_QUO + FIELD_SEP;
        query += FIELD_QUO + this.getZipCode() + FIELD_QUO + FIELD_SEP;
        query += FIELD_QUO + this.getCountry() + FIELD_QUO + FIELD_SEP;
        query += this.getMobileNumber() + FIELD_SEP;
        query += this.getHomeNumber() + FIELD_SEP;
        query += FIELD_QUO + this.getCreationTime() + FIELD_QUO + FIELD_SEP;
        query += FIELD_QUO + this.getModificationTime() + FIELD_QUO + FIELD_SEP;
        query += FIELD_QUO + this.getIsAdmin() + FIELD_QUO;
        return query + " );";
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "UserProfile [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
                + ", email=" + email + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
                + ", zipCode=" + zipCode + ", country=" + country + ", mobileNumber=" + mobileNumber + ", homeNumber=" + homeNumber
                + ", isAdmin=" + isAdmin + ", creationTime=" + creationTime + ", modificationTime=" + modificationTime + "]";
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
        result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
        result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((creationTime == null) ? 0 : creationTime.hashCode());
        result = prime * result + ((dob == null) ? 0 : dob.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((homeNumber == null) ? 0 : homeNumber.hashCode());
        result = prime * result + isAdmin;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
        result = prime * result + ((modificationTime == null) ? 0 : modificationTime.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile other = (UserProfile) obj;
        if (address1 == null) {
            if (other.address1 != null) {
                return false;
            }
        } else if (!address1.equals(other.address1)) {
            return false;
        }
        if (address2 == null) {
            if (other.address2 != null) {
                return false;
            }
        } else if (!address2.equals(other.address2)) {
            return false;
        }
        if (city == null) {
            if (other.city != null) {
                return false;
            }
        } else if (!city.equals(other.city)) {
            return false;
        }
        if (country == null) {
            if (other.country != null) {
                return false;
            }
        } else if (!country.equals(other.country)) {
            return false;
        }
        if (creationTime == null) {
            if (other.creationTime != null) {
                return false;
            }
        } else if (!creationTime.equals(other.creationTime)) {
            return false;
        }
        if (dob == null) {
            if (other.dob != null) {
                return false;
            }
        } else if (!dob.equals(other.dob)) {
            return false;
        }
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        } else if (!firstName.equals(other.firstName)) {
            return false;
        }
        if (homeNumber == null) {
            if (other.homeNumber != null) {
                return false;
            }
        } else if (!homeNumber.equals(other.homeNumber)) {
            return false;
        }
        if (isAdmin != other.isAdmin) {
            return false;
        }
        if (lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        } else if (!lastName.equals(other.lastName)) {
            return false;
        }
        if (mobileNumber == null) {
            if (other.mobileNumber != null) {
                return false;
            }
        } else if (!mobileNumber.equals(other.mobileNumber)) {
            return false;
        }
        if (modificationTime == null) {
            if (other.modificationTime != null) {
                return false;
            }
        } else if (!modificationTime.equals(other.modificationTime)) {
            return false;
        }
        if (state == null) {
            if (other.state != null) {
                return false;
            }
        } else if (!state.equals(other.state)) {
            return false;
        }
        if (userId == null) {
            if (other.userId != null) {
                return false;
            }
        } else if (!userId.equals(other.userId)) {
            return false;
        }
        if (zipCode == null) {
            if (other.zipCode != null) {
                return false;
            }
        } else if (!zipCode.equals(other.zipCode)) {
            return false;
        }
        return true;
    }

}
