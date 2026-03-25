package com.flowforge.online.infrastructure.persistence;

import com.flowforge.online.domain.enums.RiskLevel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Table(name = "riskAnalysis")
@Entity
@Getter
@Setter
public class RiskAnalysisEntity {

    @Id
    private UUID id;

    @Column(name = "onboardingRequestId")
    private UUID onboardingRequestId;

    @Column(name = "score")
    private int score;

    @Column(name = "level")
    private RiskLevel level;

    @Column(name = "provider")
    private String provider;

    @Transient
    private Instant analyzedAt;
}
