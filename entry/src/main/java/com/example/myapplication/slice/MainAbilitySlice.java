package com.example.myapplication.slice;

import com.example.myapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice implements Component.ClickedListener {

    Button button;
    Text txt;
    Button btnEvent;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        // 获取页面跳转按钮
        button = findComponentById(ResourceTable.Id_btn);

        txt = findComponentById(ResourceTable.Id_txt);
        // 第一种写法：给按钮添加点击事件
        button.setClickedListener(this);

        btnEvent = findComponentById(ResourceTable.Id_btnEvent);
        // 第二种写法：绑定事件的方式
//        btnEvent.setClickedListener(new MyListener());
        btnEvent.setClickedListener(this);

    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    @Override
    public void onClick(Component component) {
        // 点击按钮  跳转到第二个页面
//        if (component == button) {
//            Intent intent = new Intent(); // 创建意图
//            Operation operation = new Intent.OperationBuilder()
//                    .withDeviceId("") // 要跳转到哪个设备，传空字符串，表示跳转本机
//                    .withBundleName("com.example.myapplication") // 要跳转的应用包名
//                    .withAbilityName("com.example.myapplication.SecondAbility") // 要跳转的页面
//                    .build(); // 将上面的三个信息进行打包
//            // 设置到意图
//            intent.setOperation(operation);
//            // 跳转
//            startAbility(intent);
//
//        }
        txt.setText("被点击了哦");
    }
}

class MyListener implements Component.ClickedListener {

    @Override
    public void onClick(Component component) {
        Button btn = (Button) component;
        btn.setText("点了哦");
    }
}