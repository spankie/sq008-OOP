package com.decagon;

/**
 * Personel
 */
public abstract class Personel {
  private String name;
  private Integer id;
  private String address;
  private String emailAddress;

  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public Personel(String name, Integer id, String address, String emailAddress) {
    this.name = name;
    this.id = id;
    this.address = address;
    this.emailAddress = emailAddress;
  }
}