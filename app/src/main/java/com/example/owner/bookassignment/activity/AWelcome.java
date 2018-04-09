package com.example.owner.bookassignment.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.owner.bookassignment.R;
import com.google.firebase.auth.FirebaseAuth;

public class AWelcome extends AppCompatActivity {

    FirebaseAuth mAuth;

    Button signOut, addBook, searchBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awelcome);
        mAuth = FirebaseAuth.getInstance();

        signOut = (Button)findViewById(R.id.signout1);
        addBook = (Button)findViewById(R.id.goToAdd);
        searchBooks = (Button)findViewById(R.id.goToSearch);

        signOut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Toast.makeText(getApplicationContext(), "Signing out...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AWelcome.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        addBook.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AWelcome.this, AddBook.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });



    }
}
