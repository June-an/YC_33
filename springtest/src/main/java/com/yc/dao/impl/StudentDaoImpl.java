package com.yc.dao.impl;

import java.util.Random;

import com.yc.bean.Student;
import com.yc.dao.StudentDao;

public class StudentDaoImpl implements StudentDao{
	
	public StudentDaoImpl() {
		super();
		System.out.println("student类dao对象构造方法");
	}

	@Override
	public void addStudent(Student student) {
		System.out.println("在dao中添加了"+student);
	}

	@Override
	public boolean isStudentExist(Student student) {
		Random r= new Random();
		return r.nextBoolean();
	}
	
}
