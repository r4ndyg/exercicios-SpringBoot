package com.api.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.api.exerciciossb.model.entities.Produto;

@Repository
public interface ProdutoRepository 
	extends PagingAndSortingRepository<Produto, Integer>{
	
	public Iterable<Produto> findyByNomeContaining(String parteNome);

}
