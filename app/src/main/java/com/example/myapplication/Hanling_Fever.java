package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Hanling_Fever extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanling__fever);
    }

    public void Handring_button(View view) {
        Intent Handring_Link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthline.com/health/how-to-break-a-fever"));
        startActivity(Handring_Link);
    }
}
