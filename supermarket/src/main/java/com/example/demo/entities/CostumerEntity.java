package com.example.demo.entities;
import javax.persistence.*;

@Entity

public class CostumerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product")
    @SequenceGenerator(name = "product", sequenceName = "product", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(60)", nullable = false)
    private String name;


    public CostumerEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}