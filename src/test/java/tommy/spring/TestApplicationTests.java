package tommy.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {
	public static void main(String[] args) {
		SpringApplication application = 
				new SpringApplication(TestApplication.class);
				application.setWebApplicationType(WebApplicationType.NONE);
				application.run(args);
	}

	@Test
	void contextLoads() {
		
	}

}
