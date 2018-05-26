package com.col.commo.saizi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        textView = (TextView) findViewById(R.id.textView);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String num= "num" ;
//                String t = "t";
                int num1 = (int) (Math.random() *6);
                int num2 = (int) (Math.random() *6);
                int num3 = (int) (Math.random() *6);

//                int i = 0 , j =0;
//                int sum = 0;
//
//                for( i = 0 ; i < 3 ; i ++){
//
//                    switch (Integer.parseInt(num+i)){
//                        for (j = 1 ; j <= 6 ; j ++){
//                            imageView1.setImageResource(R.mipmap.t2);(Integer.valueOf(t+String.valueOf(j))))
//                            imageView2.setImageResource(R.mipmap.t2);
//                            imageView3.setImageResource(R.mipmap.t2);
//                        }
//
//
//                    }
//                    sum += Integer.parseInt(num+i);
//
//                }

                switch (num1) {
                    case 0:
                        imageView1.setImageResource(R.mipmap.t1);
                        break;
                    case 1:
                        imageView1.setImageResource(R.mipmap.t2);
                        break;
                    case 2:
                        imageView1.setImageResource(R.mipmap.t3);
                        break;
                    case 3:
                        imageView1.setImageResource(R.mipmap.t4);
                        break;
                    case 4:
                        imageView1.setImageResource(R.mipmap.t5);
                        break;
                    case 5:
                        imageView1.setImageResource(R.mipmap.t6);
                        break;
                }

                switch (num2) {
                    case 0:
                        imageView2.setImageResource(R.mipmap.t1);
                        break;
                    case 1:
                        imageView2.setImageResource(R.mipmap.t2);
                        break;
                    case 2:
                        imageView2.setImageResource(R.mipmap.t3);
                        break;
                    case 3:
                        imageView2.setImageResource(R.mipmap.t4);
                        break;
                    case 4:
                        imageView2.setImageResource(R.mipmap.t5);
                        break;
                    case 5:
                        imageView2.setImageResource(R.mipmap.t6);
                        break;
                }

                switch (num3) {
                    case 0:
                        imageView3.setImageResource(R.mipmap.t1);
                        break;
                    case 1:
                        imageView3.setImageResource(R.mipmap.t2);
                        break;
                    case 2:
                        imageView3.setImageResource(R.mipmap.t3);
                        break;
                    case 3:
                        imageView3.setImageResource(R.mipmap.t4);
                        break;
                    case 4:
                        imageView3.setImageResource(R.mipmap.t5);
                        break;
                    case 5:
                        imageView3.setImageResource(R.mipmap.t6);
                        break;
                }
                int sum = 0;
                sum = num1 + num2 + num3 + 3;
                textView.setText("大小为"+sum);
            }
        });


    }
}
