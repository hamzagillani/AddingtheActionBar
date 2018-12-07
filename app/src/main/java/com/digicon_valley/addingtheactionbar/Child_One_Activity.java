package com.digicon_valley.addingtheactionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Child_One_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child__one_);

        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    public void ChildTwo(View view) {
        Intent intent=new Intent(this,Child_Two_Activity.class);
        startActivity(intent);
    }
}
