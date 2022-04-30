package com.onetomany.unidirectional.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.unidirectional.entity.Student;
import com.onetomany.unidirectional.repository.StudentRepository;
import com.onetomany.unidirectional.service.StudentService;


@RestController
@RequestMapping(value = "student")
public class StudentController {

	 @Autowired
	  private StudentService studentService;
	    @Autowired
	    private StudentRepository itemRepository;

	    @GetMapping
	    public List<Student> getItems(){
	        return studentService.getStudents();
	    }
	    @GetMapping("/{id}")
	    public Student getItemById(@PathVariable long id){
	        return studentService.getStudent(id);
	    }
	    
//	    @GetMapping("/custom")
//	    public List<OrderResponse> getCustomCategory(){
//	        return categoryRepository.getJoinInformation();
//	    }
	    
//	    @GetMapping("/pagination/{offset}/{pageSize}")
//	    private APIResponse<Page<Cart>> getProductsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
//	        Page<Cart> productsWithPagination = categoryService.findProductsWithPagination(offset, pageSize);
//	        return new APIResponse<>(productsWithPagination.getSize(), productsWithPagination);
//	    }
	//    
	    @PostMapping
	    public Student addStudent(@RequestBody Student student){
	        return studentService.addStudent(student);
	    }
	    @PutMapping("/{id}")
	    public Student updateStudent(@PathVariable long id,@RequestBody Student student){
	        return studentService.updateStudent(id,student);
	    }
	    @DeleteMapping("/{id}")
	    public String deleteStudent(@PathVariable int id){
	    	studentService.deleteStudent(id);
	    	return "DELETED "+id;
	    }

}

