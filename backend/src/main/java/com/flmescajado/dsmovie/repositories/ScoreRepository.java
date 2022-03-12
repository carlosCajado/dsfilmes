package com.flmescajado.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flmescajado.dsmovie.entities.Score;
import com.flmescajado.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}