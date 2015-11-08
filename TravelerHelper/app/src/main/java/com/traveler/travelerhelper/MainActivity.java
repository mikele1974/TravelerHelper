package com.traveler.travelerhelper;
import android.content.Intent;
import android.view.View.OnClickListener;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button btnIdSettings;
    Button btnIdPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnIdSettings=(Button) findViewById(R.id.idSettings);
        btnIdSettings.setOnClickListener(this);
        btnIdPosition=(Button) findViewById(R.id.idPosition);
        btnIdPosition.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

     switch(v.getId()) {
         case R.id.idSettings:
            // TO DO
             Intent intentSet = new Intent(this, Settings.class);
             startActivity(intentSet);
             break;
         case R.id.idPosition:
             Intent intentPos= new Intent(this, Position.class);
             startActivity(intentPos);
             break;
         default:
             break;
     }
    }

}
