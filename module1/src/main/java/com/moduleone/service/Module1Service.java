package com.moduleone.service;

import com.moduleone.dtos.Module1DTO;

public class Module1Service {
    public Module1DTO retrieveData(){
        return new Module1DTO("Hello this is from Module1DTO");
    }
}
