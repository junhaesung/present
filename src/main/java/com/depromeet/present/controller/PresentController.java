package com.depromeet.present.controller;

import com.depromeet.present.entity.PresentEntity;
import com.depromeet.present.model.Present;
import com.depromeet.present.model.RequestedPresent;
import com.depromeet.present.service.PresentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PresentController {
    @Autowired
    private PresentService presentService;

    @RequestMapping(value = "/api/presents", method = RequestMethod.POST)
    public ResponseEntity<String> createPresent(@RequestBody RequestedPresent requestedPresent) {
        presentService.createPresent(requestedPresent.toPresent());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/presents/{presentId}", method = RequestMethod.GET)
    public Present getPresent(@PathVariable(name = "presentId") Integer presentId) {
        return presentService.getPresentById(presentId)
                .orElse(Present.builder().build());
    }
}
