package com.flowforge.online.infrastructure.persistence.repository;

import com.flowforge.online.infrastructure.persistence.entity.RiskAnalysisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRiskJpaRepositoryAnalysis extends JpaRepository<RiskAnalysisEntity, UUID> {

}
