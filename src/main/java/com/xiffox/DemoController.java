package com.xiffox;

import com.xiffox.model.SingleUserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping(method = RequestMethod.POST, value = "/send/singleUserReq")
    @ResponseBody
    public String sendNotificationToSingleUser(@RequestBody SingleUserRequest singleUserRequest) {
        System.out.println(singleUserRequest.getPayload());
        return "test success";
    }
}
