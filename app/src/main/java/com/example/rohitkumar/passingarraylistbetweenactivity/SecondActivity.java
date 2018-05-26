package com.example.rohitkumar.passingarraylistbetweenactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.rohitkumar.passingarraylistbetweenactivity.model.User;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    List<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView mOutput = findViewById(R.id.textView);
        TextView mId = findViewById(R.id.id);



        Bundle bundle = getIntent().getExtras();

        if(bundle!=null) {
            userList = (List<User>) bundle.getSerializable("user");
        }
        else
        Log.e("null","null");


        assert userList != null;
        for (User user : userList){

            String id = user.getId();
//            Log.d(TAG, "onCreate: " + user.getName());
//            Toast.makeText(this, mId , Toast.LENGTH_SHORT).show();
            mOutput.append(user.getName() + "\n");
            mId.append(user.getId() + "\n");

        }
    }
}
