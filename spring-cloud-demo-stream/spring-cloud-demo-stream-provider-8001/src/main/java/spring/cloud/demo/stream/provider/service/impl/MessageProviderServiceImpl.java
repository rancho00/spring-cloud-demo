package spring.cloud.demo.stream.provider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import spring.cloud.demo.stream.provider.service.MessageProviderService;

@Service
@EnableBinding(Source.class)
public class MessageProviderServiceImpl implements MessageProviderService {

    @Autowired
    private MessageChannel messageChannel;

    @Override
    public String send() {
        messageChannel.send(MessageBuilder.withPayload("hello").build());
        return null;
    }
}
