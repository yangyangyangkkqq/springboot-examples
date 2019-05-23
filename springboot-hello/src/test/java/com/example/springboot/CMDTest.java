package com.example.springboot;

import java.io.IOException;
import java.io.InputStream;

/**
 * java调用cmd
 * @author johnyang
 * @date 2019/3/25
 */
public class CMDTest {
    public static void main(String[] args) {
        String cmdStr="D:\\bls-bat\\BLSTEST\\jars\\start\\base\\pbplatform-registry.bat";
        try {
            Process process=Runtime.getRuntime().exec(cmdStr);
            InputStream in=process.getInputStream();
            int c;
            while ((c=in.read())!=-1){
                System.out.print(c);
            }
            in.close();
            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("cmd run");
    }

}
