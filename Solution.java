package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String file1 = sc.nextLine();
        String file2 = sc.nextLine();
        String file3 = sc.nextLine();
        sc.close();

        FileInputStream in2 = new FileInputStream(file2);
        FileOutputStream out = new FileOutputStream(file1);

        byte[] buffer2 = new byte[1000];
        while(in2.available() > 0) {
            int count2 = in2.read(buffer2);
            out.write(buffer2, 0, count2);
        }
        in2.close();
        out.close();

        FileInputStream in3 = new FileInputStream(file3);
        FileOutputStream appendOut = new FileOutputStream(file1, true);
        byte[] buffer3 = new byte[1000];
        while(in3.available() > 0) {
            int count3 = in3.read(buffer3);
            appendOut.write(buffer3, 0, count3);
        }
        in3.close();
        appendOut.close();
    }
}
