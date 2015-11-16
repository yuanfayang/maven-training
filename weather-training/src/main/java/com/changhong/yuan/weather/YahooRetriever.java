package com.changhong.yuan.weather;

import org.apache.log4j.Logger;

import java.io.InputStream;
import java.net.*;

/**
 * Created by xixi on 2015/11/16.
 */
public class YahooRetriever {

    private static Logger log = Logger.getLogger(YahooRetriever.class);

    public InputStream retrieve(String zipcode) throws Exception{
        log.info("Retrieve Weather Data");
        String url = "http://weather.yahooapis.com/forecastrss?p=" + zipcode;
        //use this if you need to connect via a corporate proxy
        /*String proxyHost = "[proxy server]";
        int poxyPort = 0;//proxy server host
        SocketAddress address = new InetSocketAddress(proxyHost,poxyPort);
        Proxy httpProxy = new Proxy(Proxy.Type.HTTP,address);
        URLConnection urlConnection = new URL(url).openConnection(httpProxy);*/

        URLConnection urlConnection = new URL(url).openConnection();
        return urlConnection.getInputStream();
    }
}
