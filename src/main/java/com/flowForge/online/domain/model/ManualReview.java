package com.flowForge.online.domain.model;

import com.flowForge.online.domain.enums.ReviewDecision;

import java.time.Instant;
import java.util.UUID;

public class ManualReview {
    private UUID id;
    private UUID onboardingRequestId;
    private String reviewer;
    private ReviewDecision decision;
    private String notes;
    private Instant reviewedAt;
}
