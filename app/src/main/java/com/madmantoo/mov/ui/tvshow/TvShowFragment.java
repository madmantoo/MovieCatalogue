package com.madmantoo.mov.ui.tvshow;


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
public class TvShowFragment extends Fragment {

    private RecyclerView rvTv;
    private View v;
    private ArrayList<TvShow> list = new ArrayList<>();

    public TvShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_tv_show, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvTv = v.findViewById(R.id.rv_tv);
        rvTv.setHasFixedSize(true);

        list.addAll(DataTV.getListDataTv());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTv.setLayoutManager(new GridLayoutManager(getContext(), 2));
        TvShowAdapter tvShowAdapter = new TvShowAdapter(this.getContext());
        tvShowAdapter.setListTvShow(list);
        rvTv.setAdapter(tvShowAdapter);
    }

}
