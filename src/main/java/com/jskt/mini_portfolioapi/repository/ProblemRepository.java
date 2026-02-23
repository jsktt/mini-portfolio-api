package com.jskt.mini_portfolioapi.repository;


import com.jskt.mini_portfolioapi.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
    List<Problem> findAllByOrderByCreatedAtDesc();
}