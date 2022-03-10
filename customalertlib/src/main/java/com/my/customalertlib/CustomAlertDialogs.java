package com.my.customalertlib;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomAlertDialogs {
    private Context context;
    private Dialog dialog;
    private Button btn_ok;
    private Button btn_positive;
    private Button btn_negative;
    private Button btn_other;

    public CustomAlertDialogs(Context context) {
        this.context = context;
        dialog = new Dialog(context);
    }

    public void showOneButtonAlertDialog() {
        dialog.setContentView(R.layout.custom_alert_dialog_one_button);
        init();
        dialog.show();
        clickListener(btn_ok);
    }

    public void showTwoButtonAlertDialog() {
        dialog.setContentView(R.layout.custom_alert_dialog_two_button);
        init();
        dialog.show();
        clickListener(btn_positive);
        clickListener(btn_negative);
    }

    public void showThreeButtonAlertDialog() {
        dialog.setContentView(R.layout.custom_alert_dialog_three_button);
        init();
        dialog.show();
        clickListener(btn_positive);
        clickListener(btn_negative);
        clickListener(btn_other);
    }


    private void init() {
        TextView tv_title = dialog.findViewById(R.id.tv_title);
        TextView tv_content = dialog.findViewById(R.id.tv_content);
        btn_ok = dialog.findViewById(R.id.btn_ok);
        btn_positive = dialog.findViewById(R.id.btn_positive);
        btn_negative = dialog.findViewById(R.id.btn_negative);
        btn_other = dialog.findViewById(R.id.btn_other);

    }

    private void clickListener(View v) {
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.btn_ok) {
                    System.out.println("btn ok");
                } else if (view.getId() == R.id.btn_positive) {
                    System.out.println("btn positive");
                } else if (view.getId() == R.id.btn_negative) {
                    System.out.println("btn negative");
                } else {
                    System.out.println("btn other");
                }
            }
        });
    }


}
