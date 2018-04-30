package com.depromeet.present.service;

import com.depromeet.present.entity.PresentEntity;
import com.depromeet.present.model.Present;
import com.depromeet.present.repository.PresentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PresentServiceImpl implements PresentService {
    @Autowired
    private PresentRepository presentRepository;

    @Override
    public Integer createPresent(Present present) {
        PresentEntity presentEntity = present.toPresentEntity();
        presentRepository.save(presentEntity);
        return presentEntity.getId();
    }

    @Override
    public Optional<Present> getPresentById(Integer id) {
        return Optional.ofNullable(presentRepository.getOne(id))
                .map(PresentEntity::toPresent);
    }

    @Override
    public List<Present> getPresents() {
        return presentRepository.findAll().stream()
                .map(PresentEntity::toPresent)
                .collect(Collectors.toList());
    }
}
