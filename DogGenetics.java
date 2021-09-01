/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssessmentBasicProgrammingConcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Noah McElroy
 */
public class DogGenetics {
    public static void main(String[] args){
        String dogName;
        Random dogo = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("What is your dog's name? ");
        dogName = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on "+dogName+ "'s prestigious background right here.");
        System.out.println(dogName+ " is: \n");
        int upperLimit =100;
        int percent;
        for(int i=0; i<5;i++){
            if(upperLimit >0){
                percent = dogo.nextInt(upperLimit)+1;
                switch(i){
                    case 0:
                        System.out.println(percent+"% St.Bernard");
                        upperLimit = upperLimit-percent;
                        break;
                    case 1:                        
                        System.out.println(percent+"% Chihuahua");
                        upperLimit = upperLimit-percent;
                        break;
                    case 2:                        
                        System.out.println(percent+"% Dramatic RedNosed Asian Pug");
                        upperLimit = upperLimit-percent;
                        break;
                    case 3:         
                        System.out.println(percent+"% Common Cur");
                        upperLimit = upperLimit-percent;
                        break;
                    case 4:   
                        System.out.println(percent+"% King Doberman");
                        upperLimit = upperLimit-percent;
                        break;
                    default:
                        break;
                }
            }
            else{
                switch(i){
                    case 0:
                        System.out.println("0% King Doberman");
                        break;
                    case 1:
                        System.out.println("0% King Doberman");
                        break;
                    case 2:
                        System.out.println("0% King Doberman");
                        break;
                    case 3:
                        System.out.println("0% King Doberman");
                        break;
                    case 4:
                        System.out.println("0% King Doberman");
                        break;
                    default:
                        break;
                }
            }
            
        }
        System.out.println("\n Wow that's QUITE the dog!");
        
    }
}
