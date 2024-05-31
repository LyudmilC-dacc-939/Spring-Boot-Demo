package spring_project.homeworkdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//Ще има таблица за дадения клас в базата данни
@Table(name = "Users")
@Data
//Дата съдържа в себе си гетъти, сетъри, toString, equals
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private int id;
    private String eMail;
    private String lastName;
    private String firstName;
    private String password;

}
