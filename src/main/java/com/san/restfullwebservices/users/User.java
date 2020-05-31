/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.san.restfullwebservices.users;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 *
 * @author Santosh Belote
 */
@ApiModel(description = "Description about user.")
public class User {
    
    private Integer id;
    
    @Size(min = 2)
    @ApiModelProperty(notes = "Name should have atleast 2 characters.")
    private String name;
    
    @Past // Entered date should be Past date
    @ApiModelProperty(notes = "Birth date should be in past.")
    private Date dob;

    protected User(){
        
    }
    public User(Integer id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", dob=" + dob + '}';
    }
    
}
