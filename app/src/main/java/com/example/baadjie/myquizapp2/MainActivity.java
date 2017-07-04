package com.example.baadjie.myquizapp2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void foot(View view){


        AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);



        dialog.setTitle("Quiz Instructions")   ;


        dialog.setMessage("The quizzes consists of questiions to help you to assess your self. Each question in the quiz is of multiple-choice  \n\n.Read each question carefully and click the correct answer then click Submit button \n\n The total score for the quiz is based on your responses to all questions\n\n However your quiz will not be graded ,if you skip a question or exit before responding to all questions");



        dialog.setPositiveButton(" Start ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent=new Intent(MainActivity.this,Sports.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });
        dialog.setNegativeButton(" Cancel ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }
    public void world(View view){


        AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);



        dialog.setTitle("Quiz Instructions")   ;


        dialog.setMessage("The quizzes consists of questiions to help you to assess your self. Each question in the quiz is of multiple-choice  \n\n.Read each question carefully and click the correct answer then click Submit button \n\n The total score for the quiz is based on your responses to all questions\n\n However your quiz will not be graded ,if you skip a question or exit before responding to all questions");



        dialog.setPositiveButton(" Start ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

               Intent intent=new Intent(MainActivity.this,World.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });
        dialog.setNegativeButton(" Cancel ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}
