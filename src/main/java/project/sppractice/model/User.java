package project.sppractice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String password;

//    public User(){
//        //constructor
//    }
//
//    public User(long id, String name, String password){
//        this.id = id;
//        this.name = name;
//        this.password = password;
//    }


}
