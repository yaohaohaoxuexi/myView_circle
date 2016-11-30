package com.hao.mycircleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hao.mycircleview.bean.PieData;
import com.hao.mycircleview.view.MyView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyView myView = (MyView) findViewById(R.id.myView);

        ArrayList<PieData> list = new ArrayList<PieData>();
        list.add(new PieData(0xFFCCFF00, 60));
        list.add(new PieData(0xFF6495ED, 120));
        list.add(new PieData(0xFFE32636, 30));
        list.add(new PieData(0xFF800000, 90));
        list.add(new PieData(0xFF808000, 60));
        myView.setPieData(list);
    }
}
