package com.neerad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
@Entity
@Table(name="Student_data")
@Data
public class Student {
    @Id
    @Column(name="S_id")
    private int id;
    @Column(name="S_name")
    private String name;
    @Column(name="fav_tech")
    private String tech;

}
