package com.suresh.customalert;

import android.content.Context;
import android.widget.Toast;

public class CustomToast
{
    public void customToast(Context context,String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}