package az.developia.infocountry.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Travel {
 private User user;
 private Country country;
 private TravelStatus travelStatus;
 private Integer rating;
}
