package org.example.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "cars")
public class Car {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "condition")
    private String condition;

    @Column(name = "desciptionsOfTheDamage")
    private String descOfTheDamage;


    public Car(String descOfTheDamage) {
        this.descOfTheDamage = descOfTheDamage;
    }

    public Car(String brand, String model, String color, String condition, String descOfTheDamage) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.condition = condition;
        this.descOfTheDamage = descOfTheDamage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDescOfTheDamage() { return descOfTheDamage; }

    public void setDescOfTheDamage(String descOfTheDamage) { this.descOfTheDamage = descOfTheDamage; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color) &&
                Objects.equals(condition, car.condition) &&
                Objects.equals(descOfTheDamage, car.descOfTheDamage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, color, condition, descOfTheDamage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", condition='" + condition + '\'' +
                ", descOfTheDamage='" + descOfTheDamage + '\'' +
                '}';
    }
}

