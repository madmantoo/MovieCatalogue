package com.madmantoo.mov;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.madmantoo.mov.ui.movie.Movie;

public class DetailMovieActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        ImageView poster = findViewById(R.id.m_poster);
        ImageView banner = findViewById(R.id.m_header);

        TextView mName = findViewById(R.id.m_name);
        TextView mDesc = findViewById(R.id.m_desc);
        TextView mGenre = findViewById(R.id.m_genre);
        TextView mDirection = findViewById(R.id.m_direction);
        TextView mDuration = findViewById(R.id.m_duration);
        TextView mCast = findViewById(R.id.m_cast);

        Button btnFavorit = findViewById(R.id.btn_favorit);
        Button btnRate = findViewById(R.id.btn_rate);

        final Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        mName.setText(movie.getmName());
        mDesc.setText(movie.getmDesc());
        mGenre.setText(movie.getmGenre());
        mDirection.setText(movie.getmDirection());
        mDuration.setText(movie.getmDuration());
        mCast.setText(movie.getmCast());

        Glide.with(this)
                .load(movie.getmPoster())
                .transform(new CenterCrop(), new RoundedCorners(20))
                .into(poster);

        Glide.with(this)
                .load(movie.getmBanner())
                .transform(new CenterCrop())
                .into(banner);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(movie.getmName());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        btnRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getApplicationContext().getResources()
                                .getString(R.string.succes_rate) + "\t" + movie.getmName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnFavorit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getApplicationContext().getResources()
                                .getString(R.string.succes_wish) + "\t" + movie.getmName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
}
