package com.decagon;

/**
 * Accountant
 */
public class Accountant extends Personel {
  private Integer salary;

  public Accountant(String name, Integer id, String address, String emailAddress, Integer salary) {
    super(name, id, address, emailAddress);
    this.salary = salary;
  }
  
}