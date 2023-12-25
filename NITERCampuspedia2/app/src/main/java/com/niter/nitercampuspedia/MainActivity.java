package com.niter.nitercampuspedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn14=findViewById(R.id.btn14);
        btn15=findViewById(R.id.btn15);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about;
                about= new Intent(MainActivity.this,AboutNITER.class);
                startActivity(about);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent history;
                history=new Intent(MainActivity.this,History.class);
                startActivity(history);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://niter.edu.bd/");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://niternotebot.web.app/");
            }
        });



        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/%E0%A6%9C%E0%A6%BE%E0%A6%A4%E0%A7%80%E0%A7%9F+%E0%A6%AC%E0%A6%B8%E0%A7%8D%E0%A6%A4%E0%A7%8D%E0%A6%B0+%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%95%E0%A7%8C%E0%A6%B6%E0%A6%B2+%E0%A6%93+%E0%A6%97%E0%A6%AC%E0%A7%87%E0%A6%B7%E0%A6%A3%E0%A6%BE+%E0%A6%87%E0%A6%A8%E0%A6%B8%E0%A7%8D%E0%A6%9F%E0%A6%BF%E0%A6%9F%E0%A6%BF%E0%A6%89%E0%A6%9F+-+%E0%A6%A8%E0%A6%BF%E0%A6%9F%E0%A6%BE%E0%A6%B0/@23.9169009,90.2293731,17z/data=!3m1!4b1!4m6!3m5!1s0x3755e8dae5260da7:0x20a78235074c8264!8m2!3d23.9169009!4d90.231948!16s%2Fm%2F0_qjq4y?entry=ttu");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent admin;
                admin=new Intent(MainActivity.this,admin.class);
                startActivity(admin);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent academic1;
                academic1=new Intent(MainActivity.this,academic1.class);
                startActivity(academic1);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent academic2;
                academic2=new Intent(MainActivity.this,academic2.class);
                startActivity(academic2);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent teacher;
                teacher=new Intent(MainActivity.this,teacher.class);
                startActivity(teacher);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boys;
                boys=new Intent(MainActivity.this,boys.class);
                startActivity(boys);
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent girls;
                girls=new Intent(MainActivity.this,girls.class);
                startActivity(girls);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent canteen;
                canteen=new Intent(MainActivity.this,canteen.class);
                startActivity(canteen);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transports;
                transports=new Intent(MainActivity.this,transports.class);
                startActivity(transports);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clubs;
                clubs=new Intent(MainActivity.this,clubs.class);
                startActivity(clubs);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent others;
                others=new Intent(MainActivity.this,others.class);
                startActivity(others);
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void gotoUrl(String s){
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("About this app");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getTitle().equals("About this app")){
            // Create an Intent to start the AboutApp activity
            Intent aboutAppIntent = new Intent(MainActivity.this, AboutApp.class);

            // Start the AboutApp activity
            startActivity(aboutAppIntent);

            return true; // Indicate that the item click is handled
        }
        return super.onOptionsItemSelected(item);
    }

}