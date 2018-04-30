package com.depromeet.present.entity;

import javax.persistence.*;

@Entity
@Table(name = "recommendation")
public class RecommendationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "recommendation_id")
    private Integer id;

    @ManyToOne(targetEntity = TagEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private TagEntity tagEntity;

    @ManyToOne(targetEntity = PresentEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "present_id")
    private PresentEntity presentEntity;
}
