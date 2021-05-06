package com.matlas.matlasAPI.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matlas.matlasAPI.classe.Matiere;
import com.matlas.matlasAPI.classe.Repository;

@RestController
public class Controleur {
	@Autowired
	Repository repo;
	
	@GetMapping(value="/matlas/matieres", produces = MediaType.APPLICATION_JSON_VALUE)
    public Matiere listMatiere() {		 
        return repo.findById(1);
    }
	
	@GetMapping(value="/matlas/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {		 
        return "hello";
    }

}
