package com.kyw.eduproject.service.impl;

import com.kyw.eduproject.domain.Video;
import com.kyw.eduproject.mapper.VideoMapper;
import com.kyw.eduproject.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname VideoServiceImpl
 * @Description TODO
 * @Date 2020/4/19 19:36
 * @Created by kyw
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findAll() {
        return videoMapper.findAll();
    }

    @Override
    public Video findById(int id) {
        return videoMapper.findById(id);
    }

    @Override
    public int updateById(Video Video) {
      return   videoMapper.updateById(Video);
    }

    @Override
    public int deleteById(int id) {
       return videoMapper.deleteById(id);
    }

    @Override
    public int save(Video video) {
        int rows = videoMapper.save(video);
        System.out.println("id="+video.getId());
        return rows;
    }
}
