package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.pms.entity.SkuEntity;
import com.atguigu.gmall.pms.vo.SkuVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * sku信息
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2020-07-28 19:24:36
 */
public interface SkuService extends IService<SkuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    /**
     * 保存完整的 sku信息
     * @param skuVo
     */
    void saveSkuVo(SkuVo skuVo);
}

