package com.neerad;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    private int id;
    private String name;

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "student")
    private List<Laptop> laptop= new ArrayList<Laptop>();


}
