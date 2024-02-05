package tech.dar.practice14.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class AuthorCreateRequest {

    @NotBlank
    private String name;
    @NotNull
    private LocalDate birthDate;

}
