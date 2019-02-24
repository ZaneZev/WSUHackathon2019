package com.example.deadline;
import com.example.deadline.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    // Write a message to the database

    private static final String TAG = "MyActivity";
    private DatabaseReference mDatabase;


    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FirebaseApp.initializeApp(this);


        // Person 1
        List<Level> level1 = new ArrayList<Level>();
        level1.add(new Level("Trainee",1, 50));
        level1.add(new Level("Gym",2, 125));
        level1.add(new Level("Lord of S",3, 300));

        List<Level> level2 = new ArrayList<Level>();
        level2.add(new Level("Burgee",1, 10));
        level2.add(new Level("Burgermeister",2, 25));
        level2.add(new Level("BurgerKing",3, 50));

        List<Level> level3 = new ArrayList<Level>();
        level3.add(new Level("Green",1, 50));
        level3.add(new Level("Greener",2, 100));
        level3.add(new Level("Luigi",3, 150));



        List<Task> task1 = new ArrayList<Task>();
        task1.add(new Task("Trial of endurance.", 5));
        task1.add(new Task("Top",7));
        task1.add(new Task("Todd",100));

        List<Task> task2 = new ArrayList<Task>();
        task2.add(new Task("Burger.", 5));
        task2.add(new Task("Fries",4));
        task2.add(new Task("4-Nuggets",4));

        List<Task> task3 = new ArrayList<Task>();
        task3.add(new Task("Recycle", 10));
        task3.add(new Task("Reuse",10));
        task3.add(new Task("Reduce",10));


        List<Quest> quest1 = new ArrayList<Quest>();
        quest1.add(new Quest("Get the swolest",level1,task1,0));
        quest1.add(new Quest("MacCalorie Race",level2,task2,0));
        quest1.add(new Quest("Be Green",level3,task3,0));

        UserInformation user1 = new UserInformation("Billy","Bob",53,120);


        User person1 = new User(user1,quest1);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World");

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("User").child(person1.getUserinfo().GetFullName()).setValue(person1);



        // Read from the database
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                 //userFromDatabase = new User();

                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                //User userFromDatabase = dataSnapshot.getValue(User.class);
                User userFromDatabase = dataSnapshot.child("User").child("BillyBob").getValue(User.class);
                System.out.println(userFromDatabase);
                //userFromDatabase. ("Bob");

               // System.out.println("Age: " + userFromDatabase.age + " Name: " + userFromDatabase.name+ " Weight: " + userFromDatabase.weight);
                Log.d(TAG, "Value is: " + userFromDatabase);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.textView);
        //textView.setText(message);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_today) {

        } else if (id == R.id.nav_goal) {

        } else if (id == R.id.nav_skill) {

        } else if (id == R.id.nav_setting) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public void sendTasks(View view) {
        Intent intent = new Intent(this, TasksActivity.class);

        startActivity(intent);
    }

    public void sendStats(View view) {
        Intent intent = new Intent(this, StatsActivity.class);

        startActivity(intent);
    }
}
