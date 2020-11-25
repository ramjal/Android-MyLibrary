package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks, btnAlreadyRead, btnWantToRead, btnAbout, btnFavourite, btnCurrentlyReading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        btnAllBooks = findViewById(R.id.btnAllBooks);
        btnAlreadyRead = findViewById(R.id.btnAlreadyRead);
        btnWantToRead = findViewById(R.id.btnWantToRead);
        btnAbout = findViewById(R.id.btnAbout);
        btnFavourite = findViewById(R.id.btnFavourite);
        btnCurrentlyReading = findViewById(R.id.btnCurrentlyReading);
    }

    public void btnAllBooksClicked(View view) {
        Intent intent = new Intent(this, AllBooksActivity.class);
        startActivity(intent);
    }
}