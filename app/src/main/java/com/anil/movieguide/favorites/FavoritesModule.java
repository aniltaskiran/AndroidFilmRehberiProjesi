package com.anil.movieguide.favorites;

import com.anil.movieguide.AppModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author
 */
@Module(includes = AppModule.class)
public class FavoritesModule
{
    @Provides
    @Singleton
    FavoritesInteractor provideFavouritesInteractor(FavoritesStore store)
    {
        return new FavoritesInteractorImpl(store);
    }
}
