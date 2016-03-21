package com.example.prasadtumma.mlp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.james.biuedittext.BiuEditText;

public class MainActivity extends AppCompatActivity {

    private BiuEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (BiuEditText) findViewById(R.id.animated_edittext);
    }
}
