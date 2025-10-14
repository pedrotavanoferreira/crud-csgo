package com.ptf.crudcsgo.service;

import com.ptf.crudcsgo.dto.WeaponDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WeaponService {
    private ArrayList<String> weaponList = new ArrayList<>();

    public String getWeapon(){
        return weaponList.toString();
    }

    public String postWeapon(WeaponDTO weaponDTO) {
        weaponList.add(weaponDTO.getWeapon());
        return "Arma criada";
    }

    public String deleteWeapon() {
        weaponList.clear();
        return "Armas deletadas";
    }

    public String putWeapon(String weaponUpdate) {
        if (weaponList == null || weaponList.isEmpty()) {
            return "Lista de armas está vazia ou não inicializada";
        }

        // Atualiza a primeira arma com a nova
        weaponList.set(0, weaponUpdate); // substitui diretamente

        return "Arma alterada";
    }
}
