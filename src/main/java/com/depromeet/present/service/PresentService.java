package com.depromeet.present.service;

import com.depromeet.present.entity.PresentEntity;
import com.depromeet.present.model.Present;

import java.util.List;
import java.util.Optional;

public interface PresentService {
    Integer createPresent(Present present);
    Optional<Present> getPresentById(Integer id);
    List<Present> getPresents();
}
