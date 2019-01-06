package com.anil.movieguide.favorites;

import com.anil.movieguide.Movie;

import java.util.List;

/**
 * @author
 */
public interface FavoritesInteractor
{
    void setFavorite(Movie movie);
    boolean isFavorite(String id);
    List<Movie> getFavorites();
    void unFavorite(String id);
}
