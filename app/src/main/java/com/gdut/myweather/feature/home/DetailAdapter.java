package com.gdut.myweather.feature.home;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gdut.myweather.base.BaseRecyclerViewAdapter;
import com.gdut.myweather.R;
import com.gdut.myweather.data.WeatherDetail;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Mloong
 *         2016/07/06
 */
public class DetailAdapter extends BaseRecyclerViewAdapter<DetailAdapter.ViewHolder> {

    private List<WeatherDetail> details;

    public DetailAdapter(List<WeatherDetail> details) {
        this.details = details;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_detail, parent, false);
        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        WeatherDetail detail = details.get(position);
        holder.detailIconImageView.setImageResource(detail.getIconResourceId());
        holder.detailKeyTextView.setText(detail.getKey());
        holder.detailValueTextView.setText(detail.getValue());
    }

    @Override
    public int getItemCount() {
        return details == null ? 0 : details.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.detail_icon_image_view)
        ImageView detailIconImageView;
        @BindView(R.id.detail_key_text_view)
        TextView detailKeyTextView;
        @BindView(R.id.detail_value_text_view)
        TextView detailValueTextView;

        ViewHolder(View itemView, DetailAdapter adapter) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(v -> adapter.onItemHolderClick(ViewHolder.this));
        }
    }
}
