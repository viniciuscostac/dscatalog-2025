//CAMADA DE ACESSO A DADOS - UTILIZADO PARA CONECTAR AOS BANCOS DE DADOS

package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Category;

@Repository //serve para dizer que é um componente injetavel do mecanismo de dependencia do spring
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
