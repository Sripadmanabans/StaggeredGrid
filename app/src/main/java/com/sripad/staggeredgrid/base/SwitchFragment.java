package com.sripad.staggeredgrid.base;

import android.app.Fragment;

/**
 * This is the interface that will help in switching between fragments.
 * Created by Sripad on 12/20/2015.
 */
public interface SwitchFragment {

    /**
     * This is the function to be called to open a fragment.
     *
     * @param fragment       The fragment that needs to be opened.
     * @param addToBackStack A boolean that states if the fragment has to be added to the back 
     *                       stack or not.
     * @param isScrollable   A boolean that helps to use the correct fragment container to manage
     *                       the behaviour of the layout.
     */
    void openFragment(Fragment fragment, boolean addToBackStack, boolean isScrollable);

}
