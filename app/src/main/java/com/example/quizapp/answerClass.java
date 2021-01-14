package com.example.quizapp;

public class answerClass {


    private int optionA,optionB,optionC,optionD,questionId,answerId;

    public answerClass(int questionIde,int optiona,int optionb,int optionc,int optiond,int answeride)
    {
        questionId=questionIde;
        optionA=optiona;
        optionB=optionb;
        optionC=optionc;
        optionD=optiond;
        answerId=answeride;

    }

    public int getOptionA() {

        return optionA;
    }

    public int getOptionB() {

        return optionB;
    }

    public int getOptionC() {

        return optionC;
    }

    public int getOptionD() {

        return optionD;
    }

    public int getQuestionId() {

        return questionId;
    }

    public int getAnswerId() {

        return answerId;
    }
}







