package com.depromeet.present.repository;

import com.depromeet.present.entity.PresentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PresentRepository extends JpaRepository<PresentEntity, Integer> {
    PresentEntity getOne(Integer id);
    List<PresentEntity> findAll();
    List<PresentEntity> findByName(String name);
}
