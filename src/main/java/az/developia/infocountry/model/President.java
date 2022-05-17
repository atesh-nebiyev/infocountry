package az.developia.infocountry.model;

import lombok.*;

import java.time.LocalDate;
@EqualsAndHashCode (callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class President extends BaseModel {
    private Long id;
    private String firstName;
    private String midddleName;
    private String lastName;
    private LocalDate birthDate;
    private Country country;
}
