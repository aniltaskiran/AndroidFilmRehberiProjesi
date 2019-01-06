package com.anil.movieguide.details;

import dagger.Subcomponent;

/**
 * @author aniltaskiran
 */
@DetailsScope
@Subcomponent(modules = {DetailsModule.class})
public interface DetailsComponent
{
    void inject(MovieDetailsFragment target);
}
