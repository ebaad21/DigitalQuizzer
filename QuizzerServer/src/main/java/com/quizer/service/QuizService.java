package com.quizer.service;

import com.quizer.model.Quiz;
import java.util.List;

public interface QuizService {

    public List<Quiz> getQuizList();
    
    public Quiz saveQuiz(Quiz quiz);
    
    public Quiz saveOrUpdate(Quiz quiz);
    
    public void deleteQuiz(int id);
    
    public Quiz findQuizById(int id);
    
}
