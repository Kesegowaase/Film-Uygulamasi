package com.test.tosun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.tosun.model.Movie;
import com.test.tosun.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		// display list of movies
		String keyword = null;
		return viewPage(model, 1, "publicationYear", "asc", keyword);
	}

	@GetMapping("/page/{pageNum}")
	public String viewPage(Model model, @PathVariable(name = "pageNum") int pageNum,
			@Param("sortField") String sortField, @Param("sortDir") String sortDir, 
			@Param("keyword") String keyword) {

		Page<Movie> page = movieService.getAllMovies(pageNum, sortField, sortDir, keyword);

		List<Movie> listMovies = page.getContent();

		model.addAttribute("currentPage", pageNum);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("keyword", keyword);
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model.addAttribute("listMovies", listMovies);

		return "index";
	}

	@GetMapping("/newMovieForm")
	public String showNewMovieForm(Model model) {
		// create model attribute to bind form data
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "new_movie";
	}

	@PostMapping("/saveMovie")
	public String saveMovie(@ModelAttribute("movie") Movie movie) {
		// save movie database
		movieService.saveMovie(movie);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
		// get movie from the service
		Movie movie = movieService.getMovieById(id);

		// set movie as a model attribute to pre-populate the form
		model.addAttribute("movie", movie);
		return "update_movie";
	}

	@GetMapping("/deleteMovie/{id}")
	public String deleteEmployee(@PathVariable(value = "id") int id) {
		// call delete movie method
		this.movieService.deleteMovieById(id);
		return "redirect:/";
	}
	
	@GetMapping("/403")
	public String error403() {
		return "403";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";

	}

}
