package com.BionexoApi.bionexo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.BionexoApi.bionexo.entitie.Ubs;
import com.BionexoApi.bionexo.service.UbsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UbsRepositoryTest {
	@Autowired
	UbsRepository 	ubsRepository;
	
	@Autowired
	UbsService 	ubsService;
	
	@Test
	public void testaUbs() throws IOException {
		
		
		List<Ubs> ubsList = ubsRepository.findAll(); 
		assertThat(ubsList.size()).isEqualTo(0);
		assertThat(ubsList.get(0).getNom_estab()).isEqualTo("US OSWALDO DE SOUZA");
	}
}
