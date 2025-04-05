package com.dio.manipulacaobancodados;

import com.dio.manipulacaobancodados.persistence.entity.EmployeeDAO;
import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

@SpringBootApplication
public class ManipulacaoBancoDadosApplication {

    private final static EmployeeDAO employeeDAO = new EmployeeDAO();

    public static void main(String[] args) {
        SpringApplication.run(ManipulacaoBancoDadosApplication.class, args);
        var flyway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost:3307/meubanco", "root", "senha123")
                .load();
        flyway.migrate();


    }

}
