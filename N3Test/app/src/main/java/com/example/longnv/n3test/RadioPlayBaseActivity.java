package com.example.longnv.n3test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.longnv.n3test.Base.radiobase.BaseActivity;
import com.example.longnv.n3test.Base.radiobase.BaseActivityMenuCar;
import com.example.longnv.n3test.Base.radiobase.ICallbackFragment;

import java.util.List;



/**
 * Created by SonNM6 on 2/22/2017.
 */

public class RadioPlayBaseActivity extends BaseActivity<AppRadioBasePresenter> implements ICallbackFragment, View.OnClickListener, IListenerUpdateUI {

    private RelativeLayout mContainer;
    private static final String TAG = "RadioPlayBaseActivity";



    @Override
    protected int setViewLayout() {
        return R.layout.activity_test;
    }

    @SuppressLint("ResourceType")
    @Override
    protected void onSetupLayout() {

        mContainer = (RelativeLayout) findViewById(R.id.full_container);
    }

    @Override
    protected AppRadioBasePresenter setPresenter() {
        return new AppRadioBasePresenter(getBaseContext());
    }


    @Override
    public void onClick(View v) {
        //
    }

    @Override
    public void onCallBackPresenter(String key, Object data) {
        //
    }


    @Override
    public void onCallBackFragment(String key, Object data) {
        switch (key) {


        }
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult: ");

    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void upDateUI() {

    }
}
