package com.zly.judy.lib.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Activity基类
 * Created by Zhuliya on 2018/8/30
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * 显示Toast
     *
     * @param msg
     */
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 进入页面
     *
     * @param cls
     */
    public void forword(Class cls) {
        startActivity(new Intent(this, cls));
    }

}
