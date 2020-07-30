package am.gitc.shopping.services.impl;

import am.gitc.shopping.dto.MailDto;
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
    public void sendSimpleMessage(MailDto mailDto) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(mailDto.getEmail());
        mailMessage.setSubject("Subject is: " + mailDto.getSubject() + "from " + mailDto.getName());
        mailMessage.setText(mailDto.getMessage());
        this.mailSender.send(mailMessage);
    }

}
