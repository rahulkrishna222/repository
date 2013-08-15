package com.grandmaster.db.entity;

import java.sql.Timestamp;

public class FeedbackReply {

	private final String FEEDBACK_TBL_NAME = "feedback_reply";

	private final String INSERT_SQL_QUERY = "INSERT INTO "
			+ FEEDBACK_TBL_NAME
			+ "('id','feedback_id', 'replied_by','reply_message','time_of_reply','modification_time') VALUES ( ";
	
	private final String UPDATE_SQL_QUERY = "UPDATE feedback_reply SET ";
	
	private final String DELETE_SQL_QUERY = "DELETE FROM feedback_reply where ";

	private Integer id;
	private Integer feedbackId;
	private Integer repliedByUser;
	private Integer reponse;
	private Timestamp timeOfReply;
	private Timestamp modificationTime;

	public FeedbackReply() {
		// Default constructor
	}

	/**
	 * @param id
	 * @param feedbackId
	 * @param repliedByUser
	 * @param reponse
	 * @param timeOfReply
	 * @param modificationTime
	 */
	public FeedbackReply(Integer id, Integer feedbackId, Integer repliedByUser,
			Integer reponse, Timestamp timeOfReply, Timestamp modificationTime) {
		this.id = id;
		this.feedbackId = feedbackId;
		this.repliedByUser = repliedByUser;
		this.reponse = reponse;
		this.timeOfReply = timeOfReply;
		this.modificationTime = modificationTime;
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
	 * @return the feedbackId
	 */
	public Integer getFeedbackId() {
		return feedbackId;
	}

	/**
	 * @param feedbackId
	 *            the feedbackId to set
	 */
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	/**
	 * @return the repliedByUser
	 */
	public Integer getRepliedByUser() {
		return repliedByUser;
	}

	/**
	 * @param repliedByUser
	 *            the repliedByUser to set
	 */
	public void setRepliedByUser(Integer repliedByUser) {
		this.repliedByUser = repliedByUser;
	}

	/**
	 * @return the reponse
	 */
	public Integer getReponse() {
		return reponse;
	}

	/**
	 * @param reponse
	 *            the reponse to set
	 */
	public void setReponse(Integer reponse) {
		this.reponse = reponse;
	}

	/**
	 * @return the timeOfReply
	 */
	public Timestamp getTimeOfReply() {
		return timeOfReply;
	}

	/**
	 * @param timeOfReply
	 *            the timeOfReply to set
	 */
	public void setTimeOfReply(Timestamp timeOfReply) {
		this.timeOfReply = timeOfReply;
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
		String query = INSERT_SQL_QUERY;

		// Update values
		query += "null" + FIELD_SEP;
		query += this.getFeedbackId() + FIELD_SEP;
		query += this.getRepliedByUser() + FIELD_SEP;
		query += this.getReponse() + FIELD_SEP;
		query += this.getTimeOfReply() + FIELD_SEP;
		query += this.getModificationTime();
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
		result = prime * result
				+ ((feedbackId == null) ? 0 : feedbackId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((modificationTime == null) ? 0 : modificationTime.hashCode());
		result = prime * result
				+ ((repliedByUser == null) ? 0 : repliedByUser.hashCode());
		result = prime * result + ((reponse == null) ? 0 : reponse.hashCode());
		result = prime * result
				+ ((timeOfReply == null) ? 0 : timeOfReply.hashCode());
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
		if (!(obj instanceof FeedbackReply)) {
			return false;
		}
		FeedbackReply other = (FeedbackReply) obj;
		if (feedbackId == null) {
			if (other.feedbackId != null) {
				return false;
			}
		} else if (!feedbackId.equals(other.feedbackId)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (modificationTime == null) {
			if (other.modificationTime != null) {
				return false;
			}
		} else if (!modificationTime.equals(other.modificationTime)) {
			return false;
		}
		if (repliedByUser == null) {
			if (other.repliedByUser != null) {
				return false;
			}
		} else if (!repliedByUser.equals(other.repliedByUser)) {
			return false;
		}
		if (reponse == null) {
			if (other.reponse != null) {
				return false;
			}
		} else if (!reponse.equals(other.reponse)) {
			return false;
		}
		if (timeOfReply == null) {
			if (other.timeOfReply != null) {
				return false;
			}
		} else if (!timeOfReply.equals(other.timeOfReply)) {
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
		return "FeedbackReply [id=" + id + ", feedbackId=" + feedbackId
				+ ", repliedByUser=" + repliedByUser + ", reponse=" + reponse
				+ ", timeOfReply=" + timeOfReply + ", modificationTime="
				+ modificationTime + "]";
	}

}
