package me.zouooh.slark.task;

import android.content.Context;

/**
 * Created by zouooh on 2016/7/26.
 */
public interface ContextHolder {
    Object holder();
    Context context();
    boolean canDispatch();
    void release();
}
