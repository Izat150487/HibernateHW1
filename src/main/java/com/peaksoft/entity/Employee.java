package com.peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;
}
