package com.decagon;

public interface EmailSender {
  public void sendTextEmail(String to, String from, String subject, String content);
  public void sendHtmlEmail(String to, String from, String subject, String content);
}
