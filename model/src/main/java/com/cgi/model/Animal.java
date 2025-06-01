package com.cgi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {

    public String description = "un animal";

    public AnimalFood getFood(){
        return new AnimalFood("something");
    }



}
