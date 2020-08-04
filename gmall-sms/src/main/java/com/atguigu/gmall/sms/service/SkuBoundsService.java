package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.sms.entity.SkuBoundsEntity;
import com.atguigu.gmall.sms.vo.SkuSaleVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 商品spu积分设置
 *
 * @author zjiajia
 * @email zjiajia@155.com
 * @date 2020-08-04 09:23:26
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    /**
     * 保存sku 营销信息
     * @param skuSaleVo  营销信息封装对象
     */
    void saveSkuSaleInfo(SkuSaleVo skuSaleVo);
}

