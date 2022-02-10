package com.shankarlohar.shankarloharsandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {

                new Project("Geting Started App", "Our very first project, the default 'Hellow World' App!", R.drawable.getting_started),
                new Project("Motivational Quote App", "Our very second project, Making a simple change to the layout, with my own personal motivational quote for software developers", R.drawable.quote),
                new Project("BMI Calculator App", "Our very third project, A real life working BMI calculator teaching me variables, methods and conditional logic", R.drawable.calculator),
                new Project("Inches Converter App", "Our very fourth project, A basic converter convert inches to meters", R.drawable.tape),
                new Project("Fake Restaurant App", "Our very fifth project, A menu app for fitctional restaurant, learnt about activities classes and objects, array, intents and listviews", R.drawable.hungry_developer)
        };

        ProjectAdapter adapter = new ProjectAdapter(projects);

        list.setAdapter(adapter);

    }
}