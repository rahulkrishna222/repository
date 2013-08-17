package com.grandmaster.db.entity;

public class GameRule {

    private Integer id;
    private String  element;
    private String  description;
    private String  possible_steps;

    public GameRule() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param id
     * @param element
     * @param description
     * @param possible_steps
     */
    public GameRule(Integer id, String element, String description, String possible_steps) {
        this.id = id;
        this.element = element;
        this.description = description;
        this.possible_steps = possible_steps;
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
     * @return the element
     */
    public String getElement() {
        return element;
    }

    /**
     * @param element
     *            the element to set
     */
    public void setElement(String element) {
        this.element = element;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the possible_steps
     */
    public String getPossible_steps() {
        return possible_steps;
    }

    /**
     * @param possible_steps
     *            the possible_steps to set
     */
    public void setPossible_steps(String possible_steps) {
        this.possible_steps = possible_steps;
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
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((element == null) ? 0 : element.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((possible_steps == null) ? 0 : possible_steps.hashCode());
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
        if (!(obj instanceof GameRule)) {
            return false;
        }
        GameRule other = (GameRule) obj;
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (element == null) {
            if (other.element != null) {
                return false;
            }
        } else if (!element.equals(other.element)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (possible_steps == null) {
            if (other.possible_steps != null) {
                return false;
            }
        } else if (!possible_steps.equals(other.possible_steps)) {
            return false;
        }
        return true;
    }

}
