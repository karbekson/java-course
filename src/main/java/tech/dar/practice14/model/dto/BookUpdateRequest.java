package tech.dar.practice14.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BookUpdateRequest {

    private String title;
    private String description;

}
