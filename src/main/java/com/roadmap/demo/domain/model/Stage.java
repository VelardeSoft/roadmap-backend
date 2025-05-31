package com.roadmap.demo.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String video;

    @ManyToOne
    @JoinColumn(name = "roadmap_id")
    private Roadmap roadmap;
}
