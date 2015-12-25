package com.sripad.staggeredgrid.grid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sripad.staggeredgrid.R;
import com.sripad.staggeredgrid.base.BaseFragment;
import com.sripad.staggeredgrid.model.Chemical;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * This is the fragment that is used to show the grid view.
 * Created by Sripad on 12/20/2015.
 */
public class GridFragment extends BaseFragment {

    @Bind(R.id.staggered_grid_view)
    RecyclerView staggeredGrid;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid, container, false);
        ButterKnife.bind(this, view);

        staggeredGrid.setLayoutManager(new StaggeredGridLayoutManager(3, 1));
        staggeredGrid.setAdapter(new GridRecyclerAdapter(getListOfChemicals()));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        return view;
    }

    private List<Chemical> getListOfChemicals() {
        List<Chemical> chemicals = new ArrayList<>();
        chemicals.add(new Chemical("Alkane", R.drawable.one));
        chemicals.add(new Chemical("Ethane", R.drawable.two));
        chemicals.add(new Chemical("Alkyne", R.drawable.three));
        chemicals.add(new Chemical("Benzene", R.drawable.four));
        chemicals.add(new Chemical("Amide", R.drawable.one));
        chemicals.add(new Chemical("Amino Acid", R.drawable.two));
        chemicals.add(new Chemical("Phenol", R.drawable.three));
        chemicals.add(new Chemical("Carbonxylic", R.drawable.four));
        chemicals.add(new Chemical("Nitril", R.drawable.one));
        chemicals.add(new Chemical("Ether", R.drawable.two));
        chemicals.add(new Chemical("Ester", R.drawable.three));
        chemicals.add(new Chemical("Alcohol", R.drawable.four));
        chemicals.add(new Chemical("Alkane", R.drawable.one));
        chemicals.add(new Chemical("Ethane", R.drawable.two));
        chemicals.add(new Chemical("Alkyne", R.drawable.three));
        chemicals.add(new Chemical("Benzene", R.drawable.four));
        chemicals.add(new Chemical("Amide", R.drawable.one));
        chemicals.add(new Chemical("Amino Acid", R.drawable.two));
        chemicals.add(new Chemical("Phenol", R.drawable.three));
        chemicals.add(new Chemical("Carbonxylic", R.drawable.four));
        chemicals.add(new Chemical("Nitril", R.drawable.one));
        chemicals.add(new Chemical("Ether", R.drawable.two));
        chemicals.add(new Chemical("Ester", R.drawable.three));
        chemicals.add(new Chemical("Alcohol", R.drawable.four));

        return chemicals;
    }
}
