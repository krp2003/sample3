package com.wecp.financial_seminar_and_workshop_management.repository;


import com.wecp.financial_seminar_and_workshop_management.entity.Feedback;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
    List<Feedback> findByEventId(Long eventId);
}
