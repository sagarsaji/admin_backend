package com.ust.admin.model;

import javax.persistence.*;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long mid;
    private String mname;

    private String mprice;
    private String mpic;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rest_id")
    private Restaurant restaurant;

    public Menu(Long mid, String mname, String mprice, String mpic, Restaurant restaurant) {
        this.mid = mid;
        this.mname = mname;
        this.mprice = mprice;
        this.mpic = mpic;
        this.restaurant = restaurant;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMprice() {
        return mprice;
    }

    public void setMprice(String mprice) {
        this.mprice = mprice;
    }

    public String getMpic() {
        return mpic;
    }

    public void setMpic(String mpic) {
        this.mpic = mpic;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Menu() {
    }
}
