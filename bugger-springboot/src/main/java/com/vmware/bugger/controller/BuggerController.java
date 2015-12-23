package com.vmware.bugger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.bugger.model.LogRequest;

@RestController
@EnableAutoConfiguration
public class BuggerController {

    private static final Logger logger = LoggerFactory.getLogger(BuggerController.class);

    @RequestMapping(method = RequestMethod.GET)
    String get() {

        return "Hello World! get";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/webhook", consumes = {"application/json"})
    String post(@RequestBody LogRequest body) {
        logger.info(body.getAlertName());

        return "Hello World! post";
    }
}


