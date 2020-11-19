package org.example.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table( name = "CAR" )
public class Car {

    @Id
    @Column( name = "id" )
    @GeneratedValue(generator = "carSeq")
    @GenericGenerator(name = "carSeq" , strategy = "increment")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "reg_number")
    private String numbers;

    @Column(name = "color")
    private String color;

    @Column(name = "tech_condition")
    private String technicalCondition;

    @Column(name = "damages_desc")
    private String descOfTheDamage;


    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand( String brand ) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel( String model ) {
        this.model = model;
    }

    public String getNumbers() { return numbers; }

    public void setNumbers(String numbers) { this.numbers = numbers; }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTechnicalCondition() {
        return technicalCondition;
    }

    public void setTechnicalCondition(String technicalCondition) {
        this.technicalCondition = technicalCondition;
    }

    public String getDescOfTheDamage() { return descOfTheDamage; }

    public void setDescOfTheDamage(String descOfTheDamage) { this.descOfTheDamage = descOfTheDamage; }


    public Car() { }

    public Car(String brand, String model, String numbers, String color, String technicalCondition, String descOfTheDamage) {
        this.brand = brand;
        this.model = model;
        this.numbers = numbers;
        this.color = color;
        this.technicalCondition = technicalCondition;
        this.descOfTheDamage = descOfTheDamage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(numbers, car.numbers) &&
                Objects.equals(color, car.color) &&
                Objects.equals(technicalCondition, car.technicalCondition) &&
                Objects.equals(descOfTheDamage, car.descOfTheDamage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, numbers, color, technicalCondition, descOfTheDamage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", numbers='" + numbers + '\'' +
                ", color='" + color + '\'' +
                ", technicalCondition='" + technicalCondition + '\'' +
                ", descOfTheDamage='" + descOfTheDamage + '\'' +
                '}';
    }
}

