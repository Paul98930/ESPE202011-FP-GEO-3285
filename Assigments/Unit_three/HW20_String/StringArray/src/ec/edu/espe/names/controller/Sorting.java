/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.names.controller;

public class Sorting {
    
    public String[] name;

    public String[] sortingNames(String vector[]) {
        this.name = vector;
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length && i != j; j++) {
                if (name[i].compareToIgnoreCase(name[j]) < 0) {
                    String auxiliar = name[i];
                    name[i] = name[j];
                    name[j] = auxiliar;
                }
            }

        }
        return vector;
    } 

       
    public String[] show() {
        for (String a : name) {

        }
        return name;
    }

}
   
    

