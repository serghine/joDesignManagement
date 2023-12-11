package com.happy.alias.joDesignManageent.repositories;

import com.happy.alias.joDesignManageent.model.views.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRoleRepository extends CrudRepository<UserRole, Integer> {

    Iterable<UserRole> findAll();
    Optional<UserRole> findByUsername(String username);
}
