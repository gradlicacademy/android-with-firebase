package com.gradlic.firestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference reference;
    String value;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        

        reference = database.getReference("user");


        //reference.setValue("Hello World");

//        textView = findViewById(R.id.hello);

        //Log.d("testlog", ""+value);

        User user = new User("Dipankar", "kumar", "v.ray96610@gmail.com", 8723992495L);


        String uid = reference.push().getKey();

        reference.child(uid).setValue(user);

        //reference.child(reference.getKey()).setValue(user);



    }
}