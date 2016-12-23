package com.jia.gtoast.widget;

import android.widget.Toast;

import com.jia.gtoast.MApplication;


/**
 * Created by wu on 2016/12/23.
 * 提示框,可以避免连续点击连续的出现情况。
 * 使用的还是系统的提示toast
 */
public class GToast {
    /** Data */
    private String mTempStr = "";
    private Toast toast = null;
    public static GToast i;

    /*********************************/
    public static GToast getInsance(){
        if(i == null)
            i = new GToast();
        return i;
    }

    private GToast(){}

    public void show(String text){
        if(toast == null){
            mTempStr = text;
            toast = Toast.makeText(MApplication.gContext, text, Toast.LENGTH_SHORT);
        }else{
            if(mTempStr.equals(text)){
                mTempStr = "";
                return ;
            }
            toast.cancel();
            toast = Toast.makeText(MApplication.gContext, text, Toast.LENGTH_SHORT);
            mTempStr = text;
        }
        toast.show();
    }
}
