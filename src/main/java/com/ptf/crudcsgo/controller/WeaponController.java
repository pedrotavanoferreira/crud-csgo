package com.ptf.crudcsgo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weapon")
public class WeaponController {

    @GetMapping
    public String getWeapon(){
        return "vou retornar dragonlore";
    }

}
