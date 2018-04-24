package com.chasen.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chasen on 18-4-24.
 *
 * 县 实体类
 */

public class County extends DataSupport {
    // 县id
    private int id;
    // 县名
    private String countyName;
    // 天气id
    private String weatherId;
    // 当前县所属市的id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
