package com.example.aopPractice.business;

import com.example.aopPractice.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessLogic1 {
    private DataService1 dataService1;

    public BusinessLogic1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }
    public int calculateMax(){
        int[] data = dataService1.retrieveData();
        return Arrays.stream(data).max().orElse(0);
    }
}
