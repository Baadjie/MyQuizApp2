package com.example.baadjie.myquizapp2;

/**
 * Created by Baadjie on 2017/06/22.
 */

public class Questions {




    public String questions[]={" main sponser of Kaizer Chiefs ?",
            "What is the name of Chelsea home ground  ?",
            "Who was the goalkeeper of Arsenal during their 2003/2004 undefeated Season ?",
            "England player to be sent off at the new Wembley Stadium ?",
            "Youngest player to score in Manchester Derby ?",
            "Who is Uefa all time top goal scorer ?" ,
            "Who is Kaizer Chiefs Captain ?" ,
            "Fastest bowler"};
    public String correct[]={"Vodacom","StamfordBridge","Jens Lehmann","Gerrard", "Rashford ","Christiano Ronaldo","Khune","Rabada" };
    public String possibleAnswers[][] = {
            {"Hollard","Black Label","Toyota","Vodacom"},
            {"Old Traford","Camp nou","StamfordBridge","Elthad"},
            {"Jens Lehmann" , "Les Grobler", "Edin Van desar", "Answer 3"},
            {"Viera" , "Gerrard", "Ronaldo", "Casilas"},
            {"Sane", "Rashford ", "Aguero", "Ronney"},
            { "Ronaldinho" ,"Christiano Ronaldo","Zidane","Messi" },
            {" Mathoho" ,"Lebese" ,"Khune" ,   "Tshabalala"   },
            {"AB de Villiers" ,"de kock" ,"Hashim Amla","Rabada"}
    };

    public String getQuestions(int x) {
        String question = questions[x];
        return question;
    }

    public String getCorrect(int x) {
        String correctAnswer = correct[x];
        return correctAnswer;
    }

    public String getPossibleAnswers1(int x) {
        String answer = possibleAnswers[x][0];
        return answer;
    }

    public String getPossibleAnswers2(int x) {
        String answer = possibleAnswers[x][1];
        return answer;
    }

    public String getPossibleAnswers3(int x) {
        String answer = possibleAnswers[x][2];
        return answer;
    }

    public String getPossibleAnswers4(int x) {
        String answer = possibleAnswers[x][3];
        return answer;
    }
}
