package com.example.backend.controller;

import com.example.backend.model.FeedbackForm;
import com.example.backend.service.FeedbackFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackFormController {

    private final FeedbackFormService feedbackFormService;

    @Autowired
    public FeedbackFormController(FeedbackFormService feedbackFormService) {
        this.feedbackFormService = feedbackFormService;
    }

    @PostMapping()
    public FeedbackForm addFeedback(@RequestBody FeedbackForm feedbackForm) {
        return feedbackFormService.addFeedback(feedbackForm);
    }

    @GetMapping()
    public List<FeedbackForm> getAllFeedback() {
        return feedbackFormService.getAllFeedback();
    }
}

