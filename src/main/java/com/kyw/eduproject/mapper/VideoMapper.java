package com.kyw.eduproject.mapper;

import com.kyw.eduproject.domain.Video;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Classname VideoMapper
 * @Description 视频数据访问层
 * @Date 2020/4/19 20:42
 * @Created by kyw
 */
public interface VideoMapper {

    @Select("select * from video")
    /**@Results({
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "cover_img",property = "coverImg")
    })*/
    List<Video> findAll();

    @Select("select * from video where id = #{id}")
    Video findById(int id);

    @Update("update video set title = #{title} where id = #{id}")
    int updateById(Video video);

    @Delete("delete from video where id = #{id}")
    int deleteById(int id);


}
