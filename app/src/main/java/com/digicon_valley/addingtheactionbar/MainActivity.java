package com.digicon_valley.addingtheactionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.setLogo(R.drawable.baseline_android_black_18dp);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();

        menuInflater.inflate(R.menu.activity_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.search_id:
                Toast.makeText(getApplicationContext(), "Search Option Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.setting_id:
                Toast.makeText(getApplicationContext(),"Setting Option Selected",Toast.LENGTH_SHORT).show();
                return  true;
                default:
        return super.onOptionsItemSelected(item);
    }
}

    public void ChildOne(View view) {
        Intent intent=new Intent(this,Child_One_Activity.class);
        startActivity(intent);
    }
}
