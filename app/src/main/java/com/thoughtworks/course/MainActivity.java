package com.thoughtworks.course;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.thoughtworks.course.activities.CreateCourseActivity;
import com.thoughtworks.course.activities.FindAllActivity;

public class MainActivity extends AppCompatActivity {
    private Button createCourseBtn;
    private Button deleteCourseBtn;
    private Button findAllCoursesBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCourseBtn = findViewById(R.id.add);
        createCourseBtn.setOnClickListener(view -> {
            goAddCourseActivity();
        });

        findAllCoursesBtn = findViewById(R.id.find_all);
        findAllCoursesBtn.setOnClickListener(view -> {
            finishAffinity();
        });
    }

    private void goAddCourseActivity() {
        Intent intent = new Intent(this, CreateCourseActivity.class);
        startActivity(intent);
    }

    private void goFindAllCourseActivity() {
        Intent intent = new Intent(this, FindAllActivity.class);
        startActivity(intent);
    }
}