package com.aqinn.sample.subtree.subapplication;

import android.content.Context;
import android.widget.Toast;

public class SubAppUtils {

    public static void sayHi(Context context) {
        Toast.makeText(context, "Hi, here is sub app.", Toast.LENGTH_SHORT).show();
    }

}
