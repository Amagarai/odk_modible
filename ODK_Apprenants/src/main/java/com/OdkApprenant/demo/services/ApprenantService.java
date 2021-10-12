/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author amagarai.guindo
 */

public interface ApprenantService {
    public abstract List listApprenant();
    public abstract String addApprenant(Apprenant apprenant);
    public abstract String del_Apprenant(Integer id);
    public abstract Apprenant lisById(Integer id);
    public abstract void Modifier_Apprenant(Integer id,Apprenant apprenant);
    public abstract Optional<Apprenant> loginUser(String login, String password);
}
