package com.lz.picture.service;

import com.lz.picture.model.dto.space.analyze.*;
import com.lz.picture.model.entity.Space;
import com.lz.picture.model.entity.User;
import com.lz.picture.model.vo.space.analyze.*;

import java.util.List;

public interface SpaceAnalyzeService {

    /**
     * description:  获取空间使用情况
     * author: YY
     * method: getSpaceUsageAnalyze
     * date: 2025/2/16 21:56
     * param:
     * param: spaceUsageAnalyzeRequest
     * param: loginUser
     * return: com.lz.picture.model.vo.space.analyze.SpaceUsageAnalyzeResponse
     **/
    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest, User loginUser);

    /**
     * description: 获取空间分类使用情况
     * author: YY
     * method: getSpaceCategoryAnalyze
     * date: 2025/2/16 22:06
     * param:
     * param: spaceCategoryAnalyzeRequest
     * param: loginUser
     * return: java.util.List<com.lz.picture.model.vo.space.analyze.SpaceCategoryAnalyzeResponse>
     **/
    List<SpaceCategoryAnalyzeResponse> getSpaceCategoryAnalyze(SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest, User loginUser);

    /**
     * description: 获取空间标签使用情况
     * author: YY
     * method: getSpaceTagAnalyze
     * date: 2025/2/16 22:11
     * param:
     * param: spaceTagAnalyzeRequest
     * param: loginUser
     * return: java.util.List<com.lz.picture.model.vo.space.analyze.SpaceTagAnalyzeResponse>
     **/
    List<SpaceTagAnalyzeResponse> getSpaceTagAnalyze(SpaceTagAnalyzeRequest spaceTagAnalyzeRequest, User loginUser);

    /**
     * description: 获取空间大小使用情况
     * author: YY
     * method: getSpaceSizeAnalyze
     * date: 2025/2/16 22:17
     * param:
     * param: spaceSizeAnalyzeRequest
     * param: loginUser
     * return: java.util.List<com.lz.picture.model.vo.space.analyze.SpaceSizeAnalyzeResponse>
     **/
    List<SpaceSizeAnalyzeResponse> getSpaceSizeAnalyze(SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest, User loginUser);

    /**
     * description: 获取空间用户使用情况
     * author: YY
     * method: getSpaceUserAnalyze
     * date: 2025/2/16 22:22
     * param:
     * param: spaceUserAnalyzeRequest
     * param: loginUser
     * return: java.util.List<com.lz.picture.model.vo.space.analyze.SpaceUserAnalyzeResponse>
     **/
    List<SpaceUserAnalyzeResponse> getSpaceUserAnalyze(SpaceUserAnalyzeRequest spaceUserAnalyzeRequest, User loginUser);

    /**
     * description: 获取空间排名
     * author: YY
     * method: getSpaceRankAnalyze
     * date: 2025/2/16 22:23
     * param:
     * param: spaceRankAnalyzeRequest
     * param: loginUser
     * return: java.util.List<com.lz.picture.model.entity.Space>
     **/
    List<Space> getSpaceRankAnalyze(SpaceRankAnalyzeRequest spaceRankAnalyzeRequest, User loginUser);
}
