package me.zouooh.slark.biuld;

import android.content.Context;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import me.zouooh.slark.task.QueueAspect;
import me.zouooh.slark.task.CacheworkFactory;
import me.zouooh.slark.task.NetworkFactory;
import me.zouooh.slark.task.RequestAspectFactory;
import me.zouooh.slark.task.TaskFactory;
import me.zouooh.slark.task.impl.SlarkCacheworkFactory;
import me.zouooh.slark.task.impl.SlarkNetworkFactory;
import me.zouooh.slark.task.impl.SlarkTaskFactory;

/**
 * Created by zouooh on 2016/7/26.
 */
public class SlarkClientImpl implements SlarkClient{

    private Context context;

    public SlarkClientImpl(Context context){
        this.context = context;
    }

    @Override
    public NetworkFactory networkFactory() {
        return new SlarkNetworkFactory();
    }

    @Override
    public CacheworkFactory cacheworkFactory() {
        return new SlarkCacheworkFactory();
    }

    @Override
    public TaskFactory taskFactory() {
        return new SlarkTaskFactory();
    }

    @Override
    public ExecutorService executorService() {
        return Executors.newFixedThreadPool(3);
    }

    @Override
    public QueueAspect aspect() {
        return null;
    }
    @Override
    public RequestAspectFactory requestAspectFactory() {
        return null;
    }
}
