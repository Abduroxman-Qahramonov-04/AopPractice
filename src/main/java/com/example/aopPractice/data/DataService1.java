package com.example.aopPractice.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
    public int[] retrieveData(){
        return new int[]{1,2,3,4,5,7};
    }
}
