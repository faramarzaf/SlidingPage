package com.faraaf.tictacdev.slidingpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.faraaf.tictacdev.slidingpage.sample1.PreferenceManager;
import com.faraaf.tictacdev.slidingpage.sample1.Sample1Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // https://javapapers.com/android/android-intro-slider-and-splash-screen/

    Button btnReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }


    private void initUI() {
        btnReply = findViewById(R.id.btnReply);
        btnReply.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnReply:
                PreferenceManager preferenceManager = new PreferenceManager(getApplicationContext());
                preferenceManager.setFirstTimeLaunch(true);
                startActivity(new Intent(MainActivity.this, Sample1Activity.class));
                finish();
                break;
            default:
                break;
        }

    }


}
