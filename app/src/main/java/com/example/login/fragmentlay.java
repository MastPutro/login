package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fragmentlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentlay);
        ImageView homef = findViewById(R.id.homefrag);
        ImageView menuf = findViewById(R.id.menufrag);
        ImageView personf = findViewById(R.id.personfrag);
        ImageView mailf = findViewById(R.id.mailfrag);

        defaultfrag();

        homef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.fcontainer, new fhome());
                ft.commit();
            }
        });
        menuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.fcontainer, new fmenu());
                ft.commit();
            }
        });
        personf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.fcontainer, new fperson());
                ft.commit();
            }
        });
        mailf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.fcontainer, new fmail());
                ft.commit();
            }
        });

    }
    public void defaultfrag (){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fcontainer, new fhome());
        ft.commit();
    }
}