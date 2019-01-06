package com.anil.movieguide.listing;

import com.anil.movieguide.listing.sorting.SortingDialogFragment;
import com.anil.movieguide.listing.sorting.SortingModule;

import dagger.Subcomponent;

/**
 * @author aniltaskiran
 */
@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent
{
    MoviesListingFragment inject(MoviesListingFragment fragment);

    SortingDialogFragment inject(SortingDialogFragment fragment);
}
