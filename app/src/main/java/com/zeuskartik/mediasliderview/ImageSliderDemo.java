package com.zeuskartik.mediasliderview;

import android.os.Bundle;

import com.zeuskartik.mediaslider.MediaSliderActivity;

import java.util.ArrayList;

public class ImageSliderDemo extends MediaSliderActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> list = new ArrayList<>();
        list.add("https://res.cloudinary.com/kartiksaraf/image/upload/v1564514468/github_MediaSliderView/demo_images/8-phone-wallpaper_gcseap.jpg");
        list.add("https://res.cloudinary.com/kartiksaraf/image/upload/v1564514549/github_MediaSliderView/demo_images/ea0ef44d800aa07722c25b1a6db58800--iphone-backgrounds-phone-wallpapers_cqmbbx.jpg");
        list.add("https://res.cloudinary.com/kartiksaraf/image/upload/v1564514590/github_MediaSliderView/demo_images/Quotefancy-20588-3840x2160_msurjx.jpg");
        list.add("https://res.cloudinary.com/kartiksaraf/image/upload/v1564514634/github_MediaSliderView/demo_images/Quotefancy-2098-3840x2160_nrez6k.jpg");
        list.add("https://res.cloudinary.com/kartiksaraf/image/upload/v1564514699/github_MediaSliderView/demo_images/download_totbb2.jpg");
        loadMediaSliderView(list,"image",true,true,false,"Image-Slider","#000000",null,0);
    }
}
