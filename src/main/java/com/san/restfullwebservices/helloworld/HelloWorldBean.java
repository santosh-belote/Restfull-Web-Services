/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.san.restfullwebservices.helloworld;

/**
 *
 * @author Santosh Belote
 */
class HelloWorldBean {

    private String name;

    HelloWorldBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" + "name=" + name + '}';
    }

}
