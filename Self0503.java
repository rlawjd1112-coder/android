package com.example.chapter05;

import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Self0503 extends AppCompatActivity {

    EditText edt, edt1;
    Button btn, btn1;
    TextView tview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        edt = new EditText(this);
        edt.setHint("여기에 입력하세요");

        baseLayout.addView(edt);

        btn = new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);



        tview = new TextView(this);
        tview.setText("텍스트뷰입니다.");
        tview.setTextSize(20);
        tview.setTextColor(Color.MAGENTA);
        baseLayout.addView(tview);


// 추가
        btn1 = new Button(this);
        btn1.setText("날짜 시간 버튼입니다");
        btn1.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn1);

        edt1 = new EditText(this);
        edt1.setHint("여기에 날짜 시간이 나타납니다");
        baseLayout.addView(edt1);


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                tview.setText(edt.getText().toString());
            }
        });
// 추가
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
                Date mDate = new Date();
                String time1 = format1.format(mDate);
                edt1.setText(time1);
            }
        });

    }

}
