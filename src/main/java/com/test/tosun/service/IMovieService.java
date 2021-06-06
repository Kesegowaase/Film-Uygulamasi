package com.test.tosun.service;

import org.springframework.data.domain.Page;
import com.test.tosun.model.*;

public interface IMovieService {

	Page<Movie> getAllMovies(int pageNum, String sortField, String sortDir, String keyword);

	public void saveMovie(Movie movie);

	Movie getMovieById(int id);

	void deleteMovieById(int id);

}
