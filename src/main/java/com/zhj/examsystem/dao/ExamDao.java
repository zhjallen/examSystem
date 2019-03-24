package com.zhj.examsystem.dao;

import com.zhj.examsystem.entity.Exam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExamDao {
    @Select("SELECT * from exam")
    List<Exam> getExamList();
//    @Insert("")
    Exam addExam();
}
