package com.example;

import com.example.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations="classpath:application-test.properties")
public class ApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	UserRepository userRepository;

	@Test
	public void healthCheckTest() {
		ResponseEntity<String> forEntity = restTemplate.getForEntity("/healthcheck", String.class);
		//User next = userRepository.findAll().iterator().next();
		String body = forEntity.getBody();
		Assert.assertEquals("Health check failed.", "OK!", body);
	}
}
