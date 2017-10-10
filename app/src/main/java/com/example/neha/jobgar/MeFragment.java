package com.example.neha.jobgar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;

import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class MeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View v=inflater.inflate(R.layout.me_fragment, container, false);
        ImageView image=(ImageView) v.findViewById(R.id.image);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),
                R.drawable.image1);
        RoundedBitmapDrawable drawable = RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        drawable.setCircular(true);
        image.setImageDrawable(drawable);
        FloatingActionButton newPage = (FloatingActionButton) v.findViewById(R.id.fab);
        newPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(getActivity(), FabActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }
}
