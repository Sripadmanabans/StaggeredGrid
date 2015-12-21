package com.sripad.staggeredgrid.base;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * This is the base activity that will be subclassed by all the Activities.
 * Created by Sripad on 12/20/2015.
 */
public class BaseActivity extends AppCompatActivity implements SwitchFragment {

    protected Integer fragmentContainerId = null;
    protected Integer fragmentScrollableContainerId = null;

    @Override
    public void openFragment(Fragment fragment, boolean addToBackStack, boolean isScrollable) {
        int fragmentContainer;
        if(isScrollable) {
            if (fragmentScrollableContainerId == null) {
                throw new NullPointerException("Scrollable container ID has not been initialized " +
                        "to fragmentScrollableContainerId");
            } else {
                fragmentContainer = fragmentScrollableContainerId;
            }
        } else {
            if (fragmentContainerId == null) {
                throw new NullPointerException("Container Id has not been initialized to " +
                        "fragmentContainerId");
            } else {
                fragmentContainer = fragmentContainerId;
            }
        }
        if(fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(fragmentContainer, fragment,
                    fragment.getClass().getSimpleName());

            if(addToBackStack) {
                fragmentTransaction.addToBackStack(null);
            }

            fragmentTransaction.commit();

        } else {
            throw new NullPointerException("The fragment is null");
        }
    }
}
