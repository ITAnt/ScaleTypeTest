package com.itant.scaletypetest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by SKY218790 on 2018/12/10.
 */

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        Log.e("dpi", ""+getResources().getDisplayMetrics().densityDpi);
        Log.e("density", ""+getResources().getDisplayMetrics().density);
        Log.e("screen-width-height", getResources().getDisplayMetrics().widthPixels + ", " + getResources().getDisplayMetrics().heightPixels);
        final ImageView iv_test = findViewById(R.id.iv_test);
        iv_test.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Log.e("imageview-width-height", iv_test.getWidth() + ", " + iv_test.getHeight());
                iv_test.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }
}
