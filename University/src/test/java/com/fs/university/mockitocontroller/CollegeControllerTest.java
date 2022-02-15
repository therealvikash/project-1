//package com.fs.university.mockitocontroller;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fs.university.entities.College;
//
//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//@AutoConfigureMockMvc
//public class CollegeControllerTest 
//{
//	
//
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Autowired
//	private WebApplicationContext context;
//
//	ObjectMapper om = new ObjectMapper();
//
//	@Before
//	private void setUp()
//	{
//	mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
//	}
//
////	@Test
////	public void addCollegeTest() throws Exception{
////	College college = new College();
////	college.setCollegeId(1234);
////	college.setCollegeName("SEA");
////	college.setNoOfStudents(550);
////
////	String jsonRequest = om.writeValueAsString(college);
////	mockMvc.perform(post("/college/addcollege")
////			.content(jsonRequest)
////			.contentType(MediaType.APPLICATION_JSON_VALUE)
////			.accept(MediaType.APPLICATION_JSON)).andDo(print())
////			.andExpect(status().isCreated());
////
////
////	}
//}
