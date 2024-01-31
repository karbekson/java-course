package tech.dar.practice14.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BookCreateRequest {

    @NotBlank
    private String title;
    @NotNull
    private String description;

}
