package com.grandmaster.db.entity;

import java.util.ArrayList;
import java.util.List;

public class FeedbackList {
    
    private List<Feedback> feedbackList = new ArrayList<>();

    /**
     * @return the feedbackList
     */
    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    /**
     * @param feedbackList the feedbackList to set
     */
    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }
    
    

}
