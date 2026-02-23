package com.neerad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Laptop {
    @Id
    private int lid;
    private String lname;
    @ManyToOne
    private Student student;


}
