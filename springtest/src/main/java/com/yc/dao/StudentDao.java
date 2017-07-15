package com.yc.dao;

import com.yc.bean.Student;

public interface StudentDao {
	public void addStudent(Student student);
	
	public boolean isStudentExist(Student student);
}
