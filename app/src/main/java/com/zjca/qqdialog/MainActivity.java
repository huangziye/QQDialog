package com.zjca.qqdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view)
    {
        ActionSheetDialog dialog = new ActionSheetDialog(this);
        dialog.builder().setTitle("选择上传方式").addSheetItem("照片", ActionSheetDialog.SheetItemColor.Red, new ActionSheetDialog.OnSheetItemClickListener()
        {
            @Override
            public void onClick(int which)
            {

            }
        }).addSheetItem("照相", ActionSheetDialog.SheetItemColor.Red, new ActionSheetDialog.OnSheetItemClickListener()
        {
            @Override
            public void onClick(int which)
            {

            }
        }).addSheetItem("选择", ActionSheetDialog.SheetItemColor.Red, new ActionSheetDialog.OnSheetItemClickListener()
        {
            @Override
            public void onClick(int which)
            {

            }
        }).setCancelListener(new ActionSheetDialog.OnCancelClickListener()
        {
            @Override
            public void onCancelClick()
            {
            }
        }).setCanceledOnTouchOutside(true).show();
    }
}
