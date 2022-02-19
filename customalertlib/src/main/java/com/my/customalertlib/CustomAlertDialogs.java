package com.my.customalertlib;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomAlertDialogs {
    private Context context;
    private String title;
    private String btnPosiviteText;
    private String btnNegativeText;

    public CustomAlertDialogs(Context context, String title, String btnPosiviteText, String btnNegativeText) {
        this.context = context;
        this.title = title;
        this.btnPosiviteText = btnPosiviteText;
        this.btnNegativeText = btnNegativeText;
    }

    public void showMyCustomAlertDialog() {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.custom_alert_dialog_two_button);

        Button btn_positive = (Button) dialog.findViewById(R.id.btn_positive);
        Button btn_negative = (Button) dialog.findViewById(R.id.btn_negative);
        TextView tv_title = (TextView) dialog.findViewById(R.id.tv_title);

        tv_title.setText(title);
        btn_positive.setText(btnPosiviteText);
        btn_negative.setText(btnNegativeText);

        btn_positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        btn_negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

}
