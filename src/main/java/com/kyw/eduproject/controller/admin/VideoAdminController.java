package com.kyw.eduproject.controller.admin;

import com.kyw.eduproject.domain.Video;
import com.kyw.eduproject.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : kangyw
 * @date : 下午 15:57 2020/4/21
 */
@RestController
@RequestMapping("/admin/api/v1/video")
public class VideoAdminController {
    @Autowired
    private VideoService videoService;

    /**
     * 根据id删除视频
     * @param videoId
     * @return
     */
    @DeleteMapping("delById")
    public Object delById(@RequestParam(value = "video_id",required = true)int videoId){
        return videoService.deleteById(videoId);
    }

    /**
     * 根据id更新视频
     * @param video
     * @return
     */
    @PutMapping("updateById")
    public Object findById(@RequestBody Video video){
        return videoService.updateById(video);
    }

    /**
     * 保存视频
     * @param video
     * @return
     */
    @PostMapping("save")
    public Object saveVideo(@RequestBody Video video){
        return videoService.save(video);
    }
}
