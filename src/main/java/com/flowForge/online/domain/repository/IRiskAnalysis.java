package com.flowforge.online.domain.repository;

import com.flowforge.online.infrastructure.persistence.entity.RiskAnalysisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface IRiskAnalysis extends JpaRepository<RiskAnalysisEntity, UUID> {

}
