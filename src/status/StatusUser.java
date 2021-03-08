/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * March 8th
 * @author srinivsi
 */
public class StatusUser {

    private int code;

    public StatusUser(int code) {
        this.code = code;
    }

    public void printStatusDetail() {
        switch (code) {
            case 0:
                System.out.println("REJECTED");
                break;
            case 1:
                System.out.println("PENDING");
                break;
            case 2:
                System.out.println("PROCESSING");
                break;
            case 3:
                System.out.println("APPROVED");
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
    }
}
