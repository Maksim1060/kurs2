package kurs2.com.example.demo.entity.service.service;

import kurs2.com.example.demo.entity.Question;

import java.util.Collection;

public interface ExamService  {
    Collection<Question> getQuestions(int size);

}
