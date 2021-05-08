package com.matlas.matlasAPI.classe;

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
public class Role {
	@Id
	@Column(name="role")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private String role;
	


}
