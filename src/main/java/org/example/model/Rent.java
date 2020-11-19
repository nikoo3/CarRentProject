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

    @Column(name = "client")
    private Client client;

    @Column(name = "rental day")
    private String rentalDay;

    @Column(name =  "day of expiry")
    private String dayOfExpiry;


    public Rent() { }

    public Rent(Car car, Client client, String rentalDay, String dayOfExpiry) {
        this.car = car;
        this.client = client;
        this.rentalDay = rentalDay;
        this.dayOfExpiry = dayOfExpiry;
    }


    public Car getCar() { return car; }

    public void setCar(Car car) { this.car = car; }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }

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
                Objects.equals(client, rent.client) &&
                Objects.equals(rentalDay, rent.rentalDay) &&
                Objects.equals(dayOfExpiry, rent.dayOfExpiry);
    }

    @Override
    public int hashCode() { return Objects.hash(id, car, client, rentalDay, dayOfExpiry); }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", car=" + car +
                ", client=" + client +
                ", rentalDay='" + rentalDay + '\'' +
                ", dayOfExpiry='" + dayOfExpiry + '\'' +
                '}';
    }
}
