package com.aqinn.sample.submodule.submodule1;

import android.content.Context;
import android.widget.Toast;

public class Utils {

    public static void sayHi(Context context) {
        Toast.makeText(context, "Hi, here is sub module 1.", Toast.LENGTH_LONG).show();
    }

}
