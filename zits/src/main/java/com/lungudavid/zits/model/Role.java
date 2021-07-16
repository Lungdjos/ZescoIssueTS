package com.lungudavid.zits.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "roles", schema = "issuetrackingsystemdb")
public class Role {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long roleId;

    @Column(name = "role_name", nullable = false, length = 30)
    private String roleName;

    //constructor
    public Role(String roleName) {
        super();
        this.roleName = roleName;
    }


}
