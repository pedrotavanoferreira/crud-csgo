package com.ptf.crudcsgo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Deque;

@Service
public class WeaponService {
    private ArrayList<String> weaponList = new ArrayList<>();

    public String getWeapon(){
        return "dragonlore";
    }

    public String postWeapon() {
        weaponList.add("Bayonet Doppler");
        return "Bayonet Doppler criada";
    }
}
