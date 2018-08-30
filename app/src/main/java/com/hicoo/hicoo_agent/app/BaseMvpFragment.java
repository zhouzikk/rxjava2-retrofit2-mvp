package com.hicoo.hicoo_agent.app;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hicoo.hicoo_agent.mvp.base.BasePresenter;

/**
 * Created by ZhouZi on 2018/8/30.
 * time:17:47
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
public abstract class BaseMvpFragment<P extends BasePresenter> extends BaseFragment {

    protected P p;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initPresenter();
        p.attachView();
    }

    protected abstract void initPresenter();

    @Override
    public void onDestroyView() {
        if (p != null) {
            p.detachView();
            p = null;
        }
        super.onDestroyView();
    }
}
