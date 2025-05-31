package com.roadmap.demo.domain.repositories;

import com.roadmap.demo.domain.model.Roadmap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoadmapRepository extends JpaRepository<Roadmap, Long> {
}
