package com.decagon;

/**
 * Applicant
 */
public class Applicant extends Personel {
  private String position;
  private Integer yearsOfExperience;
  private String academicQualification;
  
  @Override
  public String toString() {
    return "Applicant [academicQualification=" + academicQualification + ", position=" + position
        + ", yearsOfExperience=" + yearsOfExperience + "years]";
  }

  public Applicant(String name, Integer id, String address, String emailAddress, String position, Integer yearsOfExperience, String academicQualification) {
    super(name, id, address, emailAddress);
    name = "somethingelse";
    this.position = position;
    this.academicQualification = academicQualification;
    this.yearsOfExperience = yearsOfExperience;
  }

  public Integer getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(Integer yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  public String getAcademicQualification() {
    return academicQualification;
  }

  public void setAcademicQualification(String academicQualification) {
    this.academicQualification = academicQualification;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  
}