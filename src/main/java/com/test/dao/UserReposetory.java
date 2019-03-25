package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.domain.User;

public interface UserReposetory extends JpaRepository<User, String> {

}
