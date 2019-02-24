package com.example.deadline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        Intent intent = getIntent();
        ((TextView)findViewById(R.id.totalpts1)).setText("Total Points: "+Globals.getInstance().user.getQuests().get(0).getTotalNumberOfPoints());

    }
}
