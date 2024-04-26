package com.inversionofcontrol.json_java_databinding;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// Reading student json file from data folder
//		ObjectMapper objectMapper = new ObjectMapper();
//		Student student = objectMapper.readValue(new File("data/student.json"), Student.class);
//		System.out.println(student);
//
//		// writing data to studnet1.json
//		Student student2 = new Student();
//		student2.setAddress("NJ");
//		student2.setName("Rahul");
//		student2.setRole("Developer");
//		ObjectMapper objectMapper2 = new ObjectMapper();
//		objectMapper2.enable(SerializationFeature.INDENT_OUTPUT);  // this will indent the json output
//		objectMapper2.writeValue(new File("data/student1.json"), student2);
		
		
		// Reading MyStudent.json file from data folder
//				ObjectMapper obmystudent = new ObjectMapper();
//				MyStudent mystudent = obmystudent.readValue(new File("data/mystudent.json"), MyStudent.class);
//				System.out.println(mystudent);
				
				// Reading MyStudentList.json file from data folder and printing as an array
//				ObjectMapper obmystudent = new ObjectMapper();
//				MyStudent[] mystudentList = obmystudent.readValue(new File("data/mystudentList.json"), MyStudent[].class);
//				for(MyStudent tempStudent: mystudentList) {
//					System.out.println(tempStudent);
//				}

				
				// Reading MyStudentList.json file from data folder and printing as an list
				ObjectMapper obmystudent = new ObjectMapper();
				 List<MyStudent> myStudentList=Arrays.asList(obmystudent.readValue(new File("data/mystudentList.json"), MyStudent[].class));
				for(MyStudent tempStudent: myStudentList) {
					System.out.println(tempStudent);
				}



	}
}
