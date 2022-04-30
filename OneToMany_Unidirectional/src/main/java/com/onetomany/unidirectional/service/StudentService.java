package com.onetomany.unidirectional.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.onetomany.unidirectional.entity.Student;
import com.onetomany.unidirectional.repository.StudentRepository;


@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	   public List<Student> getStudents(){
	        return studentRepository.findAll();
	    }
	   
	    
//	    public Page<Student> findProductsWithPagination(int offset,int pageSize){
//	        Page<Cart> categories = studentRepository.findAll(PageRequest.of(offset, pageSize));
//	        return  categories;
//	    }
	    
	    public Student getStudent(long id){
	        Optional<Student> cart = studentRepository.findById(id);

	        return cart.get();
	    }
	    public Student addStudent(Student student){
	        return studentRepository.save(student);
	    }
	    public Student updateStudent(long id,Student student){
	    	student.setId(id);
	        return studentRepository.save(student);
	    }
	    public void deleteStudent(long id){
	    	studentRepository.deleteById(id);
	    }

	
	
}
