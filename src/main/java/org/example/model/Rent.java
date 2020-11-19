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

    @Column(name = "Car")
    private Car car;

    @Column(name = "'client'")
    private Clients clients;

    @Column(name = "rental day")
    private String rentalDay;

    @Column(name =  "day of expiry")
    private String dayOfExpiry;


    public Rent() { }

    public Rent(Car car, Clients clients, String rentalDay, String dayOfExpiry) {
        this.car = car;
        this.clients = clients;
        this.rentalDay = rentalDay;
        this.dayOfExpiry = dayOfExpiry;
    }


    public Car getCar() { return car; }

    public void setCar(Car car) { this.car = car; }

    public Clients getClient() { return clients; }

    public void setClient(Clients clients) { this.clients = clients; }

    public String getRentalDay() { return rentalDay; }

    public void setRentalDay(String rentalDay) { this.rentalDay = rentalDay; }

    public String getDayOfExpiry() { return dayOfExpiry; }

    public void setDayOfExpiry(String dayOfExpiry) { this.dayOfExpiry = dayOfExpiry; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return id == rent.id &&
                Objects.equals(car, rent.car) &&
                Objects.equals(clients, rent.clients) &&
                Objects.equals(rentalDay, rent.rentalDay) &&
                Objects.equals(dayOfExpiry, rent.dayOfExpiry);
    }

    @Override
    public int hashCode() { return Objects.hash(id, car, clients, rentalDay, dayOfExpiry); }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", car=" + car +
                ", client=" + clients +
                ", rentalDay='" + rentalDay + '\'' +
                ", dayOfExpiry='" + dayOfExpiry + '\'' +
                '}';
    }
}
