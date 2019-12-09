package com.best.service;
import java.util.*;

import com.best.dao.*;
import com.best.model.*;

public class StudentService {
	private StudentDao stdDao;
	
	public StudentService() {
		stdDao=new StudentDao();
	}
	
	public void addStudent(Student std) {
		stdDao.saveStudent(std);
	}
	
	public List<Student> getStudentList(){
		return stdDao.getStudentList();
	}
	

}
