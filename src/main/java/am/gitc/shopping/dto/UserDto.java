package am.gitc.shopping.dto;

import am.gitc.shopping.validator.annotations.ValidPassword;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class UserDto {

    @NotNull
    @NotBlank
    private String name;

    //    @ValidPassword
    private String password;

    @JsonIgnore
    private String confirm;


}
