package com.fs.university;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fs.university.entities.College;
import com.fs.university.repositories.ICollegeRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class UniversityApplicationTests 
{
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
//	@MockBean
//	private ICollegeRepository iCollegeRepository;

	ObjectMapper om = new ObjectMapper();

	@Before
	private void setUp()
	{
	mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	void contextLoads() {
	}


	@Test
	public void addCollegeTest() throws Exception
	{
		College college = new College();
		college.setCollegeId(1235);
		college.setCollegeName("SVIT");
		college.setNoOfStudents(550);
	
		String jsonRequest = om.writeValueAsString(college);
		mockMvc.perform(post("/college/addcollege")
			.content(jsonRequest)
			.contentType(MediaType.APPLICATION_JSON_VALUE)
			.accept(MediaType.APPLICATION_JSON))
			.andDo(print())
			.andExpect(status()
			.isCreated());

	}
	
	@Test
	public void getAllCollegeTest() throws Exception
	{
		College college = new College();
		college.setCollegeId(1236);
		college.setCollegeName("VVit");
		college.setNoOfStudents(550);
		mockMvc.perform(get("/college/viewallcollege")
			.contentType(MediaType.APPLICATION_JSON_VALUE))
			.andDo(print())
			.andExpect(status()
			.isOk());
	}
	
}
