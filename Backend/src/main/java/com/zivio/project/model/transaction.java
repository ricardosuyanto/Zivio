package com.zivio.project.model;

import java.security.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "transaction")
public class transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;
    private String total_price;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private int Quantity;
    private String transactionCode;

    @OneToOne(mappedBy = "transaction_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private status status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemDetail_id", nullable = false)
    private itemDetail itemDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private user user;

    public transaction() {
    }

    public transaction(int transaction_id, String total_price, Timestamp createdDate, Timestamp updatedDate,
            int Quantity, String transactionCode, status status, itemDetail itemDetail) {
        this.transaction_id = transaction_id;
        this.total_price = total_price;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.Quantity = Quantity;
        this.transactionCode = transactionCode;
        this.status = status;
        this.itemDetail = itemDetail;
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

    public status getStatus() {
        return this.status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public itemDetail getItemDetail() {
        return this.itemDetail;
    }

    public void setItemDetail(itemDetail itemDetail) {
        this.itemDetail = itemDetail;
    }

    public transaction transaction_id(int transaction_id) {
        setTransaction_id(transaction_id);
        return this;
    }

    public transaction total_price(String total_price) {
        setTotal_price(total_price);
        return this;
    }

    public transaction createdDate(Timestamp createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public transaction updatedDate(Timestamp updatedDate) {
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

    public transaction status(status status) {
        setStatus(status);
        return this;
    }

    public transaction itemDetail(itemDetail itemDetail) {
        setItemDetail(itemDetail);
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
                && Objects.equals(status, transaction.status) && Objects.equals(itemDetail, transaction.itemDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction_id, total_price, createdDate, updatedDate, Quantity, transactionCode, status,
                itemDetail);
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
                ", itemDetail='" + getItemDetail() + "'" +
                "}";
    }

}
