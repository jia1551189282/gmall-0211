package com.atguigu.gmall.pms.controller;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.atguigu.gmall.common.bean.ResponseVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ZJJ
 * @date 2020/7/30 0030 下午 2:57
 */
@Api(tags = "oss图片授权")
@RestController
@RequestMapping("pms/oss")
public class OssController {

    String accessId = "LTAI4GD8eofb73ye4hRB4XAT"; // 请填写您的AccessKeyId。
    String accessKey = "IHCtkreTrelivCcytPxuEXKkAjLjKT"; // 请填写您的AccessKeySecret。
    String endpoint = "oss-cn-shenzhen.aliyuncs.com"; // 请填写您的 endpoint。
    String bucket = "gmallstudy"; // 请填写您的 bucketname 。
    String host = "https://" + bucket + "." + endpoint; // host的格式为 bucketname.endpoint

    String dir = LocalDate.now().toString(); // 用户上传文件时指定的前缀。

    @GetMapping("policy")
    public ResponseVo<Object> policy() throws UnsupportedEncodingException {


            // 创建OSSClient实例。
            OSS ossClient = new OSSClientBuilder().build(endpoint, accessId, accessKey);

                long expireTime = 30;
                long expireEndTime = System.currentTimeMillis() + expireTime * 1000;
                Date expiration = new Date(expireEndTime);
                // PostObject请求最大可支持的文件大小为5 GB，即CONTENT_LENGTH_RANGE为5*1024*1024*1024。
                PolicyConditions policyConds = new PolicyConditions();
                policyConds.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, 1048576000);
                policyConds.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);

                String postPolicy = ossClient.generatePostPolicy(expiration, policyConds);
                byte[] binaryData = postPolicy.getBytes("utf-8");
                String encodedPolicy = BinaryUtil.toBase64String(binaryData);
                String postSignature = ossClient.calculatePostSignature(postPolicy);

                Map<String, String> respMap = new LinkedHashMap<String, String>();
                respMap.put("accessid", accessId);
                respMap.put("policy", encodedPolicy);
                respMap.put("signature", postSignature);
                respMap.put("dir", dir);
                respMap.put("host", host);
                respMap.put("expire", String.valueOf(expireEndTime / 1000));

                return ResponseVo.ok(respMap);



        }

}
