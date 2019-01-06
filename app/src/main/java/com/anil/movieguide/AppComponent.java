package com.anil.movieguide;

import com.anil.movieguide.details.DetailsComponent;
import com.anil.movieguide.details.DetailsModule;
import com.anil.movieguide.favorites.FavoritesModule;
import com.anil.movieguide.listing.ListingComponent;
import com.anil.movieguide.listing.ListingModule;
import com.anil.movieguide.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author aniltaskiran
 * @author
 */
@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent
{
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
