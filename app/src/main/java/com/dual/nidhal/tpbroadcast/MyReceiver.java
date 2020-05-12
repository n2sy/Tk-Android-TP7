package com.dual.nidhal.tpbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    //Empty constructor
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent i) {
        String intentAction = i.getAction();
        String toastMessage = null;
        switch (intentAction){
            case Intent.ACTION_POWER_CONNECTED:
                toastMessage = context.getString(R.string.power_connected);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                toastMessage = context.getString(R.string.power_disconnected);
                break;

        }

        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }

}