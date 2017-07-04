package com.example.baadjie.myquizapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Finish extends AppCompatActivity {

    TextView txtScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

       // SportsQuiz c=new SportsQuiz();
        txtScore = (TextView)findViewById(R.id.textView);
       // String display = String.valueOf(c.score+1);

        //txtScore.setText(display);



        //tvResults.setText("ghghghghg  " +results);





    }
    public void home(View view){

        Intent intent=new Intent(Finish.this,MainActivity.class);
        startActivity(intent);
    }
}
