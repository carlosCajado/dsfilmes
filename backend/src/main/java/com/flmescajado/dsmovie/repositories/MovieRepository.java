package com.flmescajado.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flmescajado.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
