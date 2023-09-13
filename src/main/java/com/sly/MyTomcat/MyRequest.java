package com.sly.MyTomcat;


import java.io.IOException;
import java.io.InputStream;

public class MyRequest {

    //请求方法 GET/POST
    private String requestMethod;
    //请求地址
    private String requestUrl;

    public MyRequest (InputStream inputStream) throws Exception {
        //定义缓冲区
        byte[] buffer = new byte[1024];
        //读取数据长度
        int len = 0;
        //定义请求变量
        String str = null;

        if((len = inputStream.read(buffer)) > 0){
            str = new String(buffer, 0,len);
        }
        //GET/HTTP/1.1 请求行 请求头 空格 请求体
        String data = str.split("\n")[0]; //只需要请求行中的内容
        String[] params = data.split(" ");
        this.requestMethod = params[0];
        this.requestUrl = params[1];

    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }
}
