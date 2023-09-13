package com.sly.MyTomcat;

public class MyServlet extends MyHttpServlet{
    public void doGet(MyRequest request, MyResponse response) throws Exception {
        response.write("mytomcat");
    }

    public void doPost(MyRequest request, MyResponse response) throws Exception {
        response.write("mytomcat");
    }
}
