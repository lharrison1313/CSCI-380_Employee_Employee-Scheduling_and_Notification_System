package com.nyit.employee_scheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    private Button scheduleCard;
    private Button notificationCard;
    private Button requestCard;
    private TextView userNameText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        scheduleCard = findViewById(R.id.scheduleCard);
        notificationCard = findViewById(R.id.notificationCard);
        requestCard = findViewById(R.id.requestCard);
        userNameText = findViewById(R.id.username);
        userNameText.setText(getIntent().getStringExtra("UserName"));
        configureSchedule();
        configureNotifications();
        configureRequests();
    }
    private void configureSchedule(){
        scheduleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ViewSchedule.class);
                intent.putExtra("EmployeeID",getIntent().getIntExtra("EmployeeID",-1));
                startActivity(intent);
            }
        });
    }

    private void configureNotifications(){
        notificationCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });
    }

    private void configureRequests(){
        requestCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, RequestsActivity.class);
                intent.putExtra("UserName",getIntent().getStringExtra("UserName"));
                intent.putExtra("EmployeeID",getIntent().getIntExtra("EmployeeID",-1));
                startActivity(intent);
            }
        });
    }
}
