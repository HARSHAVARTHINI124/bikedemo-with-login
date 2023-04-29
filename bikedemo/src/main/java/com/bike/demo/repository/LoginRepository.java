package com.bike.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bike.demo.model.LoginDemoModel;



@Repository
public interface LoginRepository extends JpaRepository<LoginDemoModel,Integer>{

}
