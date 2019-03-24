package com.zhj.examsystem.service;

import com.zhj.examsystem.entity.Exam;

import java.util.List;

public interface ExamService {
    /**
     * 获取考试列表
     * @return
     */
    List<Exam> getExamList();
}
