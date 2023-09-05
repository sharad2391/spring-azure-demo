package com.example.springazuredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringJdbcConfig {
    @Bean
    public DataSource mysqlDataSource() {

        //String url="jdbc:mysql://sharadtestserver.mysql.database.azure.com:3306/{your_database}?useSSL=true";myDbConn=DriverManager.getConnection(url, "bhattsha", "{your_password}");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://sharadtestserver.mysql.database.azure.com:3306/sharadtestdb?useSSL=true");
        dataSource.setUsername("bhattsha");
        dataSource.setPassword("July2391#");
        dataSource.setSchema("etm");
        return dataSource;

    }
}
