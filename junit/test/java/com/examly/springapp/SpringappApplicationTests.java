package com.examly.springapp;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SpringappApplicationTests {

	@Autowired
    private MockMvc mockMvc;
	
	//Get All Trainers
	@Test
	@Transactional
    public void BE_Get_Trainers() throws Exception {
	 	mockMvc.perform(MockMvcRequestBuilders.get("/Trainer")
		.contentType(MediaType.APPLICATION_JSON)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty())
		.andReturn();
    }
	
	@Test //add Trainer
    public void BE_Add_Trainer() throws Exception {
        String newTrainer = "{\"trainerName\":\"TestUser\",\"trainerEmail\":\"testuser@gmail.com\",\"trainerExp\":\"5\",\"shopName\":\"Testing Shop\",\"password\":\"Test@123\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/Admin/add")
		.contentType(MediaType.APPLICATION_JSON)
		.content(newTrainer)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }

	@Test //Update Trainer
    public void BE_Update_Trainer() throws Exception {
        String newTrainer = "{\"trainerName\":\"TrainerUser\",\"trainerEmail\":\"testuser@gmail.com\",\"trainerExp\":\"4\",\"shopName\":\"Testing Shop\",\"password\":\"Test@123\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/Admin/update")
		.param("trainerEmail","testuser@gmail.com")
		.contentType(MediaType.APPLICATION_JSON)
		.content(newTrainer)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }
	
	//Delete the Trainer
	@Test
    public void BE_Remove_Trainer() throws Exception {
		
	 	mockMvc.perform(MockMvcRequestBuilders.delete("/Admin/remove")
		.param("trainerEmail","testuser@gmail.com")
		.contentType(MediaType.APPLICATION_JSON)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }
}
