package com.ptf.crudcsgo.controller;

import com.ptf.crudcsgo.dto.WeaponDTO;
import com.ptf.crudcsgo.service.WeaponService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/weapons")
public class WeaponController {

    private WeaponService weaponService;

    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @GetMapping
    public ArrayList<WeaponDTO> getWeapon(){
        return this.weaponService.getWeapon();
    }

    @PostMapping
    public String postWeapon(@RequestBody WeaponDTO weaponDTO){
        return this.weaponService.postWeapon(weaponDTO);
    }

    @DeleteMapping("/{id}")
    public String deleteWeapon(){
        return this.weaponService.deleteWeapon();
    }

    @PutMapping
    public String putWeapon(WeaponDTO weaponUpdate){
        return this.weaponService.putWeapon(weaponUpdate);
    }

}
