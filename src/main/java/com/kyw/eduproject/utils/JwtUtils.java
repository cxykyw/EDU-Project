package com.kyw.eduproject.utils;

import com.kyw.eduproject.domain.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @Classname JwtUtils
 * @Description JWT工具类
 * @Date 2020/4/21 21:04
 * @Created by kyw
 */
public class JwtUtils {


    public static final String SUBJECT = "kyw";
    //过期时间ms，一周
    public static final long EXPIRE = 1000*60*60*24*7;

    //秘钥
    public static final String APPSECRET = "kyw666";

    /**
     * 生成jwt
     * @param user
     * @return
     */
    public static String geneJsonWebToken(User user){

        if(user == null || user.getId() == null || user.getName() ==null || user.getHeadImg() == null){
            return null;
        }

       String token = Jwts.builder().setSubject(SUBJECT)
                .claim("id",user.getId())
                .claim("name",user.getName())
                .claim("img",user.getHeadImg())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256,APPSECRET).compact();

        return token;
    }


    /**
     * 校验token
     * @param token
     * @return
     */
    public static Claims checkJwt(String token){
        try{
            final Claims claims = Jwts.parser().setSigningKey(APPSECRET).parseClaimsJws(token).getBody();
            return claims;
        }catch (Exception e){

        }
        return null;

    }





}
