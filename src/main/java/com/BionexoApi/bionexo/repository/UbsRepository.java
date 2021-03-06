package com.BionexoApi.bionexo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BionexoApi.bionexo.entitie.Ubs;

@Repository
public interface UbsRepository extends JpaRepository<Ubs, String>{
	
	Page<Ubs> findAll(Pageable pageable);
	

}
