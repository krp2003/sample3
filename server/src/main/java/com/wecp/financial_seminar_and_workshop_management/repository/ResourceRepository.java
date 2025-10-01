package com.wecp.financial_seminar_and_workshop_management.repository;

import com.wecp.financial_seminar_and_workshop_management.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.List;

public interface ResourceRepository  {
// implement repository
=======

public interface ResourceRepository extends JpaRepository<Resource, Long>{
>>>>>>> 8f26cd5563b728585b36a8b23aca74cdc449960d
}
