package com.anil.movieguide;

import android.app.Application;
import android.os.StrictMode;

import com.anil.movieguide.details.DetailsComponent;
import com.anil.movieguide.details.DetailsModule;
import com.anil.movieguide.favorites.FavoritesModule;
import com.anil.movieguide.listing.ListingComponent;
import com.anil.movieguide.listing.ListingModule;
import com.anil.movieguide.network.NetworkModule;
import com.anil.movieguide.listing.sorting.SortingModule;

import io.realm.Realm;

/**
 * @author
 */
public class BaseApplication extends Application
{
    private AppComponent appComponent;
    private DetailsComponent detailsComponent;
    private ListingComponent listingComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();
        StrictMode.enableDefaults();
        initRealm();
        appComponent = createAppComponent();
    }

    private AppComponent createAppComponent()
    {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .favoritesModule(new FavoritesModule())
                .build();
    }

    private void initRealm(){
        Realm.init(this);
    }

    public DetailsComponent createDetailsComponent()
    {
        detailsComponent = appComponent.plus(new DetailsModule());
        return detailsComponent;
    }

    public void releaseDetailsComponent()
    {
        detailsComponent = null;
    }

    public ListingComponent createListingComponent()
    {
        listingComponent = appComponent.plus(new ListingModule());
        return listingComponent;
    }

    public void releaseListingComponent()
    {
        listingComponent = null;
    }

    public ListingComponent getListingComponent()
    {
        return listingComponent;
    }
}
