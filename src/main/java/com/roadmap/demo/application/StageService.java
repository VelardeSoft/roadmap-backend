package com.roadmap.demo.application;

import com.roadmap.demo.domain.model.Stage;
import com.roadmap.demo.domain.repositories.StageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StageService {
    private final StageRepository stageRepository;

    public StageService(StageRepository stageRepository) {
        this.stageRepository = stageRepository;
    }

    public List<Stage> findByRoadmapId(Long roadmapId) {
        return stageRepository.findByRoadmapId(roadmapId);
    }

    public Optional<Stage> findById(Long id) {
        return stageRepository.findById(id);
    }

    public Stage save(Stage stage) {
        return stageRepository.save(stage);
    }

    public void delete(Long id) {
        stageRepository.deleteById(id);
    }
}
