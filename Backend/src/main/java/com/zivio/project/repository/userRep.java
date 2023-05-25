package com.zivio.project.repository;

import com.zivio.project.model.Users;

import org.springframework.data.repository.CrudRepository;

public interface userRep extends CrudRepository<Users, Long> {
}
