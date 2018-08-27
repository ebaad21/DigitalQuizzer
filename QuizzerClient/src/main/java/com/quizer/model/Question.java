package com.quizer.model;

public class Question {

    private int id;
    private String question;
    private String answer;
    private int marks;
    private Quiz quiz;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion(){
        return question;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    public void setMarks(int marks) {
        this.marks = marks;
    }
   
    public int getMarks() {
        return marks;
    }
    
    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
   
    public Quiz getQuiz() {
        return quiz;
    }
    
}
