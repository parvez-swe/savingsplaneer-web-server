package com.savingsplanner.savingsplanner.repository;

import com.savingsplanner.savingsplanner.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan,Long> {
}
