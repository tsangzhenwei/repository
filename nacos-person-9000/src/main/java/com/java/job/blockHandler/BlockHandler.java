package com.java.job.blockHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Component;

@Component
public class BlockHandler {

    public static String blockHandler(BlockException blockException){
        return "Don't click me!!!   服务器压力太大哦，请您晚点再试试。。。。。";
    }
}
