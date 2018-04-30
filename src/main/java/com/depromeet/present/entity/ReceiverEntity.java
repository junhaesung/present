package com.depromeet.present.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "receiver")
public class ReceiverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Temporal(TemporalType.DATE)
    private Date anniversary;
}
