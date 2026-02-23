package com.neerad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import java.util.List;

import java.util.ArrayList;

@Entity
@Data
public class Laptop {
    @Id
    private int lid;
    private String lname;
    @ManyToMany
    private List<Student> student=new ArrayList<Student>();


}
