package com.example.quiz;

public class Question {
    private String mQuestion[]={"How many Bones does an adult human body have?",
            "What refer to performance of heart?",
            "What is the name of biggest part of the brain?",
            "_______ is a component of nervous system."};
    private String mchoices[][]={
            {"206","205","207"},
            {"Heart Size","Heart's Location","Heart Rate"},
            {"Cerebrum","Cerebellum","Thalamus"},
            {"Bone","Neuron","Muscle"}
    };
    private String mCorrect[]={"206","Heart Rate","Cerebellum","Neuron"};
    public String getQuestion(int a){
        String ques=mQuestion[a];
        return ques;
    }
    public String getChoice1(int a){
        String Choice1=mchoices[a][0];
        return Choice1;
    }
    public String getChoice2(int a){
        String Choice2=mchoices[a][1];
        return Choice2;
    }
    public String getChoice3(int a){
        String Choice3=mchoices[a][2];
        return Choice3;
    }
    public  String getCorrect(int a){
        String c=mCorrect[a];
        return c;
    }
}
