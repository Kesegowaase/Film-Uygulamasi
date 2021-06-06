package com.test.tosun.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.test.tosun.model.Movie;

@Repository
public interface IMovieRepository extends PagingAndSortingRepository<Movie, Integer> {

	@Query("SELECT m FROM Movie m WHERE " + "CONCAT(m.name, ' ', m.type, ' ', m.actorName)" + " LIKE %?1%")
	public Page<Movie> findAll(String keyword, Pageable pageable);
	
}
