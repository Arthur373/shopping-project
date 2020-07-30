package am.gitc.shopping.services;

import am.gitc.shopping.dto.MailDto;
import org.springframework.stereotype.Service;

@Service
public interface EmailSender {

  void sendSimpleMessage(MailDto mailDto);
}
