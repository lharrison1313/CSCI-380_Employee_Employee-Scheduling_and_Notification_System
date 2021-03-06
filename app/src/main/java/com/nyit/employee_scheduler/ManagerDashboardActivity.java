package com.nyit.employee_scheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManagerDashboardActivity extends AppCompatActivity {

    private Button breakdownCard;
    private Button requestsCard;
    private Button scheduleCard;
    private TextView userNameText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_dashboard);
        breakdownCard = findViewById(R.id.breakdownCard);
        requestsCard = findViewById(R.id.requestsCard);
        scheduleCard = findViewById(R.id.ScheduleCard);
        userNameText = findViewById(R.id.username);
        userNameText.setText(getIntent().getStringExtra("UserName"));
        configureBreakdown();
        configureRequests();
        configureCreateSchedule();
    }

    private void configureCreateSchedule(){
        scheduleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerDashboardActivity.this, CreateSchedule.class);
                startActivity(intent);
            }
        });
    }

    private void configureBreakdown(){
        breakdownCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerDashboardActivity.this, ViewBreakdown.class);
                startActivity(intent);
            }
        });
    }

    private void configureRequests(){
        requestsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerDashboardActivity.this, ViewRequest.class);
                startActivity(intent);
            }
        });
    }

    }






