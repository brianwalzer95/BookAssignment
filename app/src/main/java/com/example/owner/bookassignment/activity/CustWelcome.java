package com.example.owner.bookassignment.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.owner.bookassignment.R;
import com.google.firebase.auth.FirebaseAuth;

public class CustWelcome extends AppCompatActivity {

    FirebaseAuth mAuth;

    Button signOut, searchBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_welcome);

        mAuth = FirebaseAuth.getInstance();

        signOut = (Button)findViewById(R.id.signOutCustomer);

        signOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Toast.makeText(getApplicationContext(), "Signing out...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CustWelcome.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
