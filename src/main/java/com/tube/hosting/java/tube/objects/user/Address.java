package com.tube.hosting.java.tube.objects.user;

import com.tube.hosting.java.tube.objects.ResponsableObject;

public class Address extends ResponsableObject {

  private String company;
  private String city;
  private String street;
  private String streetNumber;
  private String numberAdditive;
  private String country;
  private String postalCode;

  public Address(String company, String city, String street, String streetNumber, String numberAdditive,
      String country, String postalCode) {
    this.company = company;
    this.city = city;
    this.street = street;
    this.streetNumber = streetNumber;
    this.numberAdditive = numberAdditive;
    this.country = country;
    this.postalCode = postalCode;
  }

  public String getCompany() {
    return company;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public String getStreetNumber() {
    return streetNumber;
  }

  public String getNumberAdditive() {
    return numberAdditive;
  }

  public String getCountry() {
    return country;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public void setNumberAdditive(String numberAdditive) {
    this.numberAdditive = numberAdditive;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
}
