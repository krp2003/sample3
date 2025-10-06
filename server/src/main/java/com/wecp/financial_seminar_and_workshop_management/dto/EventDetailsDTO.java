package com.wecp.financial_seminar_and_workshop_management.dto;

import com.wecp.financial_seminar_and_workshop_management.entity.Event;
import com.wecp.financial_seminar_and_workshop_management.entity.Resource;
import com.wecp.financial_seminar_and_workshop_management.entity.Feedback;
import java.util.List;

public class EventDetailsDTO {

    private Event event;
    private List<Resource> resources;
    private List<Feedback> feedbacks;

    public EventDetailsDTO() {
    }

    public EventDetailsDTO(Event event, List<Resource> resources, List<Feedback> feedbacks) {
        this.event = event;
        this.resources = resources;
        this.feedbacks = feedbacks;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }
}