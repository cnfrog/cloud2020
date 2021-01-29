package cn.ypjalt.springcloud.alibaba.myhandler;

import cn.ypjalt.springcloud.entities.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2021/1/28 11:31 下午
 * Description: No Description
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException1(BlockException exception) {
        return new CommonResult(444, "用户自定义---1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "用户自定义---2");
    }
}
