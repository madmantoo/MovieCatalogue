package com.madmantoo.mov.ui.movie;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.madmantoo.mov.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

    private RecyclerView rvMovie;
    private View v;
    private ArrayList<Movie> list = new ArrayList<>();


    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_movie, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMovie = v.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        list.addAll(DataMovie.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMovie.setLayoutManager(new GridLayoutManager(getContext(), 2));
        MovieAdapter movieAdapter = new MovieAdapter(this.getContext());
        movieAdapter.setListMovie(list);
        rvMovie.setAdapter(movieAdapter);
    }

}
