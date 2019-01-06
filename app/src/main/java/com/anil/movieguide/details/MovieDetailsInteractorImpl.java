package com.anil.movieguide.details;

import com.anil.movieguide.Review;
import com.anil.movieguide.ReviewsWrapper;
import com.anil.movieguide.Video;
import com.anil.movieguide.VideoWrapper;
import com.anil.movieguide.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author
 */
class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }

}
