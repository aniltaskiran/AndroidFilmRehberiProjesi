package com.anil.movieguide.listing;

import com.anil.movieguide.Movie;

import java.util.List;

/**
 * @author
 */
interface MoviesListingView
{
    void showMovies(List<Movie> movies);
    void loadingStarted();
    void loadingFailed(String errorMessage);
    void onMovieClicked(Movie movie);
}
