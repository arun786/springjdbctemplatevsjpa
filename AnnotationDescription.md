# Types of Annotation used in Project

## @Configuration
    
    Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate
    bean definitions and service requests for those beans at runtime
    
    Example
    
    package com.arun.springjdbcvsjpawithhibernate.config;
    
    
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.boot.context.properties.ConfigurationProperties;
    import org.springframework.boot.jdbc.DataSourceBuilder;
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
    
    import javax.sql.DataSource;
    
    @Configuration
    public class DatabaseConfig {
    
        @Bean(name = "mySqlDataSource")
        @ConfigurationProperties(prefix = "mysql.datasource")
        public DataSource dataSource() {
            return DataSourceBuilder.create().build();
        }
    
    
        @Bean(name = "mySqlNamedParameterJdbcTemplate")
        public NamedParameterJdbcTemplate namedParameterJdbcTemplate(@Qualifier("mySqlDataSource") DataSource dataSource) {
            return new NamedParameterJdbcTemplate(dataSource);
        }
    }
