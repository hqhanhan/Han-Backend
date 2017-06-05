package com.han.feign.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.han.feign.client.ComputeClient;
import javafx.application.Application;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Description：
 * Created by hqhan on 2017/6/5 0005.
 */

@CommonsLog
@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/mn/{id}", method = RequestMethod.GET)
    public Integer add(@PathVariable String id) {
        log.debug(id);
        return computeClient.add(40, 20);
    }
}
