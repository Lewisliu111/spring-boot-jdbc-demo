package com.softeem.dao;

import com.softeem.bean.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 国外喜欢叫 Repository，取【仓库】的含义。
 * 国内喜欢叫 DAO（Data Access Object），数据访问对象。
 *
 * 项目中的 Repository/DAO 都应该是单例对象，
 * 而单例对象的创建、管理、维护工作，我们都是委托给 Spring 来负责。
 *
 * Spring boot 项目启动后，spring 发现该类的脑袋上面有 @Repository 注解，
 * 那么 Spring 就会自动创建这个类的单例对象，有需要的话，还会为该对象的属性赋值。
 */
@Repository
public class MovieRepository {

    @Autowired  // 让 Spring 在它的【容器】中，找到一个 JdbcTemplate 类型的单例对象，为本属性赋值。
    private JdbcTemplate template;

    public Movie selectByPrimaryKey(String id) {
        List<Movie> list = template.query("select * from movie where id = ?",
                new BeanPropertyRowMapper<>(Movie.class),   // 代表一种映射规则：以列名和属性名为依据。
                                                            // 查询结果集中的 xxx 列的数据，为 Movie 对象的 xxx 属性赋值。
                id);

        return list.get(0);
    }

    public Movie selectByPK(String id) {

        MovieRowMapper mapper = new MovieRowMapper();

        List<Movie> list = template.query("select * from mid_movie_performer ,performer where movie_id = ?",
                mapper,id);

        return list.get(0);
    }

    public List<String> selectMovieIdByDirector(String name) {
        MovieRowMapper mapper=new MovieRowMapper()
        List<String> movieids=null;
        List<Movie> list = template.query("select * from mid_movie_performer, performer when name = ? and " +
                       "performer.id = mid_m",
        mapper,
        name);


        return movieids;
    }
}



