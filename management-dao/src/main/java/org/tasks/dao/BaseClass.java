package org.tasks.dao;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;


@Data
public class BaseClass {
    @Column(name = "is_active")
    Boolean isActive;

    @Column(name = "created_by")
    String createdBy;

    @Column(name = "created_on")
    Date createdOn;

    @Column(name = "last_updated_by")
    String lastUpdatedBy;

    @Column(name = "last_updated_on")
    Date lastUpdatedOn;

}