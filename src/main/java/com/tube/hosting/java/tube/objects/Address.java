package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class Address extends ResponsableObject {

  private final @NotNull String company;
  private final @NotNull String city;
  private final @NotNull String street;
  private final @NotNull String streetNumber;
  private final @NotNull String numberAdditive;
  private final @NotNull String country;
  private final @NotNull String postalCode;

  public Address(@NotNull String company, @NotNull String city, @NotNull String street, @NotNull String streetNumber,
      @NotNull String numberAdditive, @NotNull String country, @NotNull String postalCode) {
    this.company = company;
    this.city = city;
    this.street = street;
    this.streetNumber = streetNumber;
    this.numberAdditive = numberAdditive;
    this.country = country;
    this.postalCode = postalCode;
  }

  @NotNull
  public String getCompany() {
    return company;
  }

  @NotNull
  public String getCity() {
    return city;
  }

  @NotNull
  public String getStreet() {
    return street;
  }

  @NotNull
  public String getStreetNumber() {
    return streetNumber;
  }

  @NotNull
  public String getNumberAdditive() {
    return numberAdditive;
  }

  @NotNull
  public String getCountry() {
    return country;
  }

  @NotNull
  public String getPostalCode() {
    return postalCode;
  }
}
