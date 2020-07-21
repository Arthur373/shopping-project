package am.gitc.shopping.services.impl;

import am.gitc.shopping.dto.UserDto;
import am.gitc.shopping.services.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderImpl implements EmailSender {

  private final JavaMailSender mailSender;

  @Autowired
  public EmailSenderImpl(JavaMailSender mailSender) {
    this.mailSender = mailSender;
  }

  @Override
  public void sendSimpleMessage(UserDto userDto) {
    SimpleMailMessage mailMessage = new SimpleMailMessage();
    mailMessage.setTo(userDto.getEmail());
    mailMessage.setSubject("Subject is: " + userDto.getSubject() + "from " + userDto.getName());
    mailMessage.setText(userDto.getMessage());
    this.mailSender.send(mailMessage);
  }

}
