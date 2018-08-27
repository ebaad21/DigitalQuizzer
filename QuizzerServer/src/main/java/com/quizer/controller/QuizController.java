package com.quizer.controller;

import com.quizer.model.Quiz;
import com.quizer.service.QuizService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
    
    @Autowired
    QuizService quizService;

    //quiz list mapping
    @RequestMapping(value="/quizes/" , method=RequestMethod.GET , headers="Accept=application/json")
    public @ResponseBody List<Quiz> getQuizList(){
        List<Quiz> quizes = quizService.getQuizList();
        
        return quizes;
    }

    //add a quiz mapping
    @RequestMapping(value="/addquiz/" , method=RequestMethod.POST)
    public @ResponseBody Quiz add(@RequestBody Quiz quiz){
        
        return quizService.saveQuiz(quiz);
        
    }
    
    //update quiz maping
    @RequestMapping(value="/updatequiz/{id}" , method=RequestMethod.PUT)
    public @ResponseBody Quiz update(@PathVariable("id") int id, @RequestBody Quiz quiz ){
        quiz.setId(id);
        quizService.saveOrUpdate(quiz);
        
        return quiz;
    }
    
    //delete quiz mapping
    @RequestMapping(value="/deletequiz/{id}" , method=RequestMethod.DELETE)
    public @ResponseBody Quiz delete(@PathVariable("id") int id){ 
        Quiz quiz = quizService.findQuizById(id);
        quizService.deleteQuiz(id);
        
        return quiz;
    }

    
}
