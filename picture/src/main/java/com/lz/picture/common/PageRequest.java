package com.lz.picture.common;

import lombok.Data;

/**
 * Project: picture
 * Package: com.lz.picture.common
 * Author: YY
 * CreateTime: 2025-02-01  16:31
 * Description: PageRequest
 * Version: 1.0
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}
