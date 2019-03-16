package com.davout;

import com.davout.config.MainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MainConfig.class)
public class EventServiceParentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventServiceParentApplication.class, args);
	}

}
