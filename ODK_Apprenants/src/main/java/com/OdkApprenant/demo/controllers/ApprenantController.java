/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.controllers;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.services.ApprenantServiceImp;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author amagarai.guindo
 */

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api")
public class ApprenantController {
    
    ApprenantServiceImp apprenantServiceImp;

    public ApprenantController(ApprenantServiceImp apprenantServiceImp){
    
        this.apprenantServiceImp = apprenantServiceImp;
    }
    
    @GetMapping("/listing")
    public List<Apprenant> getListApprenants()
    {
        return this.apprenantServiceImp.listApprenant();
    }
    
    @PostMapping("/add")
    public String addApprenant(@RequestBody Apprenant apprenant)
    {
        return this.apprenantServiceImp.addApprenant(apprenant);
    }
    
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String del_Apprenant(@PathVariable Integer id){
        
        return this.apprenantServiceImp.del_Apprenant(id);
    }
    
    @GetMapping("/listId/{id}")
    public Apprenant lisById(@PathVariable Integer id){
    return this.apprenantServiceImp.lisById(id);
}
    @PatchMapping("/modifier/{id}")
     public void Modifier_Apprenant(@PathVariable Integer id, @RequestBody Apprenant apprenant){
          this.apprenantServiceImp.Modifier_Apprenant(id, apprenant);
     }
     
     @GetMapping("/auth/login={login}&password={password}")
     public Optional<Apprenant> loginUser(@PathVariable String login,@PathVariable String password){
       return  this.apprenantServiceImp.loginUser(login, password);
     }
    
}
