package com.zivio.project.model;

import java.security.Timestamp;
import java.time.Instant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "transaction")
public class transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;
    private String total_price;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdDate;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedDate;
    private int Quantity;
    private String transactionCode;

    @OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<status> status = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;

    public transaction() {
    }

    public transaction(int transaction_id, String total_price, Instant createdDate, Instant updatedDate, int Quantity,
            String transactionCode, List<status> status, Users users) {
        this.transaction_id = transaction_id;
        this.total_price = total_price;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.Quantity = Quantity;
        this.transactionCode = transactionCode;
        this.status = status;
        this.users = users;
    }

    public int getTransaction_id() {
        return this.transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTotal_price() {
        return this.total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public Instant getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Instant updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getTransactionCode() {
        return this.transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public List<status> getStatus() {
        return this.status;
    }

    public void setStatus(List<status> status) {
        this.status = status;
    }

    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public transaction transaction_id(int transaction_id) {
        setTransaction_id(transaction_id);
        return this;
    }

    public transaction total_price(String total_price) {
        setTotal_price(total_price);
        return this;
    }

    public transaction createdDate(Instant createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public transaction updatedDate(Instant updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public transaction Quantity(int Quantity) {
        setQuantity(Quantity);
        return this;
    }

    public transaction transactionCode(String transactionCode) {
        setTransactionCode(transactionCode);
        return this;
    }

    public transaction status(List<status> status) {
        setStatus(status);
        return this;
    }

    public transaction users(Users users) {
        setUsers(users);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof transaction)) {
            return false;
        }
        transaction transaction = (transaction) o;
        return transaction_id == transaction.transaction_id && Objects.equals(total_price, transaction.total_price)
                && Objects.equals(createdDate, transaction.createdDate)
                && Objects.equals(updatedDate, transaction.updatedDate) && Quantity == transaction.Quantity
                && Objects.equals(transactionCode, transaction.transactionCode)
                && Objects.equals(status, transaction.status) && Objects.equals(users, transaction.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction_id, total_price, createdDate, updatedDate, Quantity, transactionCode, status,
                users);
    }

    @Override
    public String toString() {
        return "{" +
                " transaction_id='" + getTransaction_id() + "'" +
                ", total_price='" + getTotal_price() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                ", Quantity='" + getQuantity() + "'" +
                ", transactionCode='" + getTransactionCode() + "'" +
                ", status='" + getStatus() + "'" +
                ", users='" + getUsers() + "'" +
                "}";
    }

}
