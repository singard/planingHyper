package com.matlas.matlasAPI.classe;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Planning {
	
	@Id
	@Column(name="id_planning")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id_planning;
	private Date dateDebut;


}
