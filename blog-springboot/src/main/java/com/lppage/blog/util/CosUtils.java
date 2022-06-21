package com.lppage.blog.util;


import cn.hutool.core.io.FileUtil;
import com.lppage.blog.config.CosConfigProperties;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.CosClientException;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.net.URL;
import java.util.Date;


@Slf4j
@Component
public class CosUtils {

    public static final String secretId = "AKIDDF2ZrtiIckdGemfJhqjMkslPnvoUv73l";

    public static final String secretKey = "UihQu86pIWUCfsqY1GG1XnoZ5LM7cste";


    //存储桶地域
    public static final String regionName = "ap-shanghai";

    //存储桶名字
    public static final String bucketName = "lppage-1304451712";

    //唯一标识的key
//    public static final String key =  NanoIdUtils.randomNanoId() + ".jpg";
    //过期时间
    public static final Date expiration = new Date(new Date().getTime() + 5 * 60 * 10000);

    //创建客户端连接
    public static COSClient getCosClient() {
        // 1 初始化用户身份信息(secretId, secretKey)
        COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);

        // 2 设置bucket的区域, COS地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
        // clientConfig中包含了设置region, https(默认http), 超时, 代理等set方法, 使用可参见源码或者接口文档FAQ中说明
        ClientConfig clientConfig = new ClientConfig(new Region(regionName));

        // 3 生成cos客户端

        return new COSClient(cred, clientConfig);
    }


    /**
     * 图片上传 云对象存储
     * MultipartFile
     *
     * @return
     */
    public static String upload(MultipartFile multipartFile) {

        // 简单文件上传, 最大支持 5 GB, 适用于小文件上传, 建议 20M以下的文件使用该接口
        // 大文件上传请参照 API 文档高级 API 上传
        //String etag = null;

        COSClient cosClient = getCosClient();


        File localFile = MultipartFileToFile.multipartFileToFile(multipartFile);


        String fileName = localFile.getName();

        String key = "image/" + fileName;

        try {


            //发送上传请求
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, localFile);

            //获得返回结果
            PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);

            String eTag = putObjectResult.getETag();


        } catch (CosClientException e) {

            e.printStackTrace();

        } finally {

            //关闭客户端(关闭后台线程)
            FileUtil.del(localFile);
            cosClient.shutdown();
        }

        //获取图片上传成功的访问路径
        String imageUrl = ImageUrl(key);

        return imageUrl;

    }


    /**
     * 解析返回的
     *
     * @return
     */
    public static String ImageUrl(String key) {

        COSClient cosClient = getCosClient();

        // 获得链接后解析字符串并且返回
        URL oldurl = cosClient.generatePresignedUrl(bucketName, key, expiration);

        // 先将url转换为字符串
        String url = oldurl.toString();

        // 直接查找到第一个？的位置
        url = url.substring(0, url.indexOf("?"));

        // 开始解析字符串
        return url;

    }



//    /**
//     * 删除文件
//     *
//     * @param bucketName
//     * @param key
//     */
//    public static void deleteFile(String bucketName, String key) {
//        //COSClient cc = getCosClient();
//        try {
//            cc.deleteObject(bucketName, key);
//        } catch (CosClientException e) {
//            e.printStackTrace();
//        } finally {
//            cc.shutdown();
//        }
//
//    }
//
//
//    /**
//     * 创建桶
//     *
//     * @param bucketName
//     * @return
//     * @throws CosClientException
//     * @throws CosServiceException
//     */
//    public static Bucket createBucket(String bucketName) throws CosClientException, CosServiceException {
//        COSClient cc = getCosClient();
//        Bucket bucket = null;
//        try {
//            bucket = cc.createBucket(bucketName);
//        } catch (CosClientException e) {
//            e.printStackTrace();
//        } finally {
//        }
//        return bucket;
//    }
//
//    ;
//
//
//    /**
//     * 删除桶
//     *
//     * @param bucketName
//     * @throws CosClientException
//     * @throws CosServiceException
//     */
//    public void deleteBucket(String bucketName) throws CosClientException, CosServiceException {
//        COSClient cc = getCosClient();
//        try {
//            cc.deleteBucket(bucketName);
//        } catch (CosClientException e) {
//            e.printStackTrace();
//        } finally {
//        }
//    }
//
//    ;
//
//
//    /**
//     * 判断桶是否存在
//     *
//     * @param bucketName
//     * @return
//     * @throws CosClientException
//     * @throws CosServiceException
//     */
//    public static boolean doesBucketExist(String bucketName) throws CosClientException, CosServiceException {
//        COSClient cc = getCosClient();
//        boolean bucketExistFlag = cc.doesBucketExist(bucketName);
//        return bucketExistFlag;
//    }
//
//    ;
//
//
//    /**
//     * 查看桶文件
//     *
//     * @param bucketName
//     * @return
//     * @throws CosClientException
//     * @throws CosServiceException
//     */
//    public static ObjectListing listObjects(String bucketName) throws CosClientException, CosServiceException {
//        COSClient cc = getCosClient();
//
//        // 获取 bucket 下成员（设置 delimiter）
//        ListObjectsRequest listObjectsRequest = new ListObjectsRequest();
//        listObjectsRequest.setBucketName(bucketName);
//        // 设置 list 的 prefix, 表示 list 出来的文件 key 都是以这个 prefix 开始
//        listObjectsRequest.setPrefix("");
//        // 设置 delimiter 为/, 即获取的是直接成员，不包含目录下的递归子成员
//        listObjectsRequest.setDelimiter("/");
//        // 设置 marker, (marker 由上一次 list 获取到, 或者第一次 list marker 为空)
//        listObjectsRequest.setMarker("");
//        // 设置最多 list 100 个成员,（如果不设置, 默认为 1000 个，最大允许一次 list 1000 个 key）
//        listObjectsRequest.setMaxKeys(100);
//
//        ObjectListing objectListing = cc.listObjects(listObjectsRequest);
//        // 获取下次 list 的 marker
//        String nextMarker = objectListing.getNextMarker();
//        // 判断是否已经 list 完, 如果 list 结束, 则 isTruncated 为 false, 否则为 true
//        boolean isTruncated = objectListing.isTruncated();
//        List<COSObjectSummary> objectSummaries = objectListing.getObjectSummaries();
//        for (COSObjectSummary cosObjectSummary : objectSummaries) {
//            // get file path
//            String key = cosObjectSummary.getKey();
//            // get file length
//            long fileSize = cosObjectSummary.getSize();
//            // get file etag
//            String eTag = cosObjectSummary.getETag();
//            // get last modify time
//            Date lastModified = cosObjectSummary.getLastModified();
//            // get file save type
//            String StorageClassStr = cosObjectSummary.getStorageClass();
//        }
//        return objectListing;
//    }
//
//    /**
//     * 查询一个 Bucket 所在的 Region。
//     *
//     * @param bucketName
//     * @return
//     * @throws CosClientException
//     * @throws CosServiceException
//     */
//    public static String getBucketLocation(String bucketName) throws CosClientException, CosServiceException {
//        COSClient cosClient = getCosClient();
//        // bucket 的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
//        String location = cosClient.getBucketLocation(bucketName);
//        return location;
//    }


}
