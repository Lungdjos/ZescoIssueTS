package com.lungudavid.zits.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user", schema = "issuetrackingsystemdb")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(name = "first_name", length = 30, nullable = false)
    private String fName;

    @Column(name = "last_name", length = 30, nullable = false)
    private String lName;

    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @Column(name = "password", length = 64, nullable = false)
    private String password;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "email", length = 60, nullable = false)
    private String email;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id"
            )
    )
    private Collection<Role> roles;

    //mapping user and issue tables
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id") //allowing the user table to have the role id
    private List<Issue> issues;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String fName, String lName, String username, String password, int age, String email, Collection<Role> roles) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
        this.roles = roles;
    }

    public User(String fName, String lName, String username, String password, int age, String email, Collection<Role> roles, List<Issue> issues) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
        this.roles = roles;
        this.issues = issues;
    }
    //    public User(String fName, String lName, String username, String userPassword, int age, String email, Role role) {
//
//    }

//    public long getUserId() {
//        return userId;
//    }
//
//    public String getFName() {
//        return fName;
//    }
//
//    public String getLName() {
//        return lName;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getUserPassword() {
//        return userPassword;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public List<Issue> getIssues() {
//        return issues;
//    }
}
