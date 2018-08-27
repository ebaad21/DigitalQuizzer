package com.quizer.dao;

import com.quizer.model.Quiz;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuizDaoImpl implements QuizDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Quiz> getQuizList() {
        Criteria criteria = getSession().createCriteria(Quiz.class);
        
        return (List<Quiz>) criteria.list();
    }

    @Override
    public Quiz saveQuiz(Quiz quiz) {
        int id = (int) getSession().save(quiz);
        quiz.setId(id);
        return quiz;
    }

    @Override
    public void deleteQuiz(int id) {
        Quiz quiz = (Quiz) getSession().get(Quiz.class,id);
        getSession().delete(quiz);
    }
    
    @Override
    public Quiz findQuizById(int id) {
        return (Quiz) getSession().get(Quiz.class, id);
    }

    
}
