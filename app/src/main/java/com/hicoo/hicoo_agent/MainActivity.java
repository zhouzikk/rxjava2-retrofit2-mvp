package com.hicoo.hicoo_agent;

import android.os.Bundle;
import android.widget.TextView;

import com.hicoo.hicoo_agent.app.BaseMvpActivity;
import com.hicoo.hicoo_agent.mvp.contract.IMainActivityContract;
import com.hicoo.hicoo_agent.mvp.presenter.MainActivityPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

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

public class MainActivity extends BaseMvpActivity<MainActivityPresenter> implements IMainActivityContract.V {


    @BindView(R.id.tv_title_conten)
    TextView tvTitleConten;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initPresenter() {
        p = new MainActivityPresenter(this, this);
    }

    @Override
    public void initView() {
        tvTitleConten.setText("首页");
    }
}
