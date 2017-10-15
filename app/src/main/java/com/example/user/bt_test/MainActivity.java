package com.example.user.bt_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button pre,next;
    TextView txt;

    ArrayList<Pictures> arr = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
    int pos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        initData();
        addEvent();
        initData2();
        addEvent2();


    }

    private void addEvent2() {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if (pos==arr.size()) pos=arr.size()-1;
                img.setImageResource(arr2.get(pos));
            }
        });
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos--;
                if (pos<0) pos=0;
                img.setImageResource(arr2.get(pos));
            }
        });
    }

    private void initData2() {
        arr2.add(R.drawable.flower1);
        arr2.add(R.drawable.flower2);
        arr2.add(R.drawable.flower3);
    }

    private void addEvent() {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if (pos==arr.size()) pos=0;
                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos--;
                if (pos<0)
                    pos=arr.size()-1;
                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });
    }

    private void initData() {
        arr.add(new Pictures(R.drawable.flower1,"1 of 7"));
        arr.add(new Pictures(R.drawable.flower2,"2 of 7"));
        arr.add(new Pictures(R.drawable.flower3,"3 of 7"));

        img.setImageResource(arr.get(pos).getImage());
        txt.setText(arr.get(pos).getText());
    }

    private void addControl() {
        img = (ImageView) findViewById(R.id.image);
        pre = (Button) findViewById(R.id.button1);
        next = (Button) findViewById(R.id.button2);
        txt = (TextView) findViewById(R.id.txt2);
    }

}
