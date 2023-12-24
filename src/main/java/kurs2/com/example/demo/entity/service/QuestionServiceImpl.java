package kurs2.com.example.demo.entity.service;

import kurs2.com.example.demo.entity.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
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

    }
}
