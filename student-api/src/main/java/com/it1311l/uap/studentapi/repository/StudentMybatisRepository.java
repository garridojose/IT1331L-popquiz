package com.it1311l.uap.studentapi.repository;

import org.apache.ibatis.annotations.Insert;

import com.it1311l.uap.studentapi.model.StudentInfo;

public interface StudentMybatisRepository {
	@Insert("INSERT INTO attendees(firstName, middleName, lastName, course, age) VALUES (#{firstName}, #{middleName}, #{lastName}, #{course}, #{age})")
	public int insert(StudentInfo student_info);
}
