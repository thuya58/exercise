package com.best.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.best.model.Student;


public class StudentDao {
	public void saveStudent(Student std) {
		try {
			Connection con=ConnectionManager.getConnection();
			String sql="insert into Student(name,age,nrc,phoneNo,ClassId) values(?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, std.getName());
			pstmt.setInt(2, std.getAge());
			pstmt.setString(3, std.getNrc());
			pstmt.setString(4, std.getPhno());
			pstmt.setInt(5, std.getClassId());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void updateStudent(Student std) {
		
	}
	public void deleteStudent(Student std) {
		
	}
	public List<Student> getStudentList(){
		List<Student> stdList=new ArrayList<Student>();
		 
		String sql="select s.*,c.ClassName FROM Student s left join classes c ON s.ClassId=c.Id;";
		try {
			Connection con=ConnectionManager.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				int id=rs.getInt("Id");
				String name=rs.getString("Name");
				String nrc=rs.getString("Nrc");
				int age=rs.getInt("Age");
				String phNo=rs.getString("PhoneNo");
				String className=rs.getString("ClassName");
				Student std=new Student(id, name, age, nrc, phNo, 0,className);
				stdList.add(std);
			}
			return stdList;
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
