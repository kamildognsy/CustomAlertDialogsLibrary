package com.my.customalertdialogslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.my.customalertlib.CustomAlertDialogs;

public class MainActivity extends AppCompatActivity {
    CustomAlertDialogs alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alert = new CustomAlertDialogs(MainActivity.this);
        alert.showThreeButtonAlertDialog();
    }
}