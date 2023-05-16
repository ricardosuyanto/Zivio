package com.zivio.project.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int users_id;
    private String username;
    private String password;
    private String name;
    private String bio;
    private String email;
    private char gender;
    private String phone;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roles_id", referencedColumnName = "roles_id")
    private Roles roles;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<transaction> transactions = new ArrayList<>();

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<cart> cart = new ArrayList<>();

    public Users() {
    }

    public Users(int users_id, String username, String password, String name, String bio, String email, char gender,
            String phone, Timestamp createdDate, Timestamp updatedDate, Roles roles, List<transaction> transactions,
            List<cart> cart) {
        this.users_id = users_id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.bio = bio;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.roles = roles;
        this.transactions = transactions;
        this.cart = cart;
    }

    public int getUsers_id() {
        return this.users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Roles getRoles() {
        return this.roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public List<transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(List<transaction> transactions) {
        this.transactions = transactions;
    }

    public List<cart> getCart() {
        return this.cart;
    }

    public void setCart(List<cart> cart) {
        this.cart = cart;
    }

    public Users users_id(int users_id) {
        setUsers_id(users_id);
        return this;
    }

    public Users username(String username) {
        setUsername(username);
        return this;
    }

    public Users password(String password) {
        setPassword(password);
        return this;
    }

    public Users name(String name) {
        setName(name);
        return this;
    }

    public Users bio(String bio) {
        setBio(bio);
        return this;
    }

    public Users email(String email) {
        setEmail(email);
        return this;
    }

    public Users gender(char gender) {
        setGender(gender);
        return this;
    }

    public Users phone(String phone) {
        setPhone(phone);
        return this;
    }

    public Users createdDate(Timestamp createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public Users updatedDate(Timestamp updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public Users roles(Roles roles) {
        setRoles(roles);
        return this;
    }

    public Users transactions(List<transaction> transactions) {
        setTransactions(transactions);
        return this;
    }

    public Users cart(List<cart> cart) {
        setCart(cart);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Users)) {
            return false;
        }
        Users users = (Users) o;
        return users_id == users.users_id && Objects.equals(username, users.username)
                && Objects.equals(password, users.password) && Objects.equals(name, users.name)
                && Objects.equals(bio, users.bio) && Objects.equals(email, users.email) && gender == users.gender
                && Objects.equals(phone, users.phone) && Objects.equals(createdDate, users.createdDate)
                && Objects.equals(updatedDate, users.updatedDate) && Objects.equals(roles, users.roles)
                && Objects.equals(transactions, users.transactions) && Objects.equals(cart, users.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users_id, username, password, name, bio, email, gender, phone, createdDate, updatedDate,
                roles, transactions, cart);
    }

    @Override
    public String toString() {
        return "{" +
                " users_id='" + getUsers_id() + "'" +
                ", username='" + getUsername() + "'" +
                ", password='" + getPassword() + "'" +
                ", name='" + getName() + "'" +
                ", bio='" + getBio() + "'" +
                ", email='" + getEmail() + "'" +
                ", gender='" + getGender() + "'" +
                ", phone='" + getPhone() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                ", roles='" + getRoles() + "'" +
                ", transactions='" + getTransactions() + "'" +
                ", cart='" + getCart() + "'" +
                "}";
    }

}