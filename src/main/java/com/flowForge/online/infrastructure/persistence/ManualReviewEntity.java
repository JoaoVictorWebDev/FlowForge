package com.flowforge.online.infrastructure.persistence;

import com.flowforge.online.domain.enums.ReviewDecision;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Table(name="manualReview")
@Entity
@Getter
@Setter
public class ManualReviewEntity {

    @Id
    private UUID id;

    @Column(name = "onboardingRequestId")
    private UUID onboardingRequestId;

    @Column(name = "reviewer")
    private String reviewer;

    @Enumerated(EnumType.STRING)
    private ReviewDecision decision;

    @Column(name = "notes")
    private String notes;

    @Transient
    private Instant reviewedAt;
}
