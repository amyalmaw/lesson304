package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Course course= new Course("AstroPhysics","Neil D Tyson","Just A Course on Stats",3);
        repository.save(course);
        course= new Course("Calculus","Amy Almaw","Tested data entry on Load",4);
        repository.save(course);
        course= new Course("Calculus","Dagi Dagi","Tested data entry on Application start",6);
        repository.save(course);

    }
}
