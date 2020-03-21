package com.bytedance.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity");

        final Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count % 3 ==0)
                    textView.setText("团长你在干什么啊!");
                else if(count %3 == 1)
                        textView.setText("不要停下来啊！");
                else
                    textView.setText("全部木大");
                count += 1;
                }

        });


        }
    }

