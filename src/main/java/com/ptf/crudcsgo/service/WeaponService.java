package com.ptf.crudcsgo.service;

import com.ptf.crudcsgo.dto.WeaponDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Deque;

@Service
public class WeaponService {
    private ArrayList<String> weaponList = new ArrayList<>();

    public String getWeapon(){
        return "dragonlore";
    }

    public String postWeapon(WeaponDTO weaponDTO) {
        weaponList.add(weaponDTO.getWeapon());
        return "Arma criada";
    }

    public String deleteWeapon() {
        weaponList.remove("Bayonet Doppler");
        return "Bayonet Doppler deletada";
    }

    public String putWeapon() {
        var weapon = weaponList.get(0);
        weapon = "Karambit";
        weaponList.remove(0);
        weaponList.add(weapon);
        return "Arma alterada";
    }
}
