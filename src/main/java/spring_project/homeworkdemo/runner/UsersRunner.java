package spring_project.homeworkdemo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring_project.homeworkdemo.entity.User;
import spring_project.homeworkdemo.service.UsersService;

@Component
public class UsersRunner implements CommandLineRunner {
    @Autowired
    private UsersService usersService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User(1, "grgrgr.test@gmail.com", "Petrov", "Silcho", "456487546jihD");
        this.usersService.addUser(user);
    }
}
