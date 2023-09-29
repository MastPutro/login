package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Button github = findViewById(R.id.github);
        Button listac = findViewById(R.id.listaccount);

        listac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
                    github.setOnClickListener(new View.OnClickListener(){

                        @Override
                        public void onClick(View view) {
                            String url = "https://github.com/MastPutro";

                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    Button call = findViewById(R.id.call);
                    call.setOnClickListener(new View.OnClickListener(){

                        @Override
                        public void onClick(View view) {

                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            startActivity(intent);
                        }
                    });
    }
}