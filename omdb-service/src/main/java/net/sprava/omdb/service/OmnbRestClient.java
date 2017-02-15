package net.sprava.omdb.service;

import java.util.List;
import net.sprava.omdb.model.Movie;

/**
 * 
 * @author Nikolay Koretskyy
 *
 */
public interface OmnbRestClient {

	public Movie getMovie(String imdbId);

	public List<Movie> getMoviesByKeyword(String keyword);
}
