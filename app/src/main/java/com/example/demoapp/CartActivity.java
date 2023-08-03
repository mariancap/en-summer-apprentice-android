package com.example.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.MaterialToolbar;

public class CartActivity extends AppCompatActivity {




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_cart);

        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);
        topAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle navigation icon click here
                switchToAnotherActivity();
            }
        });


        }
    private void switchToAnotherActivity() {
        // Replace NextActivity.class with the appropriate class of the activity you want to start
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }








}
