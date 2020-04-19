package com.kyw.eduproject.controller;

import com.kyw.eduproject.domain.Video;
import com.kyw.eduproject.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname VideoController
 * @Description TODO
 * @Date 2020/4/19 14:17
 * @Created by kyw
 */

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("page")
    public Object pageVideo(){

        return videoService.findAll();
    }

    @GetMapping("findById")
    public Object findById(int videoId){
        return videoService.findById(videoId);
    }

    @DeleteMapping("delById")
    public Object delById(int videoId){
        return videoService.deleteById(videoId);
    }


    @PutMapping("updateById")
    public Object findById(int videoId,String title){
        Video video = new Video();
        video.setId(videoId);
        video.setTitle(title);
        return videoService.updateById(video);
    }
}
