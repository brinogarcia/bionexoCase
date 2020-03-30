package com.BionexoApi.bionexo.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BionexoApi.bionexo.csv.OpenCsv;
import com.BionexoApi.bionexo.entitie.Ubs;
import com.BionexoApi.bionexo.repository.UbsRepository;

@Service
public class UbsService {
	
	@Autowired
	UbsRepository ubsRepository;
	
	public void insertUbs(String lat, String log) throws IOException {
		List<Ubs> ubsListString = OpenCsv.buscaCsv(); 
		for (Ubs ubs : ubsListString) {
			if(ubs.getVlr_latitude().contentEquals(lat)) {
				if(ubs.getVlr_longitude().contentEquals(log))
				ubsRepository.save(ubs);
			}

		}
		
	}
	
	public  Page<Ubs> buscaUbs(String lat, String log, Pageable pageable ) throws IOException{
		insertUbs( lat, log);
		
		List<Ubs> ubsListString = ubsRepository.findAll();
		Page<Ubs> ubsListStringReturn = ubsRepository.findAll(pageable);
					

					ubsRepository.deleteAll();

		return ubsListStringReturn;
	}
	
}
