package com.lz.picture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lz.picture.model.dto.picture.PictureQueryRequest;
import com.lz.picture.model.dto.picture.PictureUploadRequest;
import com.lz.picture.model.entry.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lz.picture.model.entry.User;
import com.lz.picture.model.vo.picture.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author YY
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-02-05 18:06:24
*/
public interface PictureService extends IService<Picture> {
    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    void validPicture(Picture picture);
}
