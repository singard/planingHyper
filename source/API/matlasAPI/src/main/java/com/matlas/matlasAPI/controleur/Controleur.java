package com.matlas.matlasAPI.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.matlas.matlasAPI.classe.Classe;
import com.matlas.matlasAPI.classe.Matiere;
import com.matlas.matlasAPI.classe.Role;
import com.matlas.matlasAPI.classe.User;
import com.matlas.matlasAPI.repositorys.ClasseRepository;
import com.matlas.matlasAPI.repositorys.MatiereRepository;
import com.matlas.matlasAPI.repositorys.PlanningRepository;
import com.matlas.matlasAPI.repositorys.RoleRepository;
import com.matlas.matlasAPI.repositorys.UserRepository;

@RestController
public class Controleur {
	@Autowired
	MatiereRepository repoMatiere;
	@Autowired
	RoleRepository repoRole;
	@Autowired
	ClasseRepository repoClasse;
	@Autowired
	UserRepository repoUser;
	@Autowired
	PlanningRepository repoPlanning;
	
	
	
	@GetMapping(value="/matlas/planning/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Matiere> planninge(@PathVariable int idPlanning) {		 
        return repoMatiere.findAll(); 
    }
	
	@GetMapping(value="/matlas/matieres", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Matiere> listMatiere() {		 
        return repoMatiere.findAll(); 
    }
	
	@GetMapping(value="/matlas/role", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Role> listRole() {		 
        return repoRole.findAll();
    }
	
	@GetMapping(value="/matlas/classe", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Classe> listClasse() {		 
        return repoClasse.findAll();
    }
	
	@GetMapping(value="/matlas/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> listUser() {		 
        return repoUser.findAll();
    }
	
	@GetMapping(value="/matlas/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {		 
        return "hello";
    }

}
