package com.it1311l.uap.studentapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.it1311l.uap.studentapi.model.StudentInfo;
import com.it1311l.uap.studentapi.model.StudentRatings;

@Mapper
public interface StudentMybatisRepository {
	@Insert
	("INSERT INTO student_info(studentName, avgGrade) VALUES (#{studentName}, #{avgGrade})" + "INSERT INTO student_ratings(name, grade) VALUES (#{name}, #{grade})")
	public int insert(StudentInfo student_info);
	public int insert(StudentRatings student_rating);
}