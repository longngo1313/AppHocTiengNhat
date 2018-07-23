package com.example.longnv.n3test.Base.radiobase;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;


/**
 * You can add class presenter in this.
 *
 * @param <P> class Presenter implement in MVP architecture
 */
public abstract class BaseActivityMenuCar<P extends BasePresenter> extends AppCompatActivity implements IView, ICallBackPresenter {
    private static final String TAG = "BaseActivityMenuCar";
    protected P mPresenter;
    private ICallbackFragment mICallbackFragment;

    protected abstract int setViewLayout();

    protected abstract void onSetupLayout();


    @NonNull
    protected abstract P setPresenter();


    protected FragmentTransaction getFragmentTransactionMPV(BaseFragment callbackFragment) {
        try {
            callbackFragment.setICallBack((ICallbackFragment) this);
        } catch (Exception e) {
            RadioLog.error(TAG, e);
        }
        return getSupportFragmentManager().beginTransaction();
    }


    protected FragmentTransaction getFragmentTransactionMPV() {
        return getSupportFragmentManager().beginTransaction();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setViewLayout());
        try {
            mPresenter = setPresenter();
            mPresenter.setICallBackPresenter(this);
            onSetupLayout();
        } catch (Exception e) {
            RadioLog.error(TAG, e);
        }
    }

    @Override
    public BasePresenter getPresenter() {
        return mPresenter;
    }


}
