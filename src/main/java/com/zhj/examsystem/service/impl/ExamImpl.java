package com.zhj.examsystem.service.impl;

import com.zhj.examsystem.dao.ExamDao;
import com.zhj.examsystem.entity.Exam;
import com.zhj.examsystem.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamImpl implements ExamService {

    @Autowired
    private ExamDao examDao;

    public List<Exam> getExamList() {
        return examDao.getExamList();
    }
}
