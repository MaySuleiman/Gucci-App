package com.example.perfumeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void BackMainActivity2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void GoTOTheFirstProduct (View view) {
        Toast.makeText(MainActivity3.this, "GUCCI FLORA\n"+
                        "       400SR   ",
                Toast.LENGTH_SHORT).show();
}
    public void GoTOTheSecondProduct(View view) {
        Toast.makeText(MainActivity3.this, "GUCCI BAMBOO\n"+
                        "         250SR   ",
                Toast.LENGTH_SHORT).show();
}

    public void GoTOTheThirdProduct(View view) {
        Toast.makeText(MainActivity3.this, "GUCCI BLOOM\n"+
                        "       343SR   ",
                Toast.LENGTH_SHORT).show();
}

    public void GoTOTheFourthProduct(View view) {
        Toast.makeText(MainActivity3.this, "    GUCCI BAMBOO  \n"+
                " AMBROSIA DI FIORI \n"+
                        "             526SR      ",
                Toast.LENGTH_SHORT).show();
}

    public void GoTOTheFifthProduct(View view) {
        Toast.makeText(MainActivity3.this, "  GUCCI GUILTY  \n"+
                        "  POUR FEMME \n"+
                        "        369SR     ",
                Toast.LENGTH_SHORT).show();
}

    public void GoTOTheSixthProduct(View view) {
        Toast.makeText(MainActivity3.this, "            GUCCI GUILTY     \n"+
                        " ABSOLUTE POUR FEMME \n"+
                        "                 490SR        ",
                Toast.LENGTH_SHORT).show();
}}