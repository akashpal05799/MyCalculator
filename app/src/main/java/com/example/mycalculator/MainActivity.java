package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText first,second;
    TextView tv;
    Button add,sub,multi,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        tv=findViewById(R.id.tv);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        multi=findViewById(R.id.multi);
        div=findViewById(R.id.div);
        tv=findViewById(R.id.tv);

    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int  f,s,res;
            f=Integer.parseInt(first.getText().toString());
            s=Integer.parseInt(second.getText().toString());
            res=f+s;
            tv.setText("Result" +res);
        }
    });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int  f,s,res;
                f=Integer.parseInt(first.getText().toString());
                s=Integer.parseInt(second.getText().toString());
                res=f-s;
                tv.setText("Result" +res);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int  f,s,res;
                f=Integer.parseInt(first.getText().toString());
                s=Integer.parseInt(second.getText().toString());
                res=f*s;
                tv.setText("Result" +res);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int  f,s,res;
                f=Integer.parseInt(first.getText().toString());
                s=Integer.parseInt(second.getText().toString());
                res=f/s;
                tv.setText("Result" +res);
            }
        });

    }
}