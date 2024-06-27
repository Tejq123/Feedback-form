package com.example.backend.repository;

import com.example.backend.model.FeedbackForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackFormRepository extends JpaRepository<FeedbackForm, Long> {
	
}

