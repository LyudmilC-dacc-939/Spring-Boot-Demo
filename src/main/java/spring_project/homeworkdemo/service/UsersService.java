package spring_project.homeworkdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_project.homeworkdemo.entity.User;
import spring_project.homeworkdemo.repository.UsersRepository;

@Service
public class UsersService {
    private UsersRepository usersRepository;

@Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void addUser(User user) {

        this.usersRepository.save(user);
    }
}
