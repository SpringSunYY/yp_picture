package com.lz.picture.model.vo.picture;

import lombok.Data;

import java.util.List;

/**
 * Project: picture
 * Package: com.lz.picture.model.vo.picture
 * Author: YY
 * CreateTime: 2025-02-05  20:48
 * Description: PictureTagCategory
 * Version: 1.0
 */
@Data
public class PictureTagCategory {
    private List<String> tagList;
    private List<String> categoryList;
}
