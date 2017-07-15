package com.yc.biz.impl;

import com.yc.bean.Student;
import com.yc.biz.StudentBiz;
import com.yc.dao.StudentDao;

public class StudentImpl implements StudentBiz{
	private StudentDao studentDao;
	
	public StudentImpl() {
		super();
		System.out.println("student类业务对象构造方法");
	}

	@Override
	public void addStudent(Student student) {
		if(studentDao.isStudentExist(student)){
			throw new RuntimeException("学生已经存在，不能添加");
		}
		studentDao.addStudent(student);
	}
	
	public void setStudentDao(StudentDao studentDao){
		this.studentDao = studentDao;
		System.out.println("spring悄悄地将studentDao对象注入到studentImpl中");
	}

}
