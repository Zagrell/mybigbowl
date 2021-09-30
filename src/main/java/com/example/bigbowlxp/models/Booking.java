package com.example.bigbowlxp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Booking {

    @Id
    private int bookingId;
    private int customerId;
    private String firstName;
    private String lastName;
    private String phone;
    private Activity activity;
    private Date date;
    private String startTime;
    private int duration;
    private ArrayList<Integer> bookingUnits;

    public int getBookingId() {
        return bookingId;
    }

    public ArrayList<Integer> getBookingUnits() {
        return bookingUnits;
    }

    public void setBookingUnits(ArrayList<Integer> bookingUnits) {
        this.bookingUnits = bookingUnits;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Booking (){
    }
}