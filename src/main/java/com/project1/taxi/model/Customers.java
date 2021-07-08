package com.project1.taxi.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Getter
@Setter
@Entity
public class Customers {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Generated
    private Long id;
    @Column
    private String name;
    @Column
    private String cellPhone;


    public Customers() {    //no!! String id, String name
//        this.id = id;
//        this.name = name;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }






}
