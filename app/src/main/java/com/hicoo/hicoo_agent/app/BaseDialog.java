package com.hicoo.hicoo_agent.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

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

public abstract class BaseDialog<T> extends Dialog {

    protected OnDialogEnterClickListener<T> onDialogEnterClickListener;
    protected OnDialogCancleClickListener onDialogCancleClickListener;

    public BaseDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    public BaseDialog(@NonNull Context context, int themeResId,
                      OnDialogEnterClickListener<T> onDialogEnterClickListener) {
        super(context, themeResId);
        this.onDialogEnterClickListener = onDialogEnterClickListener;
    }

    public BaseDialog(@NonNull Context context, int themeResId,
                      OnDialogEnterClickListener onDialogEnterClickListener,
                      OnDialogCancleClickListener onDialogCancleClickListener) {
        super(context, themeResId);
        this.onDialogEnterClickListener = onDialogEnterClickListener;
        this.onDialogCancleClickListener = onDialogCancleClickListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    public interface OnDialogEnterClickListener<T> {
        void onEnterClick(T... t);
    }

    public interface OnDialogCancleClickListener {
        void onCancleClick();
    }

}
