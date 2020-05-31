/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.san.restfullwebservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author Santosh Belote
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public static final Contact DEFAULT_CONTACT = new Contact("Santosh Belote", "www.google.com", "santoshv93@gmail.com");
    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Beatiful API Documentation", "This is documentation regarding Swagger API", "1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0", "www.license.com");
    
    @Bean
    public Docket api(){
        
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO);
    }
}
