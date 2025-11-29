package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

@Service //registra a classe como um componente que vai participar do sistema de injecao de dependencia automatizado do spring
//significa que quem vai gerenciar as instancias das dependencias dos objetos tipo category service, será o spring
public class CategoryService {
	
	@Autowired //verificar o que faz
	private CategoryRepository repository; //serve para conectar a classe onde estao os itens do banco de dados para que o List
										  //definido abaixo, possa encontrar os dados.
	
	@Transactional(readOnly = true)
	public List <Category> findAll(){
		return repository.findAll();
		
	}

}
