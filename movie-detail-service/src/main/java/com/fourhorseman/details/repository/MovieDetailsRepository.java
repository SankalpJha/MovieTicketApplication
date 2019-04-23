package com.fourhorseman.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fourhorseman.details.model.MovieDetails;

@Repository
public interface MovieDetailsRepository extends JpaRepository<MovieDetails, Integer> {
	
	public MovieDetails findByMovieName(String movieName);
}
