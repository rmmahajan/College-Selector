package com.example.clg;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Admin1 extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    private Button b, bttnn;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin1);
        mListView = findViewById(R.id.listview);
        firebaseAuth = FirebaseAuth.getInstance();
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Data Login");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                ArrayList <String> array = new ArrayList <>();
                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    Listlink user1 = new Listlink();
                    user1.setFName(ds.getValue(Listlink.class).getFName());
                    user1.setEMail(ds.getValue(Listlink.class).getEMail());
                    // user1.setDescription(ds.getValue(listlink.class).getDescription());
                    array.add("Name: " + user1.getFName() + "\n" + "\n" + "Email: " + user1.getEMail() + "\n" + "\n");
                }
                ArrayAdapter <String> adapter = new ArrayAdapter(Admin1.this, android.R.layout.simple_list_item_1, array);
                mListView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(), "Error In processing", Toast.LENGTH_SHORT).show();
            }

        });
    }
}