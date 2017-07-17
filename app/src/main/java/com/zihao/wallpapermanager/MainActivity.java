package com.zihao.wallpapermanager;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            WallpaperManager wp = (WallpaperManager) this.getSystemService(Context.WALLPAPER_SERVICE);
            Bitmap bmp = BitmapFactory.decodeResource(getResources(),R.drawable.home);
            wp.setBitmap(bmp);
            // 设置系统壁纸
//            WallpaperManager instance = WallpaperManager.getInstance(this);
//            WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
//            DisplayMetrics dm = new DisplayMetrics();
//            wm.getDefaultDisplay().getMetrics(dm);
//            int desiredMinimumWidth = dm.widthPixels;
//            int desiredMinimumHeight = dm.heightPixels;
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            instance.suggestDesiredDimensions(desiredMinimumWidth, desiredMinimumHeight);
//            Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.home);
//            instance.setBitmap(bitmap);
        }catch (Exception e){
            //
        }
    }
}
