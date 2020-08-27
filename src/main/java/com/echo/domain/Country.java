package com.echo.domain;

import java.io.Serializable;

public class Country implements Serializable {
    private Integer id;
    private String name;
    private Integer todayConfirm;
    private Integer todaySuspect;
    private Integer todayHeal;
    private Integer todayDead;
    private Integer totalConfirm;
    private Integer totalSuspect;
    private Integer totalHeal;
    private Integer totalDead;
    private Integer nowConfirm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTodayConfirm() {
        return todayConfirm;
    }

    public void setTodayConfirm(Integer todayConfirm) {
        this.todayConfirm = todayConfirm;
    }

    public Integer getTodaySuspect() {
        return todaySuspect;
    }

    public void setTodaySuspect(Integer todaySuspect) {
        this.todaySuspect = todaySuspect;
    }

    public Integer getTodayHeal() {
        return todayHeal;
    }

    public void setTodayHeal(Integer todayHeal) {
        this.todayHeal = todayHeal;
    }

    public Integer getTodayDead() {
        return todayDead;
    }

    public void setTodayDead(Integer todayDead) {
        this.todayDead = todayDead;
    }

    public Integer getTotalConfirm() {
        return totalConfirm;
    }

    public void setTotalConfirm(Integer totalConfirm) {
        this.totalConfirm = totalConfirm;
    }

    public Integer getTotalSuspect() {
        return totalSuspect;
    }

    public void setTotalSuspect(Integer totalSuspect) {
        this.totalSuspect = totalSuspect;
    }

    public Integer getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(Integer totalHeal) {
        this.totalHeal = totalHeal;
    }

    public Integer getTotalDead() {
        return totalDead;
    }

    public void setTotalDead(Integer totalDead) {
        this.totalDead = totalDead;
    }

    public Integer getNowConfirm() {
        return nowConfirm;
    }

    public void setNowConfirm(Integer nowConfirm) {
        this.nowConfirm = nowConfirm;
    }
}
