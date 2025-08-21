package com.ptf.crudcsgo.controller;

import com.ptf.crudcsgo.dto.WeaponDTO;
import com.ptf.crudcsgo.service.WeaponService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public String postWeapon(@RequestBody WeaponDTO weaponDTO){
        return this.weaponService.postWeapon();
    }

    @DeleteMapping
    public String deleteWeapon(){
        return this.weaponService.deleteWeapon();
    }

    @PutMapping
    public String putWeapon(){
        return this.weaponService.putWeapon();
    }

}
