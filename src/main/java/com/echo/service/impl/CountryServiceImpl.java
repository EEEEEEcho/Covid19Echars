package com.echo.service.impl;

import com.echo.dao.CountryDao;
import com.echo.domain.Country;
import com.echo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("CountryService")
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao countryDao;

    @Override
    public List<Country> findAll() {
        return countryDao.findAll();
    }
}
