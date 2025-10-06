package com.wecp.financial_seminar_and_workshop_management.repository;

import com.wecp.financial_seminar_and_workshop_management.entity.Resource;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ResourceRepository extends JpaRepository<Resource, Long>{
    List<Resource> findByEventId(Long eventId);
}
