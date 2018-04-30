package com.depromeet.present.entity;


import com.depromeet.present.model.Present;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "present")
@Builder
@Getter
public class PresentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "present_id")
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "link")
    private String link;

    public Present toPresent() {
        return Present.builder()
                .name(name)
                .description(description)
                .link(link)
                .build();
    }
}
