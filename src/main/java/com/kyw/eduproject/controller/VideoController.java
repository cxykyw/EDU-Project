package com.kyw.eduproject.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kyw.eduproject.domain.Video;
import com.kyw.eduproject.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 分页接口
     * @param page 当前第几页 默认第一页
     * @param size 每页显示条数 默认10条
     * @return
     */
    @GetMapping("page")
    public Object pageVideo(@RequestParam(value = "page",defaultValue = "1")int page,
                            @RequestParam(value = "size",defaultValue = "10")int size){
        PageHelper.startPage(page,size);
        List<Video> videoList = videoService.findAll();

        PageInfo<Video> pageInfo = new PageInfo<>(videoList);

        Map<String,Object> retMap = new HashMap<>();
        //总条数
        retMap.put("total_size",pageInfo.getTotal());
        //总页数
        retMap.put("total_page",pageInfo.getPages());
        //当前页
        retMap.put("current_page",page);
        //数据
        retMap.put("data",pageInfo.getList());
        return retMap;
    }

    /**
     * 根据id查找视频
     * @param videoId
     * @return
     */
    @GetMapping("findById")
    public Object findById(@RequestParam(value = "video_id",required = true) int videoId){
        return videoService.findById(videoId);
    }
}
