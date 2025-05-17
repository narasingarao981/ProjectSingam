package com.singam.ProjectSingam.utils;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBInit {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void testDbConnection() {
        jdbcTemplate.queryForObject("SELECT 1", Integer.class);
    }
}
