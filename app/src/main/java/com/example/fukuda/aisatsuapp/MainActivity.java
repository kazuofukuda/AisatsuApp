package com.example.fukuda.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //ボタンと変数をインスタンス化
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          TextView mTextView;

            Button button1 = (Button) findViewById(R.id.button1);
            button1.setOnClickListener(this);

             mTextView = (TextView) findViewById(R.id.textView);

       //チェック時の動作を組み込む
        @Override
        public void onClick(View v) {
            showTimePickerDialog();
        }


            private void showTimePickerDialog() {
                TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                        new TimePickerDialog.OnTimeSetListener() {

                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                if (hourOfDay >= 2 && hourOfDay < 10)  {
                                    mTextView.setText("おはよう");
                                } else if (hourOfDay >= 10 && hourOfDay < 17)  {
                                    mTextView.setText("こんにちは");
                                } else if(hourOfDay >= 18 && hourOfDay < 24)  {
                                    mTextView.setText("こんばんわ");
                                }else if(hourOfDay >= 1 && hourOfDay < 2)  {
                                    mTextView.setText("こんばんわ");
                                }
                            }
                        },
                        13, // 初期値（時間）
                        0,  // 初期値（分）
                        true);
                timePickerDialog.show();
            }


}

