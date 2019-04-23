package com.fourhorseman.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fourhorseman.movie.model.MoviesInfo;

@Repository
public interface MovieRepository extends JpaRepository<MoviesInfo, Integer>{

	public MoviesInfo findByMovieName(String movieName);

	/*@Query("SELECT SYSDATE()")
	public Object getDBStatus();*/

}
