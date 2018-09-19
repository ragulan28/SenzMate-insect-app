package com.ragul.insect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        InsectApplication.class,
        Jsr310JpaConverters.class
})
public class InsectApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsectApplication.class, args);
    }
}
