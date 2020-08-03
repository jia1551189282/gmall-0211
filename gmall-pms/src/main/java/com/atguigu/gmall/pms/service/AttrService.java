package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 商品属性
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2020-07-28 19:24:36
 */
public interface AttrService extends IService<AttrEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    /**
     * 根据 三级分类，以及查询条件查询 属性
     * @param cid           三级分类id
     * @param type          属性类型： 0 销售属性  1 基本属性  2 既是销售属性，又是基本属性
     * @param searchType    是否需要检索： 0  不需要 ，1 需要
     * @return              属性列表
     */
    List<AttrEntity> queryByCid(Long cid, Integer type, Integer searchType);
}

