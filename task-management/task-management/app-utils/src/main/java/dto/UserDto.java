package dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import validation.OnCreate;
import validation.OnUpdate;

import java.util.Date;

import static utilConstants.ResponseMessages.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto extends BaseDto  {
   @NotNull(groups = OnUpdate.class, message = ID_SHOULD_NOT_BE_NULL)
   @Null(groups = OnCreate.class, message = ID_SHOULD_BE_NULL)

    private Long id;

    private String firstName;

    private String lastName;

    private String middleName;

    private Date lastActive;

}
