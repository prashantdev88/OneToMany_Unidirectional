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

import com.onetomany.unidirectional.entity.University;
import com.onetomany.unidirectional.repository.UniversityRepository;
import com.onetomany.unidirectional.service.UniversityService;



@RestController
@RequestMapping(value = "university")
public class UniversityController {

	@Autowired
	  private UniversityService universityService;
	    @Autowired
	    private UniversityRepository itemRepository;

	    @GetMapping
	    public List<University> getItems(){
	        return universityService.getUniversities();
	    }
	    @GetMapping("/{id}")
	    public University getItemByUniversity(@PathVariable long id){
	        return universityService.getUniversity(id);
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
	    public University addUniversity(@RequestBody University university){
	        return universityService.addUniversity(university);
	    }
	    @PutMapping("/{id}")
	    public University addUniversity(@PathVariable long id,@RequestBody University university){
	        return universityService.updateUniversity(id, university);
	    }
	    @DeleteMapping("/{id}")
	    public String deleteUniversity(@PathVariable long id){
	    	universityService.deleteUniversity(id);
	    	return "DELETED "+id;
	    }
}

