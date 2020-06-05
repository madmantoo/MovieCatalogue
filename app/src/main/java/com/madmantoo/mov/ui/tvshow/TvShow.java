package com.madmantoo.mov.ui.tvshow;

import android.os.Parcel;
import android.os.Parcelable;

public class TvShow implements Parcelable {
    private String tvName;
    private String tvDesc;
    private String tvGenre;
    private String tvDuration;
    private String tvDirection;
    private String tvPoster;
    private String tvBanner;
    private String tvCast;

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvDesc() {
        return tvDesc;
    }

    public void setTvDesc(String tvDesc) {
        this.tvDesc = tvDesc;
    }

    public String getTvGenre() {
        return tvGenre;
    }

    public void setTvGenre(String tvGenre) {
        this.tvGenre = tvGenre;
    }

    public String getTvDuration() {
        return tvDuration;
    }

    public void setTvDuration(String tvDuration) {
        this.tvDuration = tvDuration;
    }

    public String getTvDirection() {
        return tvDirection;
    }

    public void setTvDirection(String tvDirection) {
        this.tvDirection = tvDirection;
    }

    public String getTvPoster() {
        return tvPoster;
    }

    public void setTvPoster(String tvPoster) {
        this.tvPoster = tvPoster;
    }

    public String getTvBanner() {
        return tvBanner;
    }

    public void setTvBanner(String tvBanner) {
        this.tvBanner = tvBanner;
    }

    public String getTvCast() {
        return tvCast;
    }

    public void setTvCast(String tvCast) {
        this.tvCast = tvCast;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tvName);
        dest.writeString(tvDesc);
        dest.writeString(tvGenre);
        dest.writeString(tvDuration);
        dest.writeString(tvDirection);
        dest.writeString(tvPoster);
        dest.writeString(tvBanner);
        dest.writeString(tvCast);
    }

    public TvShow() {

    }

    protected TvShow(Parcel in) {
        tvName = in.readString();
        tvDesc = in.readString();
        tvGenre = in.readString();
        tvDuration = in.readString();
        tvDirection = in.readString();
        tvPoster = in.readString();
        tvBanner = in.readString();
        tvCast = in.readString();
    }

    public static final Creator<TvShow> CREATOR = new Creator<TvShow>() {
        @Override
        public TvShow createFromParcel(Parcel in) {
            return new TvShow(in);
        }

        @Override
        public TvShow[] newArray(int size) {
            return new TvShow[size];
        }
    };
}
