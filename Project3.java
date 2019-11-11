/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3;

/**
 *
 * @author HP
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======== looping for ========");
        for (int i = 7; i < 10; i++){
            System.out.println(i);
            
            
        System.out.println("======== lopping for 2 ========");
        for (int x = 0; x<=10; x = x+3){
            System.out.println(x);
            
            
        System.out.println("======== for each ========");
        String[] color = {"merah", "kuning", "hijau", "biru"};
        for (String a : color){
                System.out.println(a);
        }
        }
        
        
        System.out.println("======== while ========");
        int y = 0;
        while (y < 10){
                System.out.println("nilai y =" + y);
                y++;
                
                
        System.out.println("======== do while ========");
        int u = 1;
        do{
                System.out.println("nilai u = " + u);
                u++;
        } while (u<10);
        
        }
    }
    
}
  }  
