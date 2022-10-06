package com.example.myapplication;

import com.example.myapplication.slice.EventAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class EventAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(EventAbilitySlice.class.getName());
    }
}
