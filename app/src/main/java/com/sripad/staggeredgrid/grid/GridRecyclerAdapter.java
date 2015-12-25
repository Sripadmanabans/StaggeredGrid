package com.sripad.staggeredgrid.grid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sripad.staggeredgrid.R;
import com.sripad.staggeredgrid.model.Chemical;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * This is the adapter that is used for the recycler view that will be used to create the
 * staggered grid.
 * Created by Sripad on 12/20/2015.
 */
public class GridRecyclerAdapter extends RecyclerView.Adapter<GridRecyclerAdapter.ViewHolder> {

    private List<Chemical> chemicals;

    GridRecyclerAdapter(List<Chemical> chemicals) {
        this.chemicals = chemicals;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.chemical
                .setCompoundDrawablesWithIntrinsicBounds(0, chemicals.get(position).getChemicalImage(), 0, 0);
        holder.chemical.setText(chemicals.get(position).getChemicalName());
    }

    @Override
    public int getItemCount() {
        return chemicals.size();
    }

    /**
     * This is the view holder that is used for the grid view.
     */
    protected class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.chemical)
        TextView chemical;

        /**
         * Constructor that is used to create the view holder, also helps to initialize the views.
         *
         * @param itemView The view that is inflated in the onCreateViewHolder.
         */
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
