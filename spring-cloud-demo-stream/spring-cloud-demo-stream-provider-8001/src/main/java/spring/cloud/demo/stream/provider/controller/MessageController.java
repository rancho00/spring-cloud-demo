package spring.cloud.demo.stream.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.demo.stream.provider.service.MessageProviderService;

@RestController
public class MessageController {

    @Autowired
    private MessageProviderService MessageProviderService;

    @GetMapping("/send")
    public String send(){
        return MessageProviderService.send();
    }
}
