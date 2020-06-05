package com.madmantoo.mov.ui.movie;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String mName;
    private String mDesc;
    private String mGenre;
    private String mDuration;
    private String mDirection;
    private String mPoster;
    private String mBanner;
    private String mCast;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmDuration() {
        return mDuration;
    }

    public void setmDuration(String mDuration) {
        this.mDuration = mDuration;
    }

    public String getmDirection() {
        return mDirection;
    }

    public void setmDirection(String mDirection) {
        this.mDirection = mDirection;
    }

    public String getmPoster() {
        return mPoster;
    }

    public void setmPoster(String mPoster) {
        this.mPoster = mPoster;
    }

    public String getmBanner() {
        return mBanner;
    }

    public void setmBanner(String mBanner) {
        this.mBanner = mBanner;
    }

    public String getmCast() {
        return mCast;
    }

    public void setmCast(String mCast) {
        this.mCast = mCast;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeString(mDesc);
        dest.writeString(mGenre);
        dest.writeString(mDuration);
        dest.writeString(mDirection);
        dest.writeString(mPoster);
        dest.writeString(mBanner);
        dest.writeString(mCast);
    }

    public Movie() {

    }

    protected Movie(Parcel in) {
        mName = in.readString();
        mDesc = in.readString();
        mGenre = in.readString();
        mDuration = in.readString();
        mDirection = in.readString();
        mPoster = in.readString();
        mBanner = in.readString();
        mCast = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
