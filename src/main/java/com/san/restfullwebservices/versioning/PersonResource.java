/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.san.restfullwebservices.versioning;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author krawler
 */

@RestController
public class PersonResource {
    // -------------- URI Versioning-------------
    @RequestMapping(method = RequestMethod.GET, path = "person/v1")
    public PersonV1 uriVersioning1()
    {
        return new PersonV1("Santosh");
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "person/v2")
    public PersonV2 uriVersioning2()
    {
        return new PersonV2(new Name("Santosh", "Belote"));
    }
    
     // -------------- Request Param Versioning-------------
    
    @RequestMapping(method = RequestMethod.GET, value = "/person/version", params = "v1")
    public PersonV1 RequestParamVersioning1(){
        return new PersonV1("Santosh");
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/person/version", params = "v2")
    public PersonV2 RequestParamVersioning2(){
        return new PersonV2(new Name("Santosh", "Belote"));
    }
    
     // -------------- Request Header Versioning-------------
    
    @GetMapping(value = "/person/header", headers = "version=v1")
    public PersonV1 RequestHeaderVersioning1(){
        return new PersonV1("Santosh");
    }
    
    @GetMapping(value = "/person/header", headers = "version=v2")
    public PersonV2 RequestHeaderVersioning2(){
        return new PersonV2(new Name("Santosh", "Belote"));
    }
    
}
