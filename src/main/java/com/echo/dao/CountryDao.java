package com.echo.dao;

import com.echo.domain.Country;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryDao {
    /**
     * 查询所有国家信息
     * @return
     */
    @Select("select id , name ,today_confirm as todayConfirm,today_suspect as todaySuspect," +
            "today_heal as todayHeal,today_dead as todayDead,total_confirm as totalConfirm," +
            "total_suspect as totalSuspect,total_heal as totalHeal,total_dead as totalDead," +
            "now_confirm as nowConfirm from countrys")
    public List<Country> findAll();
}
