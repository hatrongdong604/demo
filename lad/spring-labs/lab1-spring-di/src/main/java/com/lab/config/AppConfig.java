package com.lab.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.lab.services",
    "com.lab.repositories",
    "com.lab.proxies"
})
public class AppConfig {
    // THU NGHIEM BUOC 5 - @Bean thay cho @Component:
    // 1. Xoa @Repository tren DBCommentRepository.java
    // 2. Bo comment doan @Bean duoi day
    // 3. Cap nhat @ComponentScan: xoa "com.lab.repositories"
    //
    // @Bean
    // public CommentRepository commentRepository() {
    //     return new com.lab.repositories.DBCommentRepository();
    // }
}
