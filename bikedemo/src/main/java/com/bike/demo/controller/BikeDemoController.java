package com.bike.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bike.demo.model.BikeDemo;
import com.bike.demo.service.BikeDemoService;

@RestController

public class BikeDemoController {

	@Autowired
	BikeDemoService dr;
	
	@GetMapping("/fetch")
	public List<BikeDemo> getallDetails(){
		
		return dr.getAllDetails();
	}
	 @PostMapping("/save")
	public String saveAll(@RequestBody BikeDemo e){
		dr.saveDetails(e);
		return "Details Saved";
		
	}
	 @PutMapping("/update")
	 public String saveAlll(@RequestBody BikeDemo i){
			dr.saveupdate(i);
			return "Details edited";
			
		}
	 @DeleteMapping("/delete/{y}")
	 public String deleteDetails(@PathVariable int y){
			dr.deleteDetails(y);
			return "Deleted";	
	 }
	 @GetMapping("/auto/{field}")
		public List<BikeDemo>sortCrudD(@PathVariable String field){
			return dr.sortBike(field);
		}
		@GetMapping("/autos")
		public List<BikeDemo>sortCrudDes(@RequestParam String field){
			return dr.sortDesBike(field);
		}
		
		
		@GetMapping("/pagination")
		
		public List<BikeDemo> pagination(@RequestParam int offset,@RequestParam int pagesize){
			
			return dr.getpaginationss(offset,pagesize);
		}
		
		@GetMapping("/sortpagination")
		
		public List<BikeDemo> sortpagination(@RequestParam int offset,@RequestParam int pagesize,String field){
			
			return dr.getsortpaginations(offset,pagesize,field);
		}
		@GetMapping("/login")
		public String logins(@RequestParam String username, @RequestParam String password){
			
			return dr.login(username,password);
		}
		
		@PostMapping("/reg")
		public BikeDemo regid(@RequestBody BikeDemo id) {
			return dr.register(id);
			
		}
}
