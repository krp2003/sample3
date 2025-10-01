package com.wecp.financial_seminar_and_workshop_management.repository;


import com.wecp.financial_seminar_and_workshop_management.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.List;

public interface FeedbackRepository {
    // implement repository
=======
public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
>>>>>>> 8f26cd5563b728585b36a8b23aca74cdc449960d
}
