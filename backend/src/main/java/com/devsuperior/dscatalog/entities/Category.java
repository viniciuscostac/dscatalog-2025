//é utilizada para informar que uma classe também é uma entidade. 
//A partir disso, a JPA estabelecerá a ligação entre a entidade e uma tabela de mesmo nome no banco de dados, 
//onde os dados de objetos desse tipo poderão ser persistidos.

package com.devsuperior.dscatalog.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //definir que é uma entidade
@Table(name = "tb_category") //vincula a uma tabela no BD
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id //define que é um ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementa o ID, segue a fila (1,2,3,etc)
	private Long id;
	private String name;
	
	public Category() {
		
	}

	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
	
}
