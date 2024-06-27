package com.example.backend.service;

import com.example.backend.model.FeedbackForm;
import com.example.backend.repository.FeedbackFormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackFormService {
    @Autowired
    FeedbackFormRepository feedbackFormRepository;
    @Autowired
    EmailService emailService;
    @Value("${admin.email}")
    private String adminEmail;
    @Transactional
    public FeedbackForm addFeedback(FeedbackForm feedbackForm) 
    {
    	  if (feedbackForm == null){
              throw new IllegalArgumentException("Feedback form cannot be null");
          }
        String subject = "New Feedback Submitted";
        String message = "A new feedback entry has been submitted.";
        //emailService.sendEmail(adminEmail, subject, message);
        return feedbackFormRepository.save(feedbackForm);
    }

    @Transactional
    public List<FeedbackForm> getAllFeedback(){
        return feedbackFormRepository.findAll();
    }
}
