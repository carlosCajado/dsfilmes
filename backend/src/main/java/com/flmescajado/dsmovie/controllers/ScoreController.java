package com.flmescajado.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flmescajado.dsmovie.dto.MovieDTO;
import com.flmescajado.dsmovie.dto.ScoreDTO;
import com.flmescajado.dsmovie.servises.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	@Autowired
	private ScoreService service;

	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		MovieDTO MovieDTO = service.saveScore(dto);
		return MovieDTO;
	
	}
}
