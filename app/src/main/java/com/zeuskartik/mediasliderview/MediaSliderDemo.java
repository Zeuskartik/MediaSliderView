package com.zeuskartik.mediasliderview;

import android.os.Bundle;

import com.zeuskartik.mediaslider.MediaSliderActivity;

import java.util.ArrayList;

public class MediaSliderDemo extends MediaSliderActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> list = new ArrayList<>();
        list.add("https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2018/10/25/15405041847501.jpg");
        list.add("https://www.geeky-gadgets.com/wp-content/uploads/2010/06/android-robot1.jpg");
        list.add("https://i.pinimg.com/originals/3c/6a/31/3c6a31446efcef86b2bb9a639685e066.jpg");
        list.add("https://cdn-image.hipwee.com/wp-content/uploads/2016/03/1458720476319-451x422.jpg");
        loadMediaSliderView(list,"image",true,true,false,"Media-Slider","#000000",null);
    }
}
