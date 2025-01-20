package org.tasks.management.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tasks.management.exception.ErrorResponse;

import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskManagementResponse {
    private Object body;
    private String status;
    private List<ErrorResponse> errors;
}
