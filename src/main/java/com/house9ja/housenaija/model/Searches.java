/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author bokon
 */
@Entity
@Table(name = "searches")
public class Searches implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "search_item", nullable = false, length = 150, columnDefinition = "VARCHAR(150)")
    private String searchItem;

    @Column(name = "search_date", nullable = false, length = 150, columnDefinition = "VARCHAR(150)")
    private String searchDate;

    @Column(name = "web_address", nullable = false, length = 150, columnDefinition = "VARCHAR(150)")
    private String webAddress;

    @Column(name = "property_search_state", nullable = false, length = 150, columnDefinition = "VARCHAR(150)")
    private String searchState;

    @Column(name = "property_search_city", nullable = false, length = 150, columnDefinition = "VARCHAR(150)")
    private String searchCity;

    @Column(name = "property_search_neighbourhood", nullable = false, length = 150, columnDefinition = "VARCHAR(150)")
    private String searchNeighbourhood;

    @Column(name = "price", nullable = false, length = 150, columnDefinition = "DECIMAL(10,2)")
    private BigDecimal price;

    @ManyToOne()
    @JoinColumn
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSearchItem() {
        return searchItem;
    }

    public void setSearchItem(String searchItem) {
        this.searchItem = searchItem;
    }

    public String getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(String searchDate) {
        this.searchDate = searchDate;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getSearchState() {
        return searchState;
    }

    public void setSearchState(String searchState) {
        this.searchState = searchState;
    }

    public String getSearchCity() {
        return searchCity;
    }

    public void setSearchCity(String searchCity) {
        this.searchCity = searchCity;
    }

    public String getSearchNeighbourhood() {
        return searchNeighbourhood;
    }

    public void setSearchNeighbourhood(String searchNeighbourhood) {
        this.searchNeighbourhood = searchNeighbourhood;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
