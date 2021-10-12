/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.hibernate.sql.Delete;
import org.springframework.stereotype.Service;

/**
 *
 * @author amagarai.guindo
 */

@Service
public class ApprenantServiceImp implements ApprenantService {
    
     ApprenantRepository apprenantRepository;
     public ApprenantServiceImp(ApprenantRepository apprenantRepository){
    
        this.apprenantRepository = apprenantRepository;
     }

    @Override
    public List listApprenant() {
        return apprenantRepository.findAll();
    }

    @Override
    public String addApprenant(Apprenant apprenant) {
        this.apprenantRepository.save(apprenant);
        return "Vous avez ajoutee l'apprenant : "+apprenant.getNom_apprenant()+" "+apprenant.getPrenom_apprenant()+ " sous le login" +apprenant.getLogin_apprenant();
     
    }

    @Override
    public String del_Apprenant(Integer id) {
      apprenantRepository.deleteById(id);
      return "vous avez supprimer l'apprenant"+ apprenantRepository.getById(id) ;
        
    }

    @Override
    public Apprenant lisById(Integer id) {
        return apprenantRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void Modifier_Apprenant(Integer id, Apprenant apprenant) {
        apprenantRepository.findById(id).get().setNom_apprenant(apprenant.getNom_apprenant());
        apprenantRepository.findById(id).get().setPrenom_apprenant(apprenant.getPrenom_apprenant());
        apprenantRepository.findById(id).get().setAge(apprenant.getAge());
        apprenantRepository.findById(id).get().setTelphone(apprenant.getTelphone());
        apprenantRepository.findById(id).get().setEmail_apprenant(apprenant.getEmail_apprenant());
        apprenantRepository.findById(id).get().setLogin_apprenant(apprenant.getLogin_apprenant());
        apprenantRepository.findById(id).get().setPassword_apprenant(apprenant.getPassword_apprenant());
        apprenantRepository.findById(id).get().setApprenantStatus(apprenant.getApprenantStatus());
        apprenantRepository.findById(id).get().setCreate_date(apprenant.getCreate_date());
        apprenantRepository.findById(id).get().setModify_date(apprenant.getModify_date());
        
    }

    @Override
    public Optional<Apprenant> loginUser(String login, String password) {
       return apprenantRepository.getUserByLoginAndPassword(login, password);
    }

   
    
}
