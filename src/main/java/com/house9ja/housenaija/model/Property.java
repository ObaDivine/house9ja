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
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Brian Okon
 */
@Entity
@Table(name = "property")
public class Property implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, unique = true)
    private Long proprtyId;
    
    @Column(name = "property_type", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String propertyType;
    
    @Column(name = "property_description", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String propertyDescription;
    
    @Column(name = "living_room", nullable = false, columnDefinition = "INT")
    private int livingRoom;
    
    @Column(name = "living_room_size", nullable = true, columnDefinition = "VARCHAR(15)")
    private String livingRoomSize;
    
    @Column(name = "living_room_ceiling", nullable = false, columnDefinition = "VARCHAR(15)")
    private String livingRoomCeiling;
    
    @Column(name = "living_room_floor", nullable = false, columnDefinition = "VARCHAR(15)")
    private String livingRoomFloor;
    
    @Column(name = "bed_room", nullable = false, columnDefinition = "INT")
    private int bedRooms;
    
    @Column(name = "bed_room_size", nullable = true, columnDefinition = "VARCHAR(15)")
    private String bedRoomSize;
    
    @Column(name = "bed_room_ceiling", nullable = true, columnDefinition = "VARCHAR(15)")
    private String bedRoomCeiling;
    
    @Column(name = "bed_room_floor", nullable = true, columnDefinition = "VARCHAR(15)")
    private String bedRoomFloor;
    
    @Column(name = "bed_room_wardrobe", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean bedRoomWardRobe;
    
    @Column(name = "kitchen", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean kitchen;
    
    @Column(name = "garrage", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean garrage;
    
    @Column(name = "dinning", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean dinning;
    
    @Column(name = "bar", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean bar;
    
    @Column(name = "parking_lot", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean parkingLot;
    
    @Column(name = "furnished", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean furnished;
    
    @Column(name = "swimming_pool", nullable = false,  columnDefinition = "BOOLEAN")
    private Boolean swimmingPool;
    
    @Column(name = "c_of_o", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean cOfO;
    
    @Column(name = "service_flat", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean serviceFlat;
    
    @Column(name = "power_supply", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean powerSupply;
    
    @Column(name = "generator", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean generator;
    
    @Column(name = "price", nullable = false, columnDefinition = "DECIMAL(10,2)")
    private BigDecimal price;
    
    @Column(name = "price_fixed", nullable = false, length = 50, columnDefinition = "BOOLEAN")
    private Boolean priceFixed;
    
    @Column(name = "property_state", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String propertyState;
    
    @Column(name = "property_city", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String propertyCity;
    
    @Column(name = "property_address", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String propertyAddress;
    
    @Column(name = "property_neighbourhood", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String propertyNeighbourhood;
    
    @Column(name = "status", nullable = false, length = 10, columnDefinition = "VARCHAR(10)")
    private String status;
    
    @Column(name = "contract_term", nullable = false, length = 15, columnDefinition = "VARCHAR(15)")
    private String contractTerm;
    
    @Column(name = "boys_quarter", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean boysQuarter;
    
    @Column(name = "date_added", nullable = true, columnDefinition = "DATETIME")
    private int dateAdded;
    
    @ManyToOne()
    @JoinColumn(name = "id")
    private Users user;

    public Long getProprtyId() {
        return proprtyId;
    }

    public void setProprtyId(Long proprtyId) {
        this.proprtyId = proprtyId;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyDescription() {
        return propertyDescription;
    }

    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    public Boolean getKitchen() {
        return kitchen;
    }

    public void setKitchen(Boolean kitchen) {
        this.kitchen = kitchen;
    }

    public Boolean getGarrage() {
        return garrage;
    }

    public void setGarrage(Boolean garrage) {
        this.garrage = garrage;
    }

    public Boolean getDinning() {
        return dinning;
    }

    public void setDinning(Boolean dinning) {
        this.dinning = dinning;
    }

    public Boolean getBar() {
        return bar;
    }

    public void setBar(Boolean bar) {
        this.bar = bar;
    }

    public Boolean getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(Boolean parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Boolean getFurnished() {
        return furnished;
    }

    public void setFurnished(Boolean furnished) {
        this.furnished = furnished;
    }

    public Boolean getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(Boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public Boolean getcOfO() {
        return cOfO;
    }

    public void setcOfO(Boolean cOfO) {
        this.cOfO = cOfO;
    }

    public Boolean getServiceFlat() {
        return serviceFlat;
    }

    public void setServiceFlat(Boolean serviceFlat) {
        this.serviceFlat = serviceFlat;
    }

    public Boolean getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(Boolean powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Boolean getGenerator() {
        return generator;
    }

    public void setGenerator(Boolean generator) {
        this.generator = generator;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getPriceFixed() {
        return priceFixed;
    }

    public void setPriceFixed(Boolean priceFixed) {
        this.priceFixed = priceFixed;
    }

    public String getPropertyState() {
        return propertyState;
    }

    public void setPropertyState(String propertyState) {
        this.propertyState = propertyState;
    }

    public String getPropertyCity() {
        return propertyCity;
    }

    public void setPropertyCity(String propertyCity) {
        this.propertyCity = propertyCity;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyNeighbourhood() {
        return propertyNeighbourhood;
    }

    public void setPropertyNeighbourhood(String propertyNeighbourhood) {
        this.propertyNeighbourhood = propertyNeighbourhood;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContractTerm() {
        return contractTerm;
    }

    public void setContractTerm(String contractTerm) {
        this.contractTerm = contractTerm;
    }

    public Boolean getBoysQuarter() {
        return boysQuarter;
    }

    public void setBoysQuarter(Boolean boysQuarter) {
        this.boysQuarter = boysQuarter;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getLivingRoomSize() {
        return livingRoomSize;
    }

    public void setLivingRoomSize(String livingRoomSize) {
        this.livingRoomSize = livingRoomSize;
    }

    public String getLivingRoomCeiling() {
        return livingRoomCeiling;
    }

    public void setLivingRoomCeiling(String livingRoomCeiling) {
        this.livingRoomCeiling = livingRoomCeiling;
    }

    public String getLivingRoomFloor() {
        return livingRoomFloor;
    }

    public void setLivingRoomFloor(String livingRoomFloor) {
        this.livingRoomFloor = livingRoomFloor;
    }

    public String getBedRoomSize() {
        return bedRoomSize;
    }

    public void setBedRoomSize(String bedRoomSize) {
        this.bedRoomSize = bedRoomSize;
    }

    public String getBedRoomCeiling() {
        return bedRoomCeiling;
    }

    public void setBedRoomCeiling(String bedRoomCeiling) {
        this.bedRoomCeiling = bedRoomCeiling;
    }

    public String getBedRoomFloor() {
        return bedRoomFloor;
    }

    public void setBedRoomFloor(String bedRoomFloor) {
        this.bedRoomFloor = bedRoomFloor;
    }

    public Boolean getBedRoomWardRobe() {
        return bedRoomWardRobe;
    }

    public void setBedRoomWardRobe(Boolean bedRoomWardRobe) {
        this.bedRoomWardRobe = bedRoomWardRobe;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }
    
}
