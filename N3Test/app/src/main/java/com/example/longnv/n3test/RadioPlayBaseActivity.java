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
    private static final String TAG_FRAGMENT_LIST_PRESET_EDIT = "TAG_FRAGMENT_LIST_PRESET_EDIT";
    private static final String ANOTHER_APP_CALLS_SETTING = "android.lge.car.app.setting.ANOTHER_APP_CALLS_SETTING";
//    private RadioPlayBackBaseFragment mRadioPlayBackFragment;
    private String TAG_FRAGMENT_RADIO_PLAY = "TAG_FRAGMENT_RADIO_PLAY";
    private RelativeLayout mContainer;
    public PopupWindow mPopupWindow;
//    private RadioStorage mRadioStorage;
    private static final String TAG = "RadioPlayBaseActivity";
    public static final int REQUET_CODE_ACTIVITY_LIST_EDIT = 111;

    public static final String ACTION_RELOAD_LIST_PRESET = "ACTION_RELOAD_LIST_PRESET";

    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (intent.getAction()) {
                case ACTION_RELOAD_LIST_PRESET:
                    break;
                default:
                    break;
            }
        }
    };



    @Override
    protected int setViewLayout() {
        return R.layout.activity_test;
    }

    @SuppressLint("ResourceType")
    @Override
    protected void onSetupLayout() {
//        mRadioStorage = RadioStorage.newInstance(getContext());
//        RadioDataDemo.sListPresetFM = RadioStorage.newInstance(getContext()).getListPresetFM();
//        RadioDataDemo.sListPresetAM = RadioStorage.newInstance(getContext()).getListPresetAM();
//        RadioDataDemo.sListStationFM = RadioStorage.newInstance(getContext()).getListStationFM();
//        RadioDataDemo.sListStationAM = RadioStorage.newInstance(getContext()).getListStationtAM();

        getBaseContext().registerReceiver(broadcastReceiver, new IntentFilter(ACTION_RELOAD_LIST_PRESET));
        // set title menu
//        if (mRadioStorage.getStateRadioApp() == AppConfig.BAND_AM) {
//
//            setTitle(AM);
//        } else {
//            setTitle(AppConfig.FM);
//        }

//        ((RadioCarMenuCallBacks) mMenuCallBacks).setIListenerUpdateUI(this);
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
        getBaseContext().unregisterReceiver(broadcastReceiver);
        super.onDestroy();
    }

    @Override
    public void upDateUI() {

    }
}
