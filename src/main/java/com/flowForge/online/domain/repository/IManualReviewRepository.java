package com.flowforge.online.domain.repository;

import com.flowforge.online.infrastructure.persistence.entity.ManualReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IManualReviewRepository extends JpaRepository<ManualReviewEntity, UUID> {

}
