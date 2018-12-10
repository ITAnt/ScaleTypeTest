package com.itant.scaletypetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_fit_center).setOnClickListener(this);
        findViewById(R.id.btn_center).setOnClickListener(this);
        findViewById(R.id.btn_center_crop).setOnClickListener(this);
        findViewById(R.id.btn_center_inside).setOnClickListener(this);
        findViewById(R.id.btn_fit_end).setOnClickListener(this);
        findViewById(R.id.btn_fit_start).setOnClickListener(this);
        findViewById(R.id.btn_fit_xy).setOnClickListener(this);
        findViewById(R.id.btn_matrix).setOnClickListener(this);
        findViewById(R.id.btn_test).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_fit_center:
                startActivity(new Intent(this, FitCenterActivity.class));
                break;

            case R.id.btn_center:
                startActivity(new Intent(this, CenterActivity.class));
                break;

            case R.id.btn_center_crop:
                startActivity(new Intent(this, CenterCropActivity.class));
                break;

            case R.id.btn_center_inside:
                startActivity(new Intent(this, CenterInsideActivity.class));
                break;

            case R.id.btn_fit_end:
                startActivity(new Intent(this, FitEndActivity.class));
                break;

            case R.id.btn_fit_start:
                startActivity(new Intent(this, FitStartActivity.class));
                break;

            case R.id.btn_fit_xy:
                startActivity(new Intent(this, FitXYActivity.class));
                break;

            case R.id.btn_matrix:
                startActivity(new Intent(this, MatrixActivity.class));
                break;

            case R.id.btn_test:
                startActivity(new Intent(this, TestActivity.class));
                break;
        }
    }
}
