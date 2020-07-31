package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.pms.entity.SpuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * spu信息
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2020-07-28 19:24:36
 */
public interface SpuService extends IService<SpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    /**
     * 分页条件查询  spu产品
     * @param pageParamVo 分页条件
     * @param categoryId    分类id
     * @return  spu列表-分页封装
     */
    PageResultVo querySpuInfo(PageParamVo pageParamVo, Long categoryId);
}

