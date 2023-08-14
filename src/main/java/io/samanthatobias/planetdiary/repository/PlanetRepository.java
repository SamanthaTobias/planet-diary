package io.samanthatobias.planetdiary.repository;

import io.samanthatobias.planetdiary.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

}
