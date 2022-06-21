package com.lppage.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后台照片
 *
 * @author liangpeng
 * @date 2022/03/05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhotoBackDTO {

    /**
     * 照片id
     */
    private Integer id;

    /**
     * 照片名
     */
    private String photoName;

    /**
     * 照片描述
     */
    private String photoDesc;

    /**
     * 照片地址
     */
    private String photoSrc;

}
