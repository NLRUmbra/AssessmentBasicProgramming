/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssessmentBasicProgrammingConcepts;

import java.util.Scanner;

/**
 *
 * @author Noah McElroy
 */
public class HealthyHearts {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int age;
        System.out.println("What is your age?");
        age = input.nextInt();
        int heartRate = 220-age;
        System.out.println("Your maximum heart rate should be "+ heartRate +" beats per minute");
        int lower  = heartRate/2;
        int upper = (int) (heartRate *.85);
        System.out.println("Your target HR Zone is "+lower+ " - "+upper+" beats per minute");
    }
}
