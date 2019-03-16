package com.davout.db.access;

import com.davout.db.access.properties.DbAccessConfigLocal;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Radek on 16.03.2019.
 */
@Configuration
@Import(DbAccessConfigLocal.class)
public class DbAccessConfig {

}
