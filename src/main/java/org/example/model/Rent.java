package org.example.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table( name = "RENT" )
public class Rent {

    @Id
    @Column
    @GeneratedValue(generator = "rentsSeq")
    @GenericGenerator(name = "rentsSeq" , strategy = "increment")
    private int id;

    @Column(name = "rental day")
    private LocalDate rentalDay;

    @Column(name =  "day of return")
    private LocalDate dayOfReturn;

    @ManyToOne
    private Car car;

    @ManyToOne
    private Customer customer;


    public Rent() { }

    public Rent(Car car, Customer customer, LocalDate rentalDay, LocalDate dayOfReturn) {
        this.car = car;
        this.customer = customer;
        this.rentalDay = rentalDay;
        this.dayOfReturn = dayOfReturn;
    }


    public Car getCar() { return car; }

    public void setCar(Car car) { this.car = car; }

    public Customer getClient() { return customer; }

    public void setClient(Customer customer) { this.customer = customer; }

    public LocalDate getRentalDay() { return rentalDay; }

    public void setRentalDay(LocalDate rentalDay) { this.rentalDay = rentalDay; }

    public LocalDate getDayOfReturn() { return dayOfReturn; }

    public void setDayOfReturn(LocalDate dayOfReturn) { this.dayOfReturn = dayOfReturn; }


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
