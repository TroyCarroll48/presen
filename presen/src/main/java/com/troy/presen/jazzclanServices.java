package com.troy.presen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;

@JsonIgnoreProperties(ignoreUnknown = true)
public class jazzclanServices {



    @Autowired
    private jazzRepo jazzRepo;
}
