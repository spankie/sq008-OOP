package com.decagon.notifications;

public interface EmailSender {
  public void sendTextEmail(String to, String from, String subject, String content);
  public void sendHtmlEmail(String to, String from, String subject, String content);
}
