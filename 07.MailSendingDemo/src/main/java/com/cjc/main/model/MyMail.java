package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MyMail {
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String toMail;
	private String subject;
	private String text;
}
