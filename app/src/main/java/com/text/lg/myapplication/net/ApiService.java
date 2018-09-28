package com.text.lg.myapplication.net;



import com.youth.banner.Banner;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by lw on 2018/1/23.
 *
 * 公共接口管理页面 get post 实例
 */

public interface ApiService {
    /**
     * 首页数据
     * http://www.wanandroid.com/article/list/0/json
     *
     * @param page page
     */
   /* @GET("/article/list/{page}/json")
    Observable<DataResponse<Article>> getHomeArticles(@Path("page") int page);*/

    /**
    /**
     * 登录
     *
     * @param username username
     * @param password password
     * @return Deferred<User>
     */
   /* @POST("/user/login")
    @FormUrlEncoded
    Observable<DataResponse<User>> login(@Field("username") String username, @Field("password") String password);*/

}
