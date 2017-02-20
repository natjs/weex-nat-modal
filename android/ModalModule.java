package com.nat.weex;

import android.app.Activity;

import com.nat.modal.HLModalModule;
import com.nat.modal.HLModuleResultListener;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

import java.util.HashMap;

/**
 * Created by Daniel on 17/2/17.
 * Copyright (c) 2017 Nat. All rights reserved.
 */

public class ModalModule extends WXModule {

    @JSMethod
    public void alert(HashMap<String, String> hashMap, final JSCallback jsCallback){
        HLModalModule.getInstance().alert((Activity) mWXSDKInstance.getContext(), hashMap, new HLModuleResultListener() {
            @Override
            public void onResult(Object o) {
                jsCallback.invoke(o);
            }
        });
    }

    @JSMethod
    public void confirm(HashMap<String, String> hashMap, final JSCallback jsCallback){
        HLModalModule.getInstance().confirm((Activity) mWXSDKInstance.getContext(), hashMap, new HLModuleResultListener() {
            @Override
            public void onResult(Object o) {
                jsCallback.invoke(o);
            }
        });
    }

    @JSMethod
    public void prompt(HashMap<String, String> hashMap, final JSCallback jsCallback){
        HLModalModule.getInstance().prompt((Activity) mWXSDKInstance.getContext(), hashMap, new HLModuleResultListener() {
            @Override
            public void onResult(Object o) {
                jsCallback.invoke(o);
            }
        });
    }

    @JSMethod
    public void toast(HashMap<String, String> hashMap, final JSCallback jsCallback){
        HLModalModule.getInstance().toast((Activity) mWXSDKInstance.getContext(), hashMap, new HLModuleResultListener() {
            @Override
            public void onResult(Object o) {
                jsCallback.invoke(o);
            }
        });
    }
}
