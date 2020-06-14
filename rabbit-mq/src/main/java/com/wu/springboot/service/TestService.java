package com.wu.springboot.service;


import com.wu.springboot.common.ServerResponse;
import com.wu.springboot.pojo.Mail;

public interface TestService {

    ServerResponse testIdempotence();

    ServerResponse accessLimit();

    ServerResponse send(Mail mail);
}
