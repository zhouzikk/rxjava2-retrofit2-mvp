package com.hicoo.hicoo_agent.http;

import com.hicoo.hicoo_agent.util.LogUtils;
import com.hicoo.hicoo_agent.util.ToastUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by ZhouZi on 2018/8/30.
 * time:16:58
 * ----------Dragon be here!----------/
 * 　　　┏┓　　 ┏┓
 * 　　┏┛┻━━━┛┻┓━━━
 * 　　┃　　　　　 ┃
 * 　　┃　　　━　  ┃
 * 　　┃　┳┛　┗┳
 * 　　┃　　　　　 ┃
 * 　　┃　　　┻　  ┃
 * 　　┃　　　　   ┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛━━━━━
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━━━━━━神兽出没━━━━━━━━━━━━━━
 */

public abstract class DefaultObserver<T> implements Observer<BaseBean<T>> {
    @Override
    public void onSubscribe(Disposable d) {
        onStart(d);
    }

    @Override
    public void onNext(BaseBean<T> tBaseBean) {
        onEnd();
        if (tBaseBean.isSuccess()) {
            if (tBaseBean.getResult() != null)
                onSuccess(tBaseBean.getResult());
            else {
                onSuccess(null);
            }
        } else {
            onCodeError(tBaseBean.getErrorCode(), tBaseBean.getErrorMsg());
        }
    }

    @Override
    public void onError(Throwable e) {
        onEnd();
        LogUtils.e("NetApi", e.getMessage());
        e.printStackTrace();
        ToastUtils.showText("服务器连接超时，请稍后再试");
    }

    @Override
    public void onComplete() {

    }

    /**
     * 请求开始
     */
    protected abstract void onStart(Disposable d);

    /**
     * 请求结束
     */
    protected abstract void onEnd();

    /**
     * 请求成功 code正确
     *
     * @param t
     */
    protected abstract void onSuccess(T t);

    /**
     * 请求成功 code错误
     *
     * @param msg  错误信息
     * @param code 错误code
     */
    protected abstract void onCodeError(int code, String msg);


}
