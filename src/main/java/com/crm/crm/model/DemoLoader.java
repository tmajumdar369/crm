package com.crm.crm.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@Component
public class DemoLoader implements CommandLineRunner {
    private final ccontactRepository repository;

    @Autowired
    public DemoLoader(ccontactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Contact("Tamal", "Majumdar", "tmajumdar@gmail.com"));

    }
}
