package com.hicoo.hicoo_agent.mvp.presenter;

import android.app.Activity;

import com.hicoo.hicoo_agent.mvp.base.BasePresenter;
import com.hicoo.hicoo_agent.mvp.contract.IMainActivityContract;
import com.hicoo.hicoo_agent.mvp.model.MainActivityModel;

/**
 * Created by ZhouZi on 2018/8/30.
 * time:17:42
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
public class MainActivityPresenter extends BasePresenter<IMainActivityContract.V,MainActivityModel> {
    public MainActivityPresenter(Activity mActivity, IMainActivityContract.V v) {
        super(mActivity, v);
        m=new MainActivityModel();
    }
}
