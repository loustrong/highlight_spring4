package com.tom.DemoApp;


import com.tom.DemoApp.highlight_spring4.chapter03.fortest.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //1
@ContextConfiguration(classes = {TestConfig.class}) //2
@ActiveProfiles("prod") //3
class DemoAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
