package org.example.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table( name = "RENT" )
public class Rent {

    @Id
    @Column
    @GeneratedValue(generator = "RentsSeq")
    @GenericGenerator(name = "RentsSeq" , strategy = "increment")
    private int id;

    @ManyToOne
    @Embedded
    @Column(name = "Car")
    private Car car;

    @ManyToOne
    @Embedded
    @Column(name = "Customer")
    private Customer customer;

    @Column(name = "rental day")
    private String rentalDay;

    @Column(name =  "day of return")
    private String dayOfReturn;


    public Rent() { }

    public Rent(Car car, Customer customer, String rentalDay, String dayOfReturn) {
        this.car = car;
        this.customer = customer;
        this.rentalDay = rentalDay;
        this.dayOfReturn = dayOfReturn;
    }


    public Car getCar() { return car; }

    public void setCar(Car car) { this.car = car; }

    public Customer getClient() { return customer; }

    public void setClient(Customer customer) { this.customer = customer; }

    public String getRentalDay() { return rentalDay; }

    public void setRentalDay(String rentalDay) { this.rentalDay = rentalDay; }

    public String getDayOfReturn() { return dayOfReturn; }

    public void setDayOfReturn(String dayOfReturn) { this.dayOfReturn = dayOfReturn; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return id == rent.id &&
                Objects.equals(car, rent.car) &&
                Objects.equals(customer, rent.customer) &&
                Objects.equals(rentalDay, rent.rentalDay) &&
                Objects.equals(dayOfReturn, rent.dayOfReturn);
    }

    @Override
    public int hashCode() { return Objects.hash(id, car, customer, rentalDay, dayOfReturn); }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", car=" + car +
                ", client=" + customer +
                ", rentalDay='" + rentalDay + '\'' +
                ", dayOfExpiry='" + dayOfReturn + '\'' +
                '}';
    }
}
