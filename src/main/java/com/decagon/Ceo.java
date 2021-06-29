package com.decagon;

import java.util.List;
import java.util.Map;

/**
 * Ceo
 */
public class Ceo extends Personel {
  private Integer salary;
  private EmailSender emailSender;
  private Map<String, Integer> positionSalary;


  public EmailSender getEmailSender() {
    return emailSender;
  }

  public void setEmailSender(EmailSender emailSender) {
    this.emailSender = emailSender;
  }

  public Map<String, Integer> getPositionSalary() {
    return positionSalary;
  }

  public void setPositionSalary(Map<String, Integer> positionSalary) {
    this.positionSalary = positionSalary;
  }

  public Ceo(String name, Integer id, String address, String emailAddress,
             Integer salary, EmailSender emailSender, Map<String, Integer> positionSalary) {
    super(name, id, address, emailAddress);
    this.salary = salary;
    this.emailSender = emailSender;
    this.positionSalary = positionSalary;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public void fire() {
    // somebody applied
    // do backgroud check
    // do interviews
    // if the person qualifies we want to send email
    // EmailSender emailSender = new SendGridEmailSender();
    emailSender.sendTextEmail("odohi.david@gmail.com", "spankie@gmail.com", "Hello David",
        "Hi David, I'm trying to check up on you. how is the edo state?\n");
  }

  public void hire(Applicant applicant, List<Staff> staffs) {
    if (applicant.getAcademicQualification().equals("BSC") && applicant.getYearsOfExperience() > 2) {
      // hire the this person
      Integer salary = this.positionSalary.get(applicant.getPosition());
      staffs.add(new Staff(applicant.getName(), staffs.size(), applicant.getAddress(), applicant.getEmailAddress(), salary, applicant.getPosition()));
      emailSender.sendTextEmail(applicant.getEmailAddress(), this.getEmailAddress(), "Hello "+applicant.getName(),
        "Hi "+applicant.getName()+", You have been hired for the position of "+applicant.getPosition()+" and your salary is "+salary+"\n");
    }
    // somebody applied
    // do backgroud check
    // do interviews
    // if the person qualifies we want to send email
    // EmailSender emailSender = new SendGridEmailSender();
    
  }

}