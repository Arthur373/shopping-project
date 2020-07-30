package am.gitc.shopping.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
public class ProductDto {

    @Positive
    private int id;

    private String img;

    @NotNull
    private String title;

    @NotNull
    private String text;

    @NotNull
    private double price;

    @JsonProperty("old_price")
    private double oldPrice;
}
