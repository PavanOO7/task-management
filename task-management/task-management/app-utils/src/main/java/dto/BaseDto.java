package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseDto {

    Boolean is_Active;
    String createdBy;
    Date createdOn;
    String lastUpdatedBy;
    Date lastUpdatedOn;

}
