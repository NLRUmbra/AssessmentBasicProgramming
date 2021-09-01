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
public class RockPaperScissors {
    
    public static void main(String[] args){
        int rounds;
        int userInput;
        boolean continues;//whether the user wants to play again or not
        int computerInput;
        Scanner input = new Scanner(System.in);
        Random computer = new Random();
        System.out.println("Please enter the amount of rounds you wish to play between 1-10:");
        rounds = input.nextInt();
        if(rounds >= 1 && rounds <= 10){
           do{
                int wins= 0;
                int loses =0;
                int ties = 0;
                do{
                    do{
                        System.out.println("Please enter your choice 1= rock, 2= paper, 3=scissors");
                        userInput = input.nextInt();
                        input.nextLine();//throw away carriage return
                    
                    }while(userInput <1 || userInput >3);
                    computerInput = computer.nextInt(3)+1;
                    switch(userInput){
                        case 1:
                            if(computerInput ==1){
                                System.out.println("The computer has selected paper, you tied this round.");
                                ties++;
                            }else if(computerInput ==2){
                                System.out.println("The computer has selected paper, you lost this round.");
                                loses++;
                            }else{
                                System.out.println("The computer has selected scissors, you won this round.");
                                wins++;
                            }
                            break;
                        case 2:
                            if(computerInput ==1){
                                System.out.println("The computer has selected rock, you won this round.");
                                wins++;
                            }else if(computerInput ==2){
                                System.out.println("The computer has selected paper, you tied this round.");
                                ties++;
                            }else{
                                System.out.println("The computer has selected scissors, you lost this round.");
                                loses++;
                            }
                            break;
                        case 3:                        
                            if(computerInput ==1){
                                System.out.println("The computer has selected rock, you lost this round.");
                                loses++;
                            }else if(computerInput ==2){
                                System.out.println("The computer has selected paper, you won this round.");
                                wins++;
                            }else{
                                System.out.println("The computer has selected scissors, you tied this round.");
                                ties++;
                            }
                            break;
                        default:
                            break;
                    }
                }while(rounds!= wins+loses+ties);
                System.out.println("Wins: "+ wins +"\n Loses: "+loses+"\n Ties: "+ties);
                if(wins ==loses){
                    System.out.println("You have tied with the computer.");
                }else if(wins >loses){
                    System.out.println("You have beaten the computer!");
                }else{
                    System.out.println("You have lost to the computer.");
                }
                String tryAgain;
            
                System.out.println("Do you want to play again? Yes/No");
                tryAgain = input.nextLine();
                if(tryAgain.toLowerCase().contains("yes")){
                    continues =true;
                }else{
                    continues =false;
                }
            
               
            }while(continues ==true);
            
            }else{
                System.out.println("The amount of rounds you entered is outside the range. Have a good day!");
            }
            
 
    }
}
