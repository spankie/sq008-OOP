package com.decagon;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Company
 */
public class Company {
  // add a way of specifying a position and corresponding salary
  private Map<String, Integer> positionSalary;
  private Ceo ceo;
  private List<Staff> staffs;
  private Accountant accountant;
  private List<Applicant> applicants;
  
  public Ceo getCeo() {
    return ceo;
  }

  public void setCeo(Ceo ceo) {
    this.ceo = ceo;
  }

  public List<Staff> getStaffs() {
    return staffs;
  }

  public void setStaffs(List<Staff> staffs) {
    this.staffs = staffs;
  }

  // add a staff to the existing list of staff
  public void addStaff(Staff staff) {
    this.staffs.add(staff);
  }

  public Accountant getAccountant() {
    return accountant;
  }

  public void setAccountant(Accountant accountant) {
    this.accountant = accountant;
  }

  public List<Applicant> getApplicants() {
    return applicants;
  }

  public void setApplicants(List<Applicant> applicants) {
    this.applicants = applicants;
  }

  public Company(Ceo ceo, List<Staff> staffs, Accountant accountant) {
    this.ceo = ceo;
    this.staffs = staffs;
    this.accountant = accountant;
    this.applicants = new ArrayList<>();
  }

  public void apply(Applicant applicant) {
    this.applicants.add(applicant);
  }

  public void hire() {
    for (int i = 0; i < applicants.size(); i++) {
      this.ceo.hire(this.applicants.get(i), this.staffs);
    }
  }
}