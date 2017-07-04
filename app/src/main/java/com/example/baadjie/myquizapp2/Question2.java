package com.example.baadjie.myquizapp2;

/**
 * Created by Baadjie on 2017/06/22.
 */

public class Question2 {








    public String questions[]={" President of Nigeria ?",
            "Capital City of China ?",
            "Country with the highest population in the World ?",
            "Country with the highest population in Africa ?",
            "Capital city of Kenya ?",
            "Capital city of Brazil?" ,
            "who is the Minister of Police in SA?" ,
            "Capital city of England"};
    public String correct[]={"Muhammadu Buhari","Beijing","China","Nigeria", "Nairobi ","Rio de Geneiro","Mbalula","London" };
    public String possibleAnswers[][] = {
            {"Muhammadu Buhari","Good luck Jonathan","nwaku kanu","Dele Ali"},
            {"Beijing","Dubai","Moscow","Hong kong"},
            {"Indonesia" , "India", "China", "Ghana"},
            {"South Africa" , "Ghana", "Nigeria", "Zambia"},
            {"Nairobi", "King shasa ", "Harare", "Maputo"},
            { "Paris" ,"Cairo","Rio de Geneiro","Sao Paulo" },
            {" Dany Jordan" ,"Zuma" ,"Malema" ,   "Mbalula"   },
            {"London" ,"Paris" ,"Jamaica","Bujembura"}
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
