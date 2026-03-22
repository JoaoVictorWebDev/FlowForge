package com.flowForge.online.domain.model;

import com.flowForge.online.domain.enums.RiskLevel;

import java.time.Instant;
import java.util.UUID;

public class RiskAnalysis {
    private UUID id;
    private UUID onboardingRequestId;
    private int score;
    private RiskLevel level;
    private String provider;
    private Instant analyzedAt;

}
