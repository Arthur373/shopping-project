package am.gitc.shopping.services;

import am.gitc.shopping.dto.UserDto;

public interface EmailSender {

  void sendSimpleMessage(UserDto userDto);
}
