package ru.geekbrains.myapplication01;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class calendarActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
    }
}
