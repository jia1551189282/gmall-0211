package com.atguigu.gmall.pms.controller;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.gmall.pms.entity.SpuEntity;
import com.atguigu.gmall.pms.service.SpuService;
import com.atguigu.gmall.pms.vo.SpuVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * spu信息
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2020-07-28 19:24:36
 */
@Api(tags = "spu信息 管理")
@RestController
@RequestMapping("pms/spu")
public class SpuController {

    @Autowired
    private SpuService spuService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> querySpuByPage(PageParamVo paramVo){
        PageResultVo pageResultVo = spuService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<SpuEntity> querySpuById(@PathVariable("id") Long id){
		SpuEntity spu = spuService.getById(id);

        return ResponseVo.ok(spu);
    }

    /**
     * 保存
     */
    /*@PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody SpuEntity spu){
		spuService.save(spu);

        return ResponseVo.ok();
    }
*/
    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody SpuEntity spu){
		spuService.updateById(spu);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		spuService.removeByIds(ids);

        return ResponseVo.ok();
    }

    @ApiOperation("spu商品查询")
    @GetMapping("category/{categoryId}")
    public ResponseVo<PageResultVo> querySpuInfo(
            PageParamVo pageParamVo,
            @PathVariable("categoryId")Long categoryId
    ){
      PageResultVo pageResultVo  = spuService.querySpuInfo(pageParamVo,categoryId);

      return ResponseVo.ok(pageResultVo);
    }

    @ApiOperation("保存完整的商品信息")
    @PostMapping
    public ResponseVo save(@RequestBody SpuVo spuVo){
        spuService.saveSkuVo(spuVo);

        return ResponseVo.ok();
    }

}
