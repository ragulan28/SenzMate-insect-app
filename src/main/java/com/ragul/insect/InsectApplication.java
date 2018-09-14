package com.ragul.insect;

import com.ragul.insect.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class InsectApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsectApplication.class, args);
    }
}
