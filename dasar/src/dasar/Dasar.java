/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

public class Dasar {
    
    // definisi atribut
    String nama;
    int speed;
    int healthPoin;

    // definisi method run
    void run(){
        System.out.println("name" +" is running....");
        System.out.println("Speed: "+ speed);
        
    }

 
    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;

    
    
    }
    
}
