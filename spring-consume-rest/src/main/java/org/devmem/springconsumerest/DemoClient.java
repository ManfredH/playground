package org.devmem.springconsumerest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class DemoClient {

    @Autowired
    private RestTemplate restTemplate;

    private String componentName;

    public DemoClient( @Value("DemoClient") String componentName) {
        this.componentName = componentName;
    }

    @PostConstruct
    public void getDataFromService() {

        String url_template = "https://api.github.com/repos/spring-projects/spring-framework/commits";

        String result;
        result = restTemplate.getForObject(url_template, String.class);
        System.out.println(result);

    }

    /*
    see https://stackoverflow.com/questions/28024942/how-to-autowire-resttemplate-using-annotations
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
