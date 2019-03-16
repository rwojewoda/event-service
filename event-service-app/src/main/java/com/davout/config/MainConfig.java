package com.davout.config;

import com.davout.db.access.DbAccessConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Radek on 16.03.2019.
 */
@Configuration
@Import(DbAccessConfig.class)
public class MainConfig {
}
