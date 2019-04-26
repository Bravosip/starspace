package com.summer.starspace.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
//@PropertySource(value="classpath:application.properties",encoding = "gbk")
public class StarProperties {
    @Value("${com.starspace.blog.name}")
    private String name;
    @Value("${com.starspace.blog.title}")
    private String title;
    @Value("${com.starspace.blog.desc}")
    private String desc;
    @Value("${com.starspace.blog.value}")
    private String value;
    @Value("${com.starspace.blog.number}")
    private String number;
    @Value("${com.starspace.blog.bignumber}")
    private String bignumber;
    @Value("${com.starspace.blog.test1}")
    private String test1;
    @Value("${com.starspace.blog.test2}")
    private String test2;
}
