package com.lz.picture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lz.picture.model.dto.picture.*;
import com.lz.picture.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lz.picture.model.entity.User;
import com.lz.picture.model.vo.picture.PictureVO;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author YY
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2025-02-05 18:06:24
 */
public interface PictureService extends IService<Picture> {

    PictureVO uploadPicture(Object inputSource, PictureUploadRequest pictureUploadRequest, User loginUser);

    /**
     * description: 根据颜色搜索图片
     * author: YY
     * method: searchPictureByColor
     * date: 2025/2/15 23:52
     * param:
     * param: spaceId
     * param: picColor
     * param: loginUser
     * return: java.util.List<com.lz.picture.model.vo.picture.PictureVO>
     **/
    List<PictureVO> searchPictureByColor(Long spaceId, String picColor, User loginUser);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    void validPicture(Picture picture);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    public Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

    @Async
    void clearPictureFile(Picture oldPicture);

    void checkPictureAuth(User loginUser, Picture picture);

    void deletePicture(long pictureId, User loginUser);

    void editPicture(PictureEditRequest pictureEditRequest, User loginUser);

    /**
     * description: 批量修改图片
     * author: YY
     * method: editPictureByBatch
     * date: 2025/2/16 16:57
     * param:
     * param: pictureEditByBatchRequest
     * param: loginUser
     * return: void
     **/
    @Transactional(rollbackFor = Exception.class)
    void editPictureByBatch(PictureEditByBatchRequest pictureEditByBatchRequest, User loginUser);
}
