package com.example.demo.controller;

import com.example.demo.entity.AbstractEntity;
import com.example.demo.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class AbstractController<E extends AbstractEntity, S extends CommonService<E>>
        implements CommonController<E> {
    private final S service;
    @Autowired
    protected AbstractController(S service) {
        this.service = service;
    }
    @Override
    public ResponseEntity<E> save(@RequestBody E entity) {
        return service.save(entity).map(ResponseEntity::ok)
                .orElseThrow(() -> new RuntimeException("Entity hasn't been saved"));
    }
}