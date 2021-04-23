package com.company.lesson10;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
private final Map<String, List<String>> directory=new HashMap<>();

    public void add(String familyName, String numTel){
        List<String> numTelephone;
        if (directory.containsKey(familyName)){
            numTelephone =directory.get(familyName);
        }else{
            numTelephone =new ArrayList<>();
        }
        numTelephone.add(numTel);
        directory.put(familyName, numTelephone);
    }
    public List<String> get(String familyName){
      return directory.get(familyName);
    }
}

