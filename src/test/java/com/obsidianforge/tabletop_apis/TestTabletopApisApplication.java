package com.obsidianforge.tabletop_apis;

import org.springframework.boot.SpringApplication;

public class TestTabletopApisApplication {

	public static void main(String[] args) {
		SpringApplication.from(TabletopApisApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
