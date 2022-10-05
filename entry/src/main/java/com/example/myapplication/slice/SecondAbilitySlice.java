package com.example.myapplication.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.Text;
import ohos.agp.utils.Color;

public class SecondAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        // 创建布局对象
        DirectionalLayout layout = new DirectionalLayout(this);
        // 创建文本对象
        Text text = new Text(this);
        // 设置内容
        text.setText("第二个页面");
        text.setTextSize(55);
        text.setTextColor(Color.BLUE);

        // 将文本对象添加到布局中
        layout.addComponent(text);

        // 将布局添加到子界面
        super.setUIContent(layout);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
