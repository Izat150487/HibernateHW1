package com.peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "groups")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

}
