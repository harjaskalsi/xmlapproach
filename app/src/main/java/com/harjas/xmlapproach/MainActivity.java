package com.harjas.xmlapproach;

import androidx.appcompat.app.AppCompatActivity;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View v)
    {
        Toast.makeText(this, "I am HARJAS made toast", Toast.LENGTH_LONG).show();
    }


}
