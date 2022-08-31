package com.tube.hosting.java.tube.objects;

public class Address extends ResponsableObject {

  private final String company;
  private final String city;
  private final String street;
  private final String streetNumber;
  private final String numberAdditive;
  private final String country;
  private final String postalCode;

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
}
