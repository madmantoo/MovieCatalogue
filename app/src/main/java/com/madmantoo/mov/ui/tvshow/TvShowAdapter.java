package com.madmantoo.mov.ui.tvshow;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.madmantoo.mov.DetailTvShowActivity;
import com.madmantoo.mov.R;

import java.util.ArrayList;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.CardViewViewHolder> {

    private ArrayList<TvShow> listTvShow;
    private Context context;

    public ArrayList<TvShow> getListTvShow() {
        return listTvShow;
    }

    public void setListTvShow(ArrayList<TvShow> listTvShow) {
        this.listTvShow = listTvShow;
    }

    public TvShowAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tv, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        final TvShow tvShow = listTvShow.get(position);

        Glide.with(holder.itemView.getContext())
                .load(tvShow.getTvPoster())
                .transform(new CenterCrop(), new RoundedCorners(20))
                .into(holder.tvPoster);

        holder.tvName.setText(tvShow.getTvName());
        holder.tvDuration.setText(tvShow.getTvDuration());
    }

    @Override
    public int getItemCount() {
        return listTvShow.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView tvPoster;
        TextView tvName, tvDuration;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPoster = itemView.findViewById(R.id.tv_poster);
            tvName = itemView.findViewById(R.id.tv_name);
            tvDuration = itemView.findViewById(R.id.tv_duration);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            TvShow tvShow = getListTvShow().get(position);

            tvShow.setTvName(tvShow.getTvName());
            tvShow.setTvGenre(tvShow.getTvGenre());

            Intent moveWithObjectIntent = new Intent(itemView.getContext(), DetailTvShowActivity.class);
            moveWithObjectIntent.putExtra(DetailTvShowActivity.EXTRA_TV, tvShow);
            context.startActivity(moveWithObjectIntent);
        }
    }
}
