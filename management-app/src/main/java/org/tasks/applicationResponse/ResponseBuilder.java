package org.tasks.applicationResponse;


import org.springframework.web.ErrorResponse;
import org.tasks.models.TaskManagementResponse;

import java.util.List;

public class ResponseBuilder {

    public static TaskManagementResponse buildResponse(Object body){
        TaskManagementResponse taskManagementResponse = new TaskManagementResponse();
    taskManagementResponse.setBody(body);
//    taskManagementResponse.setStatus(status);
        return taskManagementResponse;
    }

    public static TaskManagementResponse buildResponse(Object body, Integer pageNumber, Integer size,
                                                       Integer totalPages, List<ErrorResponse> errors,
                                                       String status){
        TaskManagementResponse taskManagementResponse = new TaskManagementResponse();
//        taskManagementResponse.setBody(body);
//        taskManagementResponse.setStatus(status);
        return taskManagementResponse;
    }
}