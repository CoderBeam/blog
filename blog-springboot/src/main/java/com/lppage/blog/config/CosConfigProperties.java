package com.lppage.blog.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * oss配置属性
 *
 * @author liangpeng
 * @date 2022/02/14
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "cos")
public class CosConfigProperties {

    /**
     * APPID
     *
     */
    private String appId;

    /**
     * 桶的名称
     */
    private String bucketName;

    /**
     * 区域
     */
    private String region;

    /**
     * 初始化用户身份信息(secretId, secretKey)
     * SecretId 是用于标识 API 调用者的身份
     */
    private String SecretId;

    /**
     * SecretKey是用于加密签名字符串和服务器端验证签名字符串的密钥
     */
    private String SecretKey;

    /**
     * 访问路径前缀
     */
    private String url;
}
