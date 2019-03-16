package com.davout.db.access.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Radek on 16.03.2019.
 */
@Configuration
@Profile("local")
@PropertySource("classpath:db-access-properties-local.yaml")
public class DbAccessConfigLocal {
}
