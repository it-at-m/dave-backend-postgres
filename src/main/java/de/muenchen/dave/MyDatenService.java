package de.muenchen.dave;

import de.muenchen.dave.configuration.CachingConfiguration;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyDatenService {


    @Cacheable(value = CachingConfiguration.GEOEAI)
    public String load(String key) {
        System.out.println("load");
        return "world";
    }
}
