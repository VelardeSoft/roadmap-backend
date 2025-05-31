package com.roadmap.demo.interfaces;

import com.roadmap.demo.application.RoadmapService;
import com.roadmap.demo.domain.model.Roadmap;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/roadmaps")
public class RoadmapController {
    private final RoadmapService roadmapService;

    public RoadmapController(RoadmapService roadmapService) {
        this.roadmapService = roadmapService;
    }

    @GetMapping
    public List<Roadmap> getAll() {
        return roadmapService.findAll();
    }

    @GetMapping("/{id}")
    public Roadmap getById(@PathVariable Long id) {
        return roadmapService.findById(id).orElseThrow();
    }

    @PostMapping
    public Roadmap create(@RequestBody Roadmap roadmap) {
        return roadmapService.save(roadmap);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        roadmapService.delete(id);
    }
}
