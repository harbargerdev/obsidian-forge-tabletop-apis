package com.obsidianforge.tabletop_apis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class TabletopApisApplicationTests {

	@Test
	void contextLoads() {
	}

}
