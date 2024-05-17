package com.savingsplanner.savingsplanner.controller;

import com.savingsplanner.savingsplanner.exception.PlanNotFoundException;
import com.savingsplanner.savingsplanner.model.Plan;
import com.savingsplanner.savingsplanner.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")

public class PlanController {
        @Autowired
        private PlanRepository planRepository;

        @PostMapping("/plan")
        Plan newUser(@RequestBody Plan newPlan){
         return planRepository.save(newPlan);
        }

        @GetMapping("/plans")
        List<Plan> getAllPlan(){
            return planRepository.findAll();
        }


        @GetMapping("/plan/{id}")
        Plan getPlanById(@PathVariable Long id){
            return planRepository.findById(id)
                    .orElseThrow(()->new PlanNotFoundException(id));
        }

        @PutMapping("/plan/{id}")
        Plan updatePlan(@RequestBody Plan newPlan, @PathVariable Long id){
            return planRepository.findById(id)
                    .map(plan->{
                        plan.setTitle(newPlan.getTitle());
                        plan.setDescription(newPlan.getDescription());
                        plan.setImageUrl(newPlan.getImageUrl());
                        plan.setTargetedAmount(newPlan.getTargetedAmount());
                        plan.setCurrentAmount(newPlan.getCurrentAmount());
                        plan.setTargetedDate(newPlan.getTargetedDate());
                        return planRepository.save(plan);
                    }).orElseThrow(()->new PlanNotFoundException(id));
        }

        @DeleteMapping("/plan/{id}")
        String deletePlan(@PathVariable Long id){
            if(!planRepository.existsById(id)){
                throw new PlanNotFoundException(id);
            }
            planRepository.deleteById(id);

            return "Plan with id" + id + "has been deleted successfully.";
        }




}
