package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class demoentity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sn;
	private String name;

}
