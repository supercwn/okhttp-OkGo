package com.lzy.okrx.adapter;

import com.lzy.okgo.adapter.AdapterParam;
import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.adapter.CallAdapter;
import com.lzy.okgo.model.Response;

import rx.Observable;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧）Github地址：https://github.com/jeasonlzy
 * 版    本：1.0
 * 创建日期：2017/5/26
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class ObservableHttp<T> implements CallAdapter<T, Observable<Response<T>>> {
    @Override
    public Observable<Response<T>> adapt(Call<T> call, AdapterParam param) {
        Observable.OnSubscribe<Response<T>> subscribe = AnalysisParams.analysis(call, param);
        return Observable.create(subscribe);
    }
}
