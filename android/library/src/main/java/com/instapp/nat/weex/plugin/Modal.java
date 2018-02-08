package com.instapp.nat.weex.plugin.Modal;

import com.alibaba.weex.plugin.annotation.WeexModule;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

import android.app.Activity;
import java.util.HashMap;

import com.instapp.nat.modal.ModalModule;
import com.instapp.nat.modal.ModuleResultListener;

@WeexModule(name = "nat/modal")
public class Modal extends WXModule {

    @JSMethod
    public void alert(HashMap<String, String> hashMap, final JSCallback callback){
        ModalModule.getInstance().alert((Activity) mWXSDKInstance.getContext(), hashMap, new ModuleResultListener() {
            @Override
            public void onResult(Object o) {
                callback.invoke(o);
            }
        });
    }

    @JSMethod
    public void confirm(HashMap<String, String> hashMap, final JSCallback callback){
        ModalModule.getInstance().confirm((Activity) mWXSDKInstance.getContext(), hashMap, new ModuleResultListener() {
            @Override
            public void onResult(Object o) {
                callback.invoke(o);
            }
        });
    }

    @JSMethod
    public void prompt(HashMap<String, String> hashMap, final JSCallback callback){
        ModalModule.getInstance().prompt((Activity) mWXSDKInstance.getContext(), hashMap, new ModuleResultListener() {
            @Override
            public void onResult(Object o) {
                callback.invoke(o);
            }
        });
    }

    @JSMethod
    public void toast(HashMap<String, String> hashMap, final JSCallback callback){
        ModalModule.getInstance().toast((Activity) mWXSDKInstance.getContext(), hashMap, new ModuleResultListener() {
            @Override
            public void onResult(Object o) {
                callback.invoke(o);
            }
        });
    }

    @JSMethod
    public void showActionSheet(HashMap<String, Object> hashMap, final JSCallback callback){
        ModalModule.getInstance().showActionSheet((Activity) mWXSDKInstance.getContext(), hashMap, new ModuleResultListener() {
            @Override
            public void onResult(Object o) {
                callback.invoke(o);
            }
        });
    }
}