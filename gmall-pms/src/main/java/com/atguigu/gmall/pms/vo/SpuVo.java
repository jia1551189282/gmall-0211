package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.SpuEntity;
import lombok.Data;

import java.util.List;

/**
 * @author ZJJ
 * @date 2020/8/3 0003 上午 11:43
 */
@Data
public class SpuVo extends SpuEntity {

    // 图片信息
    List<String> spuImages;

    // 基本属性信息
    List<SpuAttrValueVo> baseAttrs;

    // sku信息
    List<SkuVo> skus;


}
