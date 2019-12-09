<%@page import="com.best.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.best.service.*" %>
<%
StudentService studentService=new StudentService();
String name=request.getParameter("name");
String nrc=request.getParameter("nrc");
String phNo=request.getParameter("phno");
int age=Integer.parseInt(request.getParameter("age"));

Student std=new Student(0,name,age,nrc,phNo,2,"");
studentService.addStudent(std);
%>