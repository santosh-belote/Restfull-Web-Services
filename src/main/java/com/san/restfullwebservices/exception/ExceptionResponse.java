/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.san.restfullwebservices.exception;

import java.util.Date;

/**
 *
 * @author Santosh Belote
 */
public class ExceptionResponse {
    private String description;
    private Date timestamp;
    private String details;

    public ExceptionResponse(String description, Date timestamp, String details) {
        super();
        this.description = description;
        this.timestamp = timestamp;
        this.details = details;
    }

    public String getName() {
        return description;
    }

    public void setName(String name) {
        this.description = name;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    
}
