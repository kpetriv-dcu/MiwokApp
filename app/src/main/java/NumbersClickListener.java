package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NumbersClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(), "Open the Numbers Activity", Toast.LENGTH_SHORT).show();
    }
}
