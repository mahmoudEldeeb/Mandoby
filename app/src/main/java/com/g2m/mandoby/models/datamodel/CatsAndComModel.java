package com.g2m.mandoby.models.datamodel;

import android.content.Context;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import com.squareup.picasso.Picasso;

public class CatsAndComModel {
    public String title;
           public int image;

    public CatsAndComModel(String title, int image) {
        this.title = title;
        this.image = image;
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView view,int url){
        Context context=view.getContext();
        view.setImageResource(url);
        Picasso.get().load(url).into(view);
    }
}
