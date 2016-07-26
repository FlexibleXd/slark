package me.zouooh.slark.task;

import me.zouooh.slark.cache.Cachework;
import me.zouooh.slark.http.Network;
import me.zouooh.slark.request.Request;

/**
 * Created by zouooh on 2016/7/26.
 */
public interface Queue {
    ContextHolder contexHolder();
    Request get(String path);
    Request post(String path);
    void fillRequest(Request request);
    void destory(Request request);
    void submitRequest(Request request);
    void executeRequest(Request request);
    void resume();
    void pause();
    void destroy();
}
