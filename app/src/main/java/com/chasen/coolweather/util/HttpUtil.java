package com.chasen.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by chasen on 18-4-24.
 *
 * 网络工具类
 */

public class HttpUtil {

    public static void sendOkHeepRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
