package com.atguigu.gmall.pms.feign;

import com.atguigu.gmall.sms.api.GmallSmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ZJJ
 * @date 2020/8/4 0004 上午 9:45
 */

@FeignClient("sms-service")
public interface  GmallSmsClient extends GmallSmsApi {

}
