package com.cg.bookstore;



import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class IntegrationTesting {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void testGetAllUsers() throws Exception {
		
		ResponseEntity<List> response = 
				this.restTemplate.getForEntity
				("http://localhost:" + port + "/users", List.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);		
	}
	
	@Test
	public void testGetAllBooks() throws Exception {
		ResponseEntity<List> response = 
				this.restTemplate.getForEntity
				("http://localhost:" + port + "/books", List.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
