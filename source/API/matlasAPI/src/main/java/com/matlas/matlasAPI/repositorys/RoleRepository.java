package com.matlas.matlasAPI.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matlas.matlasAPI.classe.Role;

public interface RoleRepository extends JpaRepository<Role,Integer>{
	
    Role findById(int id);
    List<Role> findAll();
   

}
