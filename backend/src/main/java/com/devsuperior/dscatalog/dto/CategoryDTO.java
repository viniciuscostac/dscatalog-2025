package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L; //entender serializable

	private Long id;
	private String name;
	
	//construtor, entender para que serve
	public CategoryDTO() {
	}
	
	//construtor, entender para que serve
	public CategoryDTO(Long id, String name) {
		super(); //entender para que serve o super
		this.id = id;
		this.name = name;
	}

	//construtor, entender para que serve
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName() ;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
