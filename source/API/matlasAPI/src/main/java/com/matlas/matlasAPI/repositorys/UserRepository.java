package com.matlas.matlasAPI.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matlas.matlasAPI.classe.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
    User findById(int id);
//    User findByPseudo(String pseudo);
    List<User> findAll();
   

}
