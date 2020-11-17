package org.example.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "clientSeq")
    @GenericGenerator(name = "clientSeq" , strategy = "increment")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name =  "lastName")
    private String lastName;

    public Client() {}

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(firstName, client.firstName) &&
                Objects.equals(lastName, client.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ",  lastName='" + lastName + '\'' +
                '}';
    }
}
