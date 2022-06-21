package com.pk.carRental.model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import jdk.jfr.Enabled;
import javax.persistence.*;


@Entity(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(

    )
    @Getter @Setter
    private int id;

    private String company;
    private String model;
    private int dateOfProduction;
    private double engineCapacity;
    private enum CarBody{ HATCHBACK,SEDAN,KOMBI,SUV,ROADSTER,PICKUP};
    private enum  Drive{FWD,RWD,AWD };



    public Car() {
    }
}
