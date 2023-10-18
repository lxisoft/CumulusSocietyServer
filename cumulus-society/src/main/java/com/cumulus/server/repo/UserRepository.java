package com.cumulus.server.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cumulus.server.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>  {
    
}