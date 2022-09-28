package de.tekup.firstdemob.services;

import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
public class IndexServiceImpl implements IndexService {

    public IndexServiceImpl(){
        System.out.println("Index Service Object is created");
    }

    public String getHello(){
        return "Helloo !!!";
    }
}
