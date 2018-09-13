package com.cienet.flyweight.impl;

import java.util.Hashtable;

/**
 * class: WebSiteFactory <br>
 *
 * @author: ZhaoShixiang <br>
 * @date: 2018/9/12 17:07
 */
public class WebSiteFactory {

    private Hashtable<String, WebSite> webSites = new Hashtable<>();

    public WebSite getWebSite(String key) {
        if (!webSites.contains(key)) {
            webSites.put(key, new ConcreteWebSite(key));
        }
        return webSites.get(key);
    }

    public int getWebSiteCount() {
        return webSites.size();
    }

}