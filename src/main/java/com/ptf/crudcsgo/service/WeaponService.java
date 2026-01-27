package com.ptf.crudcsgo.service;

import com.ptf.crudcsgo.dto.WeaponDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WeaponService {
    private ArrayList<WeaponDTO> weaponList = new ArrayList<>();

    public ArrayList<WeaponDTO> getWeapon(){
        return weaponList;
    }

    public String postWeapon(WeaponDTO weaponDTO) {
        weaponList.add(weaponDTO);
        return "Arma criada";
    }

    public String deleteWeapon() {
        weaponList.clear();
        return "Armas deletadas";
    }

    public String putWeapon(WeaponDTO weaponUpdate) {
        if (weaponList == null || weaponList.isEmpty()) {
            return "Lista de armas está vazia ou não inicializada";
        }

        for (WeaponDTO weapon : weaponList) {
            if (weapon.getId() == weaponUpdate.getId()) {
                weapon.setName(weaponUpdate.getName());
                weapon.setType(weaponUpdate.getType());
                weapon.setSkin(weaponUpdate.getSkin());

                return "Arma alterada com sucesso";
            }
        }

        return "Arma alterada";
    }
}
