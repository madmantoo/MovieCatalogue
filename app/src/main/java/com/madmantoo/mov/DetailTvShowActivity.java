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
import com.madmantoo.mov.ui.tvshow.TvShow;

public class DetailTvShowActivity extends AppCompatActivity {

    public static final String EXTRA_TV = "extra_tv";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv_show);

        ImageView tvPoster = findViewById(R.id.tv_poster);
        ImageView tvBanner = findViewById(R.id.tv_banner);

        TextView tvName = findViewById(R.id.tv_name);
        TextView tvDesc = findViewById(R.id.tv_desc);
        TextView tvGenre = findViewById(R.id.tv_genre);
        TextView tvDuration = findViewById(R.id.tv_duration);
        TextView tvDirection = findViewById(R.id.tv_direction);
        TextView tvCast = findViewById(R.id.tv_cast);

        Button btnfav = findViewById(R.id.btn_favorit_tv);
        Button btnrate = findViewById(R.id.btn_rate_tv);

        final TvShow tvShow = getIntent().getParcelableExtra(EXTRA_TV);
        tvName.setText(tvShow.getTvName());
        tvDesc.setText(tvShow.getTvDesc());
        tvGenre.setText(tvShow.getTvGenre());
        tvDuration.setText(tvShow.getTvDuration());
        tvDirection.setText(tvShow.getTvDirection());
        tvCast.setText(tvShow.getTvCast());

        Glide.with(this)
                .load(tvShow.getTvPoster())
                .transform(new CenterCrop(), new RoundedCorners(20))
                .into(tvPoster);

        Glide.with(this)
                .load(tvShow.getTvBanner())
                .transform(new CenterCrop())
                .into(tvBanner);

        btnfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getApplicationContext().getResources()
                                .getString(R.string.succes_wish) + "\t" + tvShow.getTvName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getApplicationContext().getResources()
                                .getString(R.string.succes_rate) + "\t" + tvShow.getTvName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(tvShow.getTvName());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
}
