package io.samanthatobias.planetdiary.controller;

import java.util.List;

import io.samanthatobias.planetdiary.model.Planet;
import io.samanthatobias.planetdiary.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/planets")
public class PlanetController {

	@Autowired
	private PlanetRepository planetRepository;

	@GetMapping
	public List<Planet> getAllPlanets() {
		return planetRepository.findAll();
	}

	@PostMapping
	public ResponseEntity<Planet> addPlanet(@RequestBody Planet planet) {
		Planet savedPlanet = planetRepository.save(planet);
		return new ResponseEntity<>(savedPlanet, HttpStatus.CREATED);
	}

}
