package com.example.canbay.englishforkids;

import android.widget.ImageView;

/**
 * Created by canbay on 24.12.2016.
 */

public class Question {
    private int id;
    private String QUESTION;
    private String ANSWER;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String OptionD;
    private ImageView QUESTIONImage;

    public Question(){
        id=0;
        QUESTION="";
        ANSWER="";
        OptionA="";
        OptionB="";
        OptionC="";
        OptionD="";
    }

    public Question(String question, String opA, String opB, String opC,String opD,
                    String ansWer) {

        QUESTION = question;
        OptionA = opA;
        OptionB = opB;
        OptionC = opC;
        OptionD = opD;
        ANSWER = ansWer;
    }
    public Question(ImageView question, String opA, String opB, String opC, String opD,
                    String ansWer) {

        QUESTIONImage = question;
        OptionA = opA;
        OptionB = opB;
        OptionC = opC;
        OptionD = opD;
        ANSWER = ansWer;
    }

    public int getId() {
        return id;
    }

    public ImageView getQUESTIONImage() {
        return QUESTIONImage;
    }

    public void setQUESTIONImage(ImageView QUESTIONImage) {
        this.QUESTIONImage = QUESTIONImage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public void setANSWER(String ANSWER) {
        this.ANSWER = ANSWER;
    }

    public String getOptionA() {
        return OptionA;
    }

    public void setOptionA(String optionA) {
        OptionA = optionA;
    }

    public String getOptionB() {
        return OptionB;
    }

    public void setOptionB(String optionB) {
        OptionB = optionB;
    }

    public String getOptionC() {
        return OptionC;
    }

    public void setOptionC(String optionC) {
        OptionC = optionC;
    }

    public String getOptionD() {
        return OptionD;
    }

    public void setOptionD(String optionD) {
        OptionD = optionD;
    }
}