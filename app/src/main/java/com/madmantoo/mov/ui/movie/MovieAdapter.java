package com.madmantoo.mov.ui.movie;

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
import com.madmantoo.mov.DetailMovieActivity;
import com.madmantoo.mov.R;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.CardViewViewHolder> {

    private ArrayList<Movie> listMovie;
    private Context context;


    public ArrayList<Movie> getListMovies() {
        return listMovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    public MovieAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MovieAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movie, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.CardViewViewHolder holder, int position) {
        final Movie movie = getListMovies().get(position);

        Glide.with(holder.itemView.getContext())
                .load(movie.getmPoster())
                .transform(new CenterCrop(), new RoundedCorners(20))
                .into(holder.imgPoster);

        holder.tName.setText(movie.getmName());
        holder.tDuration.setText(movie.getmDuration());
    }

    @Override
    public int getItemCount() {
        return getListMovies().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPoster;
        TextView tName, tDuration;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPoster = itemView.findViewById(R.id.m_poster);
            tName = itemView.findViewById(R.id.m_name);
            tDuration = itemView.findViewById(R.id.m_duration);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Movie movie = getListMovies().get(position);

            movie.setmName(movie.getmName());
            movie.setmGenre(movie.getmGenre());

            Intent moveWithObjectIntent = new Intent(itemView.getContext(), DetailMovieActivity.class);
            moveWithObjectIntent.putExtra(DetailMovieActivity.EXTRA_MOVIE, movie);
            context.startActivity(moveWithObjectIntent);
        }
    }
}
