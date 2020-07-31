package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.pms.entity.SpuEntity;
import com.atguigu.gmall.pms.mapper.SpuMapper;
import com.atguigu.gmall.pms.service.SpuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service("spuService")
public class SpuServiceImpl extends ServiceImpl<SpuMapper, SpuEntity> implements SpuService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SpuEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SpuEntity>()
        );

        return new PageResultVo(page);
    }

    @Override
    public PageResultVo querySpuInfo(PageParamVo pageParamVo, Long categoryId) {
        QueryWrapper<SpuEntity> queryWrapper = new QueryWrapper<>();
        // 如果分类id不为0，要根据分类id查，否则查全部
        if(categoryId != 0){
            queryWrapper.eq("catgory_id",categoryId);
        }
        // 如果用户输入了检索条件，根据检索条件查
        String key = pageParamVo.getKey();
        if(!StringUtils.isEmpty(key)){
            queryWrapper.and(t -> t.like("name",key).or().like("id",key));
        }

        IPage<SpuEntity> page = this.page(pageParamVo.getPage(), queryWrapper);
        return new PageResultVo(page);

    }

}