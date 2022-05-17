package az.developia.infocountry.model;

import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode (callSuper = true)
@Data
@ToString(exclude = "president")
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Country extends BaseModel {
    private Long id;
    private String name;
    private String region;
    private Long territory;
    private Long population;
    private String capital;
    private Long code;
    private String language;
    private BigDecimal overallRating;
    private President president;
}
