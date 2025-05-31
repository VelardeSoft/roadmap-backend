package com.roadmap.demo.domain.repositories;

import com.roadmap.demo.domain.model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StageRepository extends JpaRepository<Stage, Long> {
    List<Stage> findByRoadmapId(Long roadmapId);
}
