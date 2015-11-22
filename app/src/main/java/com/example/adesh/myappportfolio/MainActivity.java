package com.example.adesh.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    Button[] buttons = new Button[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        buttons[0] = (Button) findViewById(R.id.buttonp1);
        buttons[1] = (Button) findViewById(R.id.buttonp2);
        buttons[2] = (Button) findViewById(R.id.buttonp3);
        buttons[3] = (Button) findViewById(R.id.buttonp4);
        buttons[4] = (Button) findViewById(R.id.buttonp5);
        buttons[5] = (Button) findViewById(R.id.buttonp6);

        for(int i=0;i<6;i++){
            buttons[i].setOnClickListener(this);

        }
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
        Toast.makeText(this,"This button will launch " + ((Button)v).getText(),Toast.LENGTH_SHORT).show();
    }
}
