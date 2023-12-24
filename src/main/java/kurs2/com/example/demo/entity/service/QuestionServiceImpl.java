package kurs2.com.example.demo.entity.service;

import kurs2.com.example.demo.entity.Question;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.*;

@Service
public class QuestionServiceImpl implements QuestionService {
    private Collection<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        questions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(String question, String answer) {
        Question questionForRemove = new Question(question, answer);
        questions.remove(questionForRemove);
        return questionForRemove;

    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        int randomIdx = new Random().nextInt(questions.size());
       return new  ArrayList<>(questions).get(randomIdx);
    }
}
