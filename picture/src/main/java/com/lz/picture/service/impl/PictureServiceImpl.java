package com.lz.picture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lz.picture.model.entry.Picture;
import com.lz.picture.service.PictureService;
import com.lz.picture.mapper.PictureMapper;
import org.springframework.stereotype.Service;

/**
* @author YY
* @description 针对表【picture(图片)】的数据库操作Service实现
* @createDate 2025-02-05 18:06:24
*/
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture>
    implements PictureService{

}




