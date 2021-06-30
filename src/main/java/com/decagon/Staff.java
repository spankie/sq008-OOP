package com.decagon;

/**
 * Staff
 */
public class Staff extends Personel {
  private Integer salary;
  private String position;
  
  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public String getPosition() {
    return position;
  }

  @Override
  public String toString() {
    return "Staff [name="+this.getName()+", position=" + position + ", salary=" + salary + "]";
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Staff(String name, Integer id, String address,String emailAddress, Integer salary, String position) {
    super(name, id, address, emailAddress);
    this.salary = salary;
    this.position = position;
  }

  
}