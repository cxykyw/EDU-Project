package com.kyw.eduproject.provider;

import com.kyw.eduproject.domain.Video;
import org.apache.ibatis.jdbc.SQL;

/**
 * video构建动态sql语句
 * @author : kangyw
 * @date : 下午 16:01 2020/4/21
 */
public class VideoProvider {

    /**
     * 更新video动态语句
     * @param video
     * @return
     */
    public String updateVideo(final Video video){
        return new SQL(){{
            UPDATE("video");

            //条件写法
            if(video.getTitle()!=null){
                SET("title=#{title}");
            }
            if(video.getSummary()!=null){
                SET("summary=#{summary}");
            }
            if(video.getCoverImg()!=null){
                SET("coverImg=#{coverImg}");
            }
            if(video.getViewNum()!=null){
                SET("viewNum=#{viewNum}");
            }
            if(video.getPrice()!=null){
                SET("price=#{price}");
            }
            if(video.getOnline()!=null){
                SET("online=#{online}");
            }
            if(video.getPoint()!=null){
                SET("point=#{point}");
            }

            WHERE("id=#{id}");
        }}.toString();
    }
}
