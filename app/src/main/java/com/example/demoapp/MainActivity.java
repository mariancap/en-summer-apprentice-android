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

public class MainActivity extends AppCompatActivity {




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.events_page);

       Button my_ordersBtn=(Button) findViewById(R.id.order_button);
       my_ordersBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            openCartActivity();
           }
       });




    }
    public void openCartActivity()
    {
        Intent intent=new Intent(this,CartActivity.class);
        startActivity(intent);
    }


}
