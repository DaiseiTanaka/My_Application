package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MechanismActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanism);
    }

    public void goToLink1(View view) {
        Intent toLink1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.msdmanuals.com/ja-jp/ホーム/16-感染症/感染症の生物学/成人の発熱"));
        startActivity(toLink1);
    }
}