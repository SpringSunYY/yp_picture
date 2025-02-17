package com.lz.picture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lz.picture.model.dto.spaceusesr.SpaceUserAddRequest;
import com.lz.picture.model.dto.spaceusesr.SpaceUserQueryRequest;
import com.lz.picture.model.entity.SpaceUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lz.picture.model.vo.spaceuser.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author YY
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-02-17 19:45:05
*/
public interface SpaceUserService extends IService<SpaceUser> {

    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    void validSpaceUser(SpaceUser spaceUser, boolean add);

    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
}
