package com.anil.movieguide.listing.sorting;

/**
 * @author
 */
interface SortingDialogView
{
    void setPopularChecked();

    void setNewestChecked();

    void setHighestRatedChecked();

    void setFavoritesChecked();

    void dismissDialog();

}
