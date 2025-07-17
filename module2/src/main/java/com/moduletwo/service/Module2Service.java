package com.moduletwo.service;

import com.moduletwo.dtos.Module2DTO;

public class Module2Service {
    public Module2DTO retrieveData(){
        return new Module2DTO("This is from Module2");
    }
}
