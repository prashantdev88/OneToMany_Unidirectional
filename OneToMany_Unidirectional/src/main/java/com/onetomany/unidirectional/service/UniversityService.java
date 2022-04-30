package com.onetomany.unidirectional.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.onetomany.unidirectional.entity.University;
import com.onetomany.unidirectional.repository.UniversityRepository;


@Service
public class UniversityService {

	@Autowired
	private UniversityRepository universityRepository;
	
	   public List<University> getUniversities(){
	        return universityRepository.findAll();
	    }
	    
//	    public Page<University> findProductsWithPagination(int offset,int pageSize){
//	        Page<Cart> universities = universityRepository.findAll(PageRequest.of(offset, pageSize));
//	        return  universities;
//	    }
	    
	    public University getUniversity(long id){
	        Optional<University> university = universityRepository.findById(id);

	        return university.get();
	    }
	    public University addUniversity(University university){
	        return universityRepository.save(university);
	    }
	    public University updateUniversity(long id,University university){
	    	university.setId(id);
	        return universityRepository.save(university);
	    }
	    public void deleteUniversity(long id){
	    	universityRepository.deleteById(id);
	    }

	
}

