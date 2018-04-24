package com.chasen.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chasen on 18-4-24.
 * 省 实体类
 */

public class Province extends DataSupport {
    // 省的id
    private int id;
    // 省名称
    private String provinceName;
    // 省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
