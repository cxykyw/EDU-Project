package com.kyw.eduproject.service;

import com.kyw.eduproject.domain.Video;
import com.kyw.eduproject.service.impl.VideoServiceImpl;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Classname VideoService
 * @Description 视频接口
 * @Date 2020/4/19 19:36
 * @Created by kyw
 */
public interface VideoService {
    List<Video> findAll();

    Video findById(int id);

    int updateById(Video video);

    int deleteById(int id);

    int save(Video video);
}
