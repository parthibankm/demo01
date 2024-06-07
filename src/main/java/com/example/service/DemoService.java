package com.example.service;

import com.example.pojo.DemoPojo;
import com.example.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    DemoRepository demoRepository;

    public DemoPojo getDemoPojo(int index){
        return demoRepository.getDemoPojo(index);
    }

    public void addDemoPojo(DemoPojo demoPojo){
        demoRepository.addDemoPojo(demoPojo);
    }

    public DemoPojo setDemoPojo(int index, DemoPojo demoPojo){
        return demoRepository.setDemoPojo(index, demoPojo);
    }

    public void deleteDemoPojo(int index){
        demoRepository.deleteDemoPojo(index);
    }

    public DemoRepository getDemoPojos(){
        return demoRepository;
    }

}