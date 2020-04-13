package spring.cloud.demo.sentinel.provider.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class CustomHandler {

    public static String handlerException(BlockException e){
        return "全局异常--->"+e.getMessage();
    }
    public static String handlerException2(BlockException e){
        return "全局异常2--->"+e.getMessage();
    }
}
