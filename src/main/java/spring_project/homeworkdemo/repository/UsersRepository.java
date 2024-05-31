package spring_project.homeworkdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_project.homeworkdemo.entity.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {

}
