package com.BionexoApi.bionexo.csv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.BionexoApi.bionexo.entitie.Ubs;
import com.BionexoApi.bionexo.repository.UbsRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class OpenCsv {
	@Autowired 
	UbsRepository ubsRepository;
	
	public static List<Ubs> buscaCsv() throws IOException {
		   Reader reader = Files.newBufferedReader(Paths.get("ubs.csv"));
		   CsvToBean<Ubs> ubsToBean = new CsvToBeanBuilder<Ubs>(reader)
	               .withType(Ubs.class)
	               .build();

	       List<Ubs> ubsList = ubsToBean.parse();

	       return ubsList;
		}
}
