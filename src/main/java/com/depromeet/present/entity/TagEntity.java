package com.depromeet.present.entity;

import javax.persistence.*;

@Entity
@Table(name = "tag")
public class TagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tag_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "post_id")
    private Integer postId;
}
