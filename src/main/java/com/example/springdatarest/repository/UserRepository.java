package com.example.springdatarest.repository;

import com.example.springdatarest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "members")
public interface UserRepository extends JpaRepository<User, Long> {
}
