package com.anil.movieguide.listing;

import com.anil.movieguide.Movie;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author
 */
public interface MoviesListingInteractor
{
    boolean isPaginationSupported();
    Observable<List<Movie>> fetchMovies(int page);
    Observable<List<Movie>> searchMovie(String searchQuery);
}
