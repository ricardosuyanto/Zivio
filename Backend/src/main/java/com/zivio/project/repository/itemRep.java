package com.zivio.project.repository;

import com.zivio.project.model.item;

import org.springframework.data.repository.CrudRepository;

public interface itemRep extends CrudRepository<item, Long> {
}
