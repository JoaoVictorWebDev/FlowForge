package com.flowforge.online.domain.model;

import java.time.Instant;
import java.util.UUID;

import com.flowforge.online.domain.enums.ReviewDecision;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class ManualReview {

    private UUID id;

    private UUID onboardingRequestId;

    private String reviewer;

    private ReviewDecision decision;

    private String notes;

    private Instant reviewedAt;
}
