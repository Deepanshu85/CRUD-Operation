package com.tericcabrel.auth_api.repositories; // FIXED package name

import com.tericcabrel.auth_api.entities.User; // FIXED package name
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
