/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.frmhutch.controller;

import Utils.FileManager;
import ec.edu.espe.frmhutch.model.Rabit;

/**
 *
 * @author Usuario
 */
public class RabitController {
    
    public void save(Rabit rabit){
      String data = rabit.getName() + ", " + rabit.getColor() + ", " + rabit.getRace() + ", " + rabit.getSize();
      FileManager.save(data, "rabits");
    
    
    }
    
}
