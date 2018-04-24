package com.chasen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chasen on 18-4-24.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
