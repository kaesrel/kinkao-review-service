package ku.review.dto;

import lombok.Data;
import java.util.UUID;

@Data
public class ReviewRequest {
   private UUID restaurantId;
   private String username;
   private String reviewText;
}
