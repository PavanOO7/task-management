package org.tasks.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.*;
import org.tasks.validation.OnCreate;
import org.tasks.validation.OnUpdate;

import java.util.Date;

import static org.tasks.utilConstants.ResponseMessages.ID_SHOULD_BE_NULL;
import static org.tasks.utilConstants.ResponseMessages.ID_SHOULD_NOT_BE_NULL;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends BaseDTO  {
    @NotNull(groups = OnUpdate.class, message = ID_SHOULD_NOT_BE_NULL)
    @Null(groups = OnCreate.class, message = ID_SHOULD_BE_NULL)

    private Long id;

    private String firstName;

    private String lastName;

    private String middleName;

    private Date lastActive;
}
