package com.zhj.examsystem.web;

import com.zhj.examsystem.dao.ExamDao;
import com.zhj.examsystem.entity.Exam;
import com.zhj.examsystem.entity.User;
import com.zhj.examsystem.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExamController {
    @Autowired
    private ExamService examService;

    @RequestMapping(value = "/examlist", method = RequestMethod.GET)
    public List<Exam> getExamList() {
        List<Exam> examList = examService.getExamList();
        return examList;
    }

    public  Object getExamListObj(){
        List<Exam> examList = examService.getExamList();
        return  new Object();
    }
}
