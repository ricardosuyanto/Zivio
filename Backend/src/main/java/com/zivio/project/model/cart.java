package com.zivio.project.model;

import java.security.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

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
import java.util.Objects;

@Entity
@Table(name = "cart")
public class cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cart_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdDate;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedDate;

    private int cartQuantity;

    @OneToMany(mappedBy = "itemDetail_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<itemDetail> itemDetail = new ArrayList<>();

    public cart() {
    }

    public cart(int cart_id, Users users, Instant createdDate, Instant updatedDate, int cartQuantity,
            List<itemDetail> itemDetail) {
        this.cart_id = cart_id;
        this.users = users;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.cartQuantity = cartQuantity;
        this.itemDetail = itemDetail;
    }

    public int getCart_id() {
        return this.cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        this.users = users;
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

    public int getCartQuantity() {
        return this.cartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    public List<itemDetail> getItemDetail() {
        return this.itemDetail;
    }

    public void setItemDetail(List<itemDetail> itemDetail) {
        this.itemDetail = itemDetail;
    }

    public cart cart_id(int cart_id) {
        setCart_id(cart_id);
        return this;
    }

    public cart users(Users users) {
        setUsers(users);
        return this;
    }

    public cart createdDate(Instant createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public cart updatedDate(Instant updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public cart cartQuantity(int cartQuantity) {
        setCartQuantity(cartQuantity);
        return this;
    }

    public cart itemDetail(List<itemDetail> itemDetail) {
        setItemDetail(itemDetail);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof cart)) {
            return false;
        }
        cart cart = (cart) o;
        return cart_id == cart.cart_id && Objects.equals(users, cart.users)
                && Objects.equals(createdDate, cart.createdDate) && Objects.equals(updatedDate, cart.updatedDate)
                && cartQuantity == cart.cartQuantity && Objects.equals(itemDetail, cart.itemDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cart_id, users, createdDate, updatedDate, cartQuantity, itemDetail);
    }

    @Override
    public String toString() {
        return "{" +
                " cart_id='" + getCart_id() + "'" +
                ", users='" + getUsers() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                ", cartQuantity='" + getCartQuantity() + "'" +
                ", itemDetail='" + getItemDetail() + "'" +
                "}";
    }

}
