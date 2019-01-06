package com.anil.movieguide.details;

import com.anil.movieguide.Movie;
import com.anil.movieguide.Review;
import com.anil.movieguide.Video;

import java.util.List;

/**
 * @author
 */
interface MovieDetailsView
{
    void showDetails(Movie movie);
    void showTrailers(List<Video> trailers);
    void showReviews(List<Review> reviews);
    void showFavorited();
    void showUnFavorited();
}
