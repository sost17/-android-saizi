package com.col.commo.saizi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by commo on 2017/3/10.
 */

public class HoneActivity extends Activity  implements View.OnClickListener{

    private Button button;


    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(HoneActivity.this,MainActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(this);

    }
}
