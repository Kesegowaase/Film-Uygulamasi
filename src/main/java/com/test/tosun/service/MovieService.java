package com.test.tosun.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.test.tosun.model.Movie;
import com.test.tosun.repository.IMovieRepository;

@Service
public class MovieService implements IMovieService {

	@Autowired
	private IMovieRepository movieRepository;

	@Override
	public Page<Movie> getAllMovies(int pageNum, String sortField, String sortDir, String keyword) {
		Sort sort = Sort.by(sortField);
		sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
		Pageable pageable = PageRequest.of(pageNum - 1, 5, sort);
		
		if(keyword != null) {
			return movieRepository.findAll(keyword, pageable);
		}
		return movieRepository.findAll(pageable);
	}

	@Override
	public void saveMovie(Movie movie) {
		this.movieRepository.save(movie);
	}

	@Override
	public Movie getMovieById(int id) {
		Optional<Movie> optional = movieRepository.findById(id);
		Movie movie = null;
		if (optional.isPresent()) {
			movie = optional.get();
		} else {
			throw new RuntimeException("Movie not found for id: " + id);
		}
		return movie;
	}

	@Override
	public void deleteMovieById(int id) {
		this.movieRepository.deleteById(id);
	}


}
