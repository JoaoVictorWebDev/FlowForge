package com.flowforge.online.domain.model;

import java.time.Instant;
import java.util.UUID;

import com.flowforge.online.domain.enums.RiskLevel;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class RiskAnalysis {

    private UUID id;

    private UUID onboardingRequestId;

    private int score;

    private RiskLevel level;

    private String provider;

    private Instant analyzedAt;

}
