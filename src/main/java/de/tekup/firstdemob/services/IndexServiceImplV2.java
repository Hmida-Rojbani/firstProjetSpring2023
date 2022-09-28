package de.tekup.firstdemob.services;

import org.springframework.stereotype.Service;

@Service
public class IndexServiceImplV2 implements IndexService{
        @Override
        public String getHello() {
                return "Hello GLSI";
        }
}
