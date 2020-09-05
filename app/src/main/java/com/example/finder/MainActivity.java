package com.example.finder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button Login_Page,Register_page,admin1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login_Page=findViewById(R.id.welcome);
        Register_page=findViewById(R.id.Login);
        admin1=findViewById(R.id.Admin);
        Login_Page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),Login_Activity.class);
                startActivity(i1);
            }
        });
        Register_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i2);
            }
        });

        admin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(getApplicationContext(),Admin.class);
                startActivity(i3) ;
            }
        });
    }
}
