package com.atguigu.gmall.pms.feign;

import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.gmall.pms.vo.SkuSaleVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ZJJ
 * @date 2020/8/4 0004 上午 9:45
 */

@FeignClient("sms-service")
public interface  GmallSmsClient {

    @PostMapping("sms/skubounds/skusale/save")
    public ResponseVo saveSkuSaleInfo(
            @RequestBody SkuSaleVo skuSaleVo
    );
}
