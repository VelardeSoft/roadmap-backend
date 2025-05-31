package com.roadmap.demo.application;

import com.roadmap.demo.domain.model.Roadmap;
import com.roadmap.demo.domain.repositories.RoadmapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoadmapService {
    private final RoadmapRepository roadmapRepository;

    public RoadmapService(RoadmapRepository roadmapRepository) {
        this.roadmapRepository = roadmapRepository;
    }

    public List<Roadmap> findAll() {
        return roadmapRepository.findAll();
    }

    public Optional<Roadmap> findById(Long id) {
        return roadmapRepository.findById(id);
    }

    public Roadmap save(Roadmap roadmap) {
        return roadmapRepository.save(roadmap);
    }

    public void delete(Long id) {
        roadmapRepository.deleteById(id);
    }
}
