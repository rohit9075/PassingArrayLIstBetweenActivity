package com.example.rohitkumar.passingarraylistbetweenactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rohitkumar.passingarraylistbetweenactivity.model.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<User>  userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adding the user to the arrayList
        addUser();

    }

    // addUser method definition
    private void addUser() {
        userList.add(new User("1", "AbC"));
        userList.add(new User("2", "DEF"));
        userList.add(new User("3", "GEH"));
        userList.add(new User("4", "IJK"));
        userList.add(new User("5", "LMN"));
        userList.add(new User("6", "PQR"));
    }


    public void sendButton(View view) {

        Intent mSendIntent = new Intent(MainActivity.this, SecondActivity.class);
        Bundle bundle = new Bundle();

        // assigning the key value pair to the bundle object
        bundle.putSerializable("user", (Serializable) userList);

        // sending the bundle using intent
        mSendIntent.putExtras(bundle);

        // starting the activity
        startActivity(mSendIntent);


    }
}
