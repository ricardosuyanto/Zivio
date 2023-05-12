package com.zivio.project.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.management.relation.Role;

@Entity
@Table(name = "users")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String username;
    private String password;
    private String name;
    private String bio;
    private String email;
    private char gender;
    private String phone;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @OneToOne(mappedBy = "user_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private Role role;

    @OneToMany(mappedBy = "transaction_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<transaction> transactions = new ArrayList<>();

    @OneToMany(mappedBy = "cart_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<cart> cart = new ArrayList<>();

    public user() {
    }

    public user(int user_id, String username, String password, String name, String bio, String email, char gender,
            String phone, Timestamp createdDate, Timestamp updatedDate, Role role, List<transaction> transactions,
            List<cart> cart) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.bio = bio;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.role = role;
        this.transactions = transactions;
        this.cart = cart;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
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

    public user user_id(int user_id) {
        setUser_id(user_id);
        return this;
    }

    public user username(String username) {
        setUsername(username);
        return this;
    }

    public user password(String password) {
        setPassword(password);
        return this;
    }

    public user name(String name) {
        setName(name);
        return this;
    }

    public user bio(String bio) {
        setBio(bio);
        return this;
    }

    public user email(String email) {
        setEmail(email);
        return this;
    }

    public user gender(char gender) {
        setGender(gender);
        return this;
    }

    public user phone(String phone) {
        setPhone(phone);
        return this;
    }

    public user createdDate(Timestamp createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public user updatedDate(Timestamp updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public user role(Role role) {
        setRole(role);
        return this;
    }

    public user transactions(List<transaction> transactions) {
        setTransactions(transactions);
        return this;
    }

    public user cart(List<cart> cart) {
        setCart(cart);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof user)) {
            return false;
        }
        user user = (user) o;
        return user_id == user.user_id && Objects.equals(username, user.username)
                && Objects.equals(password, user.password) && Objects.equals(name, user.name)
                && Objects.equals(bio, user.bio) && Objects.equals(email, user.email) && gender == user.gender
                && Objects.equals(phone, user.phone) && Objects.equals(createdDate, user.createdDate)
                && Objects.equals(updatedDate, user.updatedDate) && Objects.equals(role, user.role)
                && Objects.equals(transactions, user.transactions) && Objects.equals(cart, user.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, username, password, name, bio, email, gender, phone, createdDate, updatedDate,
                role, transactions, cart);
    }

    @Override
    public String toString() {
        return "{" +
                " user_id='" + getUser_id() + "'" +
                ", username='" + getUsername() + "'" +
                ", password='" + getPassword() + "'" +
                ", name='" + getName() + "'" +
                ", bio='" + getBio() + "'" +
                ", email='" + getEmail() + "'" +
                ", gender='" + getGender() + "'" +
                ", phone='" + getPhone() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                ", role='" + getRole() + "'" +
                ", transactions='" + getTransactions() + "'" +
                ", cart='" + getCart() + "'" +
                "}";
    }

}