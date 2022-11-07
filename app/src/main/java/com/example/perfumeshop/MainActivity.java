package com.example.perfumeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button WorkHoure = findViewById(R.id.button);
        Button CallUs = findViewById(R.id.button2);

        WorkHoure.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder B = new AlertDialog.Builder(MainActivity.this);
                B.setMessage("9:00 AM - 1:00 PM\n" +
                                "5:00 PM - 12:00 AM")
                        .setTitle("Work Hours");
                B.show();
                return true;
            }
        });

        WorkHoure.setOnClickListener(new View.OnClickListener() {
             @Override
               public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Please press long",
                     Toast.LENGTH_LONG).show();
        }
         });

        CallUs.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:966500466849"));
                startActivity(i);
            }

        });

    }
    public void About(View view){
        Intent intent = new Intent( this,MainActivity2.class );
        startActivity(intent);
    }
}