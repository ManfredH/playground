package org.devmem.springconsumerest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.text.NumberFormat;

@Component
public class RestProxyTemplate {

    /*
    see https://gist.github.com/davidtimmerman/86ae3822075aad16edc0
    */

    final Logger logger = LogManager.getLogger(RestProxyTemplate.class);

    @Autowired
    RestTemplate restTemplate;

    @Value("${proxy.host}")
    String host;

    @Value("${proxy.port}")
    String port;

    @PostConstruct
    public void init() {
        int portNr = -1;

        try {
            portNr = Integer.parseInt(port);
        } catch (NumberFormatException e) {
            logger.error("Unable to parse the proxy port number");
        }
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        InetSocketAddress address = new InetSocketAddress(host, portNr);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, address);
        factory.setProxy(proxy);

        restTemplate.setRequestFactory(factory);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
}
