/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * Change the code to avoid String input and input errors 
 * then print the status details. 
 * @author srinivsi date:March 8th
 */
public class Status {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the user status code [0 - 3]");
        int code = in.nextInt();

        StatusUser t = new StatusUser( code);

        t.printStatusDetail();

    }
}
