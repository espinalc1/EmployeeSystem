package com.employeesystem.ms.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class AnotherEmployeeController {
	
	public class GenericObject{
		
		private String aString;
		
		public GenericObject() {
			
		}

		public String getaString() {
			return aString;
		}

		public void setaString(String aString) {
			this.aString = aString;
		}
		
		
		
	}
	
	@GetMapping("/")
	public GenericObject returnResponse() {
		GenericObject obj = new GenericObject();
		obj.setaString("Hello World");
		
		return obj;
	}
}
