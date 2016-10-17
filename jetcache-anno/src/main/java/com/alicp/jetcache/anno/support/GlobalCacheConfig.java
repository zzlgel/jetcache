/**
 * Created on  13-09-09 17:29
 */
package com.alicp.jetcache.anno.support;

import com.alicp.jetcache.anno.impl.CacheInvokeContext;
import com.alicp.jetcache.factory.CacheFactory;
import com.alicp.jetcache.CacheManager;

import java.util.Map;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class GlobalCacheConfig {

    private String[] hidePackages;
    private Map<String, CacheFactory> cacheFactories;
    private CacheManager cacheManager = CacheManager.defaultInstance();

    public GlobalCacheConfig() {
    }

    public CacheInvokeContext createCacheInvokeContext() {
        CacheInvokeContext c = new CacheInvokeContext();
        c.setCacheFunction((cacheName) -> getCacheManager().getCache(cacheName));
        return c;
    }

    public String[] getHidePackages() {
        return hidePackages;
    }

    public void setHidePackages(String[] hidePackages) {
        this.hidePackages = hidePackages;
    }

    public Map<String, CacheFactory> getCacheFactories() {
        return cacheFactories;
    }

    public void setCacheFactories(Map<String, CacheFactory> cacheFactories) {
        this.cacheFactories = cacheFactories;
    }

    public CacheManager getCacheManager() {
        return cacheManager;
    }

    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }
}