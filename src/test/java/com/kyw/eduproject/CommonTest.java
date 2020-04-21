package com.kyw.eduproject;

import com.kyw.eduproject.domain.User;
import com.kyw.eduproject.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/4/21 21:32
 * @Created by kyw
 */
public class CommonTest {


    @Test
    public void testJWT(){


        User user = new User();
        user.setId(899);
        user.setName("kyw");
        user.setHeadImg("www.kyw.com");

        String token = JwtUtils.geneJsonWebToken(user);
        System.out.println(token);
    }

    @Test
    public void testCheck(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJreXciLCJpZCI6ODk5LCJuYW1lIjoia3l3IiwiaW1nIjoid3d3Lmt5dy5jb20iLCJleHAiOjE1ODgwODEwNTUsImlhdCI6MTU4NzQ3NjI1NX0.FEcFUlOynoM5j0P3m_kojERHDqRIeZdDVgnXBBQlTzw";
        Claims claims = JwtUtils.checkJwt(token);
        if(claims != null){
            int id = (Integer) claims.get("id");
            String name = (String) claims.get("name");
            String img = (String) claims.get("img");
            System.out.println(id);
            System.out.println(name);
            System.out.println(img);

        }else{
            System.out.println("非法token");
        }


    }

}
