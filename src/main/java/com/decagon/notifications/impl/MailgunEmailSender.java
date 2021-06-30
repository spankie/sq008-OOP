package com.decagon.notifications.impl;

import com.decagon.notifications.EmailSender;

public class MailgunEmailSender implements EmailSender {

  @Override
  public void sendTextEmail(String to, String from, String subject, String content) {
    System.out.printf("[Mailgun]: %s is sending a TEXT email to %s\nWith subject: %s\n that contains %s", from, to, subject, content);
    
  }

  @Override
  public void sendHtmlEmail(String to, String from, String subject, String content) {
    System.out.printf("[Mailgun]: %s is sending an HTML email to %s\nWith subject: %s\n that contains %s", from, to, subject, content);
    
  }
  
}
