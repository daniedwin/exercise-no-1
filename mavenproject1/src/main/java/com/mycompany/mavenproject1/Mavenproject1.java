/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author IT20
 */
import java.util.*;
public class Mavenproject1 {

    public static void main(String[] args) {
        int n1, n2, sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        n1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        n2 = sc.nextInt();
        sum = n1 + n2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
