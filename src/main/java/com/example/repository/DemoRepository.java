package com.example.repository;

import com.example.pojo.DemoPojo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DemoRepository {

    private List<DemoPojo> demoPojoList = new ArrayList<>();

    public DemoPojo getDemoPojo(int index){
        return demoPojoList.get(index);
    }

    public void addDemoPojo(DemoPojo demoPojo){
        demoPojoList.add(demoPojo);
    }

    public DemoPojo setDemoPojo(int index, DemoPojo demoPojo){
        return demoPojoList.set(index, demoPojo);
    }

    public void deleteDemoPojo(int index){
        demoPojoList.remove(index);
    }

    public List<DemoPojo> getDemoPojos(){
        return demoPojoList;
    }
}
