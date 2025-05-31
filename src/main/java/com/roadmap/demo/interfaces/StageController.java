package com.roadmap.demo.interfaces;

import com.roadmap.demo.application.StageService;
import com.roadmap.demo.domain.model.Stage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stages")
public class StageController {
    private final StageService stageService;

    public StageController(StageService stageService) {
        this.stageService = stageService;
    }

    @GetMapping("/roadmap/{roadmapId}")
    public List<Stage> getByRoadmap(@PathVariable Long roadmapId) {
        return stageService.findByRoadmapId(roadmapId);
    }

    @PostMapping
    public Stage create(@RequestBody Stage stage) {
        return stageService.save(stage);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        stageService.delete(id);
    }
}
