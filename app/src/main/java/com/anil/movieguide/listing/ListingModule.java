package com.anil.movieguide.listing;

import com.anil.movieguide.favorites.FavoritesInteractor;
import com.anil.movieguide.listing.sorting.SortingOptionStore;
import com.anil.movieguide.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

/**
 * @author
 * @author aniltaskiran
 */
@Module
public class ListingModule {
    @Provides
    MoviesListingInteractor provideMovieListingInteractor(FavoritesInteractor favoritesInteractor,
                                                          TmdbWebService tmdbWebService,
                                                          SortingOptionStore sortingOptionStore) {
        return new MoviesListingInteractorImpl(favoritesInteractor, tmdbWebService, sortingOptionStore);
    }

    @Provides
    MoviesListingPresenter provideMovieListingPresenter(MoviesListingInteractor interactor) {
        return new MoviesListingPresenterImpl(interactor);
    }
}
