package com.sripad.staggeredgrid.base;

import android.app.Activity;
import android.app.Fragment;

/**
 * This is the base fragment that will be used to subclass for Fragments.
 * Created by Sripad on 12/20/2015.
 */
public class BaseFragment extends Fragment {

    protected SwitchFragment switchFragment = null;

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            switchFragment = (SwitchFragment) activity;
        } catch (Exception e) {
            throw new ClassCastException("The activity is not extending BaseActivity");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        switchFragment = null;
    }
}
