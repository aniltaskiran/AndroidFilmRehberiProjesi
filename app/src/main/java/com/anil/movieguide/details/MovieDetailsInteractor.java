package com.anil.movieguide.details;

import com.anil.movieguide.Review;
import com.anil.movieguide.Video;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author
 */
public interface MovieDetailsInteractor
{
    Observable<List<Video>> getTrailers(String id);
    Observable<List<Review>> getReviews(String id);
}
