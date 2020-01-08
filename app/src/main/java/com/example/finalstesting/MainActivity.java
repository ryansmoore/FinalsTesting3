package com.example.finalstesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button NewReportButton;
    private Button ViewEditReportButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewReportButton = findViewById(R.id.NewReportButton);
        ViewEditReportButton = findViewById(R.id.ViewEditReportButton);

        //when you click on the create new reports button it goes to that tab
/*        NewReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewReportsActivity();
            }
        });*/

        //when you click on the view/edit reports button it goes to that tab
        ViewEditReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewEditReportsActivity();
            }
        });

    }

    //opens the New Reports Screen
/*    public void NewReportsActivity() {
        Intent intent = new Intent(this, NewReportsActivity.class);
        startActivity(intent);
    }*/

    //opens the View Edit Screen
    public void ViewEditReportsActivity() {
        Intent intent = new Intent(this, ViewEditReportsActivity.class);
        startActivity(intent);
    }
}
