package com.anil.movieguide.details;

import com.anil.movieguide.favorites.FavoritesInteractor;
import com.anil.movieguide.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

/**
 * @author
 * @author aniltaskiran
 */
@Module
public class DetailsModule {
    @Provides
    @DetailsScope
    MovieDetailsInteractor provideInteractor(TmdbWebService tmdbWebService) {
        return new MovieDetailsInteractorImpl(tmdbWebService);
    }

    @Provides
    @DetailsScope
    MovieDetailsPresenter providePresenter(MovieDetailsInteractor detailsInteractor,
                                           FavoritesInteractor favoritesInteractor) {
        return new MovieDetailsPresenterImpl(detailsInteractor, favoritesInteractor);
    }
}
