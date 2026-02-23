package com.neerad;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
@Entity
@Data
public class Student {
    @Id
    private int id;
    private String name;

    @OneToOne(cascade=CascadeType.ALL)
    private Laptop laptop;


}
