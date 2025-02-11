package com.lz.picture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lz.picture.model.dto.space.SpaceAddRequest;
import com.lz.picture.model.dto.space.SpaceQueryRequest;
import com.lz.picture.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lz.picture.model.entity.User;
import com.lz.picture.model.vo.space.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author YY
 * @description 针对表【space(空间)】的数据库操作Service
 * @createDate 2025-02-12 00:42:48
 */
public interface SpaceService extends IService<Space> {

    /**
     * description: 创建空间
     * author: YY
     * method: addSpace
     * date: 2025/2/12 01:02
     * param:
     * param: spaceAddRequest
     * param: loginUser
     * return: long
     **/
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * description:  校验
     * author: YY
     * method: validSpace
     * date: 2025/2/12 00:49
     * param:
     * param: space
     * param: add
     * return: void
     **/
    void validSpace(Space space, boolean add);

    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    void fillSpaceBySpaceLevel(Space space);

    void checkSpaceAuth(User loginUser, Space space);
}
