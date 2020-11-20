package org.example.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table( name = "RENTAL" )
public class Rental {

    @Id
    @Column
    @GeneratedValue(generator = "rentsSeq")
    @GenericGenerator(name = "rentsSeq" , strategy = "increment")
    private int id;

    @ManyToOne
    private Car car;

    @ManyToOne
    private Customer customer;

    @Column(name = "rental day")
    private String rentalDay;

    @Column(name =  "day of return")
    private String dayOfReturn;


    public Rental() { }

    public Rental(Car car, Customer customer, String rentalDay, String dayOfReturn) {
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
        Rental rental = (Rental) o;
        return id == rental.id &&
                Objects.equals(car, rental.car) &&
                Objects.equals(customer, rental.customer) &&
                Objects.equals(rentalDay, rental.rentalDay) &&
                Objects.equals(dayOfReturn, rental.dayOfReturn);
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
