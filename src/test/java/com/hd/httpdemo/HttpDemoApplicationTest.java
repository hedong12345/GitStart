package com.hd.httpdemo;

import com.hd.httpdemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @author 11730
 * @date 2020/1/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpDemoApplicationTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void httpGet(){
        User user = restTemplate.getForObject("http://localhost:8080/user/2", User.class);

        System.out.println(user==null ? "hah":user.toString());

    }

}
