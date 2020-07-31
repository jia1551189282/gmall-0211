package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 商品三级分类
 *
 * @author zjj
 * @date 2020-07-28 19:24:36
 */
public interface CategoryService extends IService<CategoryEntity> {
    /**
     * 分页查询
     * @param paramVo 分页封装参数
     * @return        分页结果
     */
    PageResultVo queryPage(PageParamVo paramVo);

    /**
     * 根据父id 查询分类
     * @param parentId 父id
     * @return  分类列表
     */
    List<CategoryEntity> queryCategory(Long parentId);
}

