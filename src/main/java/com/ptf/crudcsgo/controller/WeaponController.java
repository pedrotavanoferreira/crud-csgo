package com.ptf.crudcsgo.controller;

import com.ptf.crudcsgo.service.WeaponService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weapon")
public class WeaponController {

    private WeaponService weaponService;

    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @GetMapping
    public String getWeapon(){
        return this.weaponService.getWeapon();
    }

}
