package com.luv2cove.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {

			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read JSON file and map/convert to java POJO to data/sample-lite.json
			Student theStudent = mapper.readValue(
					new File("data/sample-full.json"), Student.class);

			// print first name and last name
			System.out.println("First Name : " + theStudent.getFirstName());
			System.out.println("Last Name : " + theStudent.getLastName());
			
			// print out the address : street and city
			Address tempAddress = theStudent.getAddress();
			
			System.out.println("Street = " + tempAddress.getStreet());
			System.out.println("City = " + tempAddress.getCity());
			
			// print out the languages
			for(String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
