package com.jia.gtoast;

import android.app.Application;
import android.content.Context;

import com.jia.gtoast.widget.GToast;

/**
 * Created by wu on 2016/12/23.
 */
public class MApplication extends Application {
    /** Data */
    public static Context gContext;
    /******************************/
    @Override
    public void onCreate() {
        super.onCreate();
        initGlobaleVar();
    }

    //初始化全局变量(应用生命周期中都需要持有的对象)
    private void initGlobaleVar(){
        gContext = this;

        GToast.getInsance();   //提示
    }
}
