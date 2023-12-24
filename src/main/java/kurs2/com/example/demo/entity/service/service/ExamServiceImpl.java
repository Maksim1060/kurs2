package kurs2.com.example.demo.entity.service.service;

import kurs2.com.example.demo.entity.Question;
import kurs2.com.example.demo.entity.service.QuestionService;
import kurs2.com.example.demo.exception.ExaminerServiceException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
public class ExamServiceImpl implements ExamService {
    private final QuestionService questionService;

    public ExamServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int size) {
        if (questionService.getAll().size() < size) {
            throw new ExaminerServiceException("Запрошено большое количемтво вопросов,чем хранится в сервисе");
        }
        Collection<Question> result = new HashSet<>();
        while (result.size() < size) {
            result.add(questionService.getRandomQuestion());
        }
        return result;
    }
}
