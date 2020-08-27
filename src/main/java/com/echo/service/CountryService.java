package com.echo.service;

import com.echo.domain.Country;

import java.util.List;

public interface CountryService {
    /**
     * 查询所有国家信息
     * @return
     */
    public List<Country> findAll();
}
