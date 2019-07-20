package com.dsrc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsrc.bean.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
