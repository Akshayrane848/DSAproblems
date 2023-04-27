package com.metricoid.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	
	@CrossOrigin
	@GetMapping("/getformat/{num}/{num2}")
	public ResponseEntity<String[]> getResult(@PathVariable("num") Integer num, @PathVariable("num2") Integer num2) throws ArithmeticException{
		
		int l=num%num2;
		
		if(l != 0) {
			throw new ArithmeticException("num not correct");
		}else {
			
			String[] arr= new String[num2];
			int c=0;
			String s="";
			int k=0;
			
			for(int i=num; i>0; i--) {
				s=s+i+" ";
				k++;
				if(k==num2) {
					arr[c]= s;
					s="";
					k=0;
					c++;
				}
			}
			return new ResponseEntity<>(arr, HttpStatus.OK);
		}
		
		
	
	}

}
