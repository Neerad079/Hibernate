package com.neerad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
@Entity
@Data
public class Student {
    @Id
    private int id;
    private String name;
    private String tech;

}
