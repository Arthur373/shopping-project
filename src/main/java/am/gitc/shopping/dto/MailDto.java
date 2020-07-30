package am.gitc.shopping.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class MailDto {

    @NotNull
    @NotBlank
    private String name;

    @Email
    private String email;

    @NotNull
    private String subject;

    @NotNull
    @NotBlank
    private String message;

}
