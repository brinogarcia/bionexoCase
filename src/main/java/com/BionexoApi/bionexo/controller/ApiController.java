package com.BionexoApi.bionexo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BionexoApi.bionexo.entitie.Ubs;
import com.BionexoApi.bionexo.service.UbsService;

@Controller
@RequestMapping(value = "/api/v1")
public class ApiController {
	@Autowired
	UbsService ubsService;

	@GetMapping("/find_ubs")
	public ResponseEntity<Object> findUbs(
			@RequestParam(defaultValue = "0") String lat,
			@RequestParam(defaultValue = "0") String log,
			Pageable pageable
			) throws IOException {
		Page<Ubs> ubs = ubsService.buscaUbs(lat, log, pageable);

			return ResponseEntity.ok().body(ubs);
		
	}
}
