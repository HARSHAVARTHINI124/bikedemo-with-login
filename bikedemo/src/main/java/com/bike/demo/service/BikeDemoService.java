package com.bike.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.bike.demo.model.BikeDemo;
import com.bike.demo.model.LoginDemoModel;
import com.bike.demo.repository.BikeDemoRepository;
import com.bike.demo.repository.LoginRepository;




@Service

public class BikeDemoService {

	@Autowired
	BikeDemoRepository br;
	
	@Autowired
	LoginRepository lrepo;
	
	public List<BikeDemo> getAllDetails(){
		
		return br.findAll();
	}
	
	public BikeDemo saveDetails(BikeDemo b) {
		
		return br.save(b);
	}
	

	public BikeDemo saveupdate(BikeDemo x) {
		
		return br.save(x);
	}
	public void deleteDetails(int a) {
		
		br.deleteById(a);
	}
	public List<BikeDemo>sortBike(String field){
		return br.findAll(Sort.by(field));
	}
	
	public List<BikeDemo> sortDesBike(String field){
		
		return br.findAll(Sort.by(Direction.DESC,field));
	}

	public List<BikeDemo> getpaginationss(int offset, int pagesize) {
		
		Page<BikeDemo> paging=br.findAll(PageRequest.of(offset, pagesize));
		return paging.getContent();
	}

	public List<BikeDemo> getsortpaginations(int offset, int pagesize,String field) {
		
		Page<BikeDemo> paging=br.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
		return paging.getContent();
	}

	public String login(String username,String password) {
		List<LoginDemoModel> li = lrepo.findAll();
		String res = null;
		for(LoginDemoModel l : li ) {
			if(l.getUsername().equals(username)&&l.getPassword().equals(password)) {
				res = "Login sucessfull";
			}
		}
		if(res==null) {
			res= "Login failed";
		}
		return res;
	}

	public BikeDemo register(BikeDemo id) {
			
			return br.save(id);
		}
	
}
