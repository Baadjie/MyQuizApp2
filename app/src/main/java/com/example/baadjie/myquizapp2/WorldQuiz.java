package com.example.baadjie.myquizapp2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WorldQuiz extends AppCompatActivity {



    TextView question;
    Button btnAnswer;
    RadioButton rd1, rd2, rd3, rd4;
    RadioGroup group;
    Random r;
    public static final String ANSWERl="answer";
    private String intentanswer;
    //Creating object of the class
    Question2 mQuestion2 = new Question2();
    //Creating legth of the questions in an array
    String cAnswer;
    public static int score = 0;
    int qLength=0, increment=0, questionNum=1;
    //Convert Array to List
    List<String> myQuestionList = Arrays.asList(mQuestion2.questions);
    List<String> myCorrectList = Arrays.asList(mQuestion2.correct);
    List<String[]> myPossibleList = Arrays.asList(mQuestion2.possibleAnswers);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_quiz);

        rd1 = (RadioButton)findViewById(R.id.radioButton6);
        rd2 = (RadioButton)findViewById(R.id.radioButton7);
        rd3 = (RadioButton)findViewById(R.id.radioButton8);
        rd4 = (RadioButton)findViewById(R.id.radioButton9);
        btnAnswer = (Button)findViewById(R.id.button5);
        question = (TextView)findViewById(R.id.textView7);
        group= (RadioGroup) findViewById(R.id.rdg);

        r = new Random();
        qLength = mQuestion2.questions.length;

        shuffle();
        updateQuestion(myQuestionList.indexOf(myQuestionList.get(increment)));
        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment++;
                if (increment !=qLength) { //Check [if all questions are answered
                    if (rd1.getText().toString().equalsIgnoreCase(cAnswer)) {
                        if (rd1.isChecked()) {
                            score++;
                            questionNum++;

                        }
                        updateQuestion(myQuestionList.indexOf(myQuestionList.get(increment)));
                    } else if (rd2.getText().toString().equalsIgnoreCase(cAnswer)) {
                        if (rd2.isChecked()) {
                            score++;
                            questionNum++;
                            //increment++;
                        }
                        updateQuestion(myQuestionList.indexOf(myQuestionList.get(increment)));
                    } else if (rd3.getText().toString().equalsIgnoreCase(cAnswer)) {
                        if (rd3.isChecked()) {
                            score++;
                            questionNum++;
                            //increment++;
                        }
                        updateQuestion(myQuestionList.indexOf(myQuestionList.get(increment)));
                    } else if (rd4.getText().toString().equalsIgnoreCase(cAnswer)) {
                        if (rd4.isChecked()) {
                            score++;
                            questionNum++;
                            //increment++;
                        }
                        updateQuestion(myQuestionList.indexOf(myQuestionList.get(increment)));
                    }
                    // Toast.makeText(SportsQuiz.this, "" + score, Toast.LENGTH_LONG).show();

                } else {
                    //Game Over
//                    Intent i = new Intent(MainActivity.this, Finish.class);
//                    startActivity(i);
//                    Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_LONG).show();

                    gameOver();
                }
                System.out.println(score);


            }

        });

    }
    public void updateQuestion(int num){

        question.setText(mQuestion2.getQuestions(num));

        rd1.setText(mQuestion2.getPossibleAnswers1(num));
        rd2.setText(mQuestion2.getPossibleAnswers2(num));
        rd3.setText(mQuestion2.getPossibleAnswers3(num));
        rd4.setText(mQuestion2.getPossibleAnswers4(num));

        cAnswer = mQuestion2.getCorrect(num);
    }

    private void shuffle(){
        long var = System.nanoTime();

        Collections.shuffle(myQuestionList, new Random(var));
        Collections.shuffle(myCorrectList, new Random(var));
        Collections.shuffle(myPossibleList, new Random(var));
    }

    void gameOver(){
        final AlertDialog.Builder alertBuilder = new  AlertDialog.Builder(WorldQuiz.this);
        alertBuilder.setTitle("RESULTS");
        alertBuilder.setMessage(" Your Score is   " + score +"   "+"out of 8"+"THANK YOU!!!");
        alertBuilder.setNegativeButton(" Ok ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface alertBuilder, int which) {
                alertBuilder.dismiss();


                Intent intent=new Intent(WorldQuiz.this,Finish.class);
                startActivity(intent);

            }
        });
        alertBuilder.show();



    }
}
