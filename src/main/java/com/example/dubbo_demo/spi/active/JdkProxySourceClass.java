package com.example.dubbo_demo.spi.active;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JdkProxySourceClass {
    public static void writeClassToDisk(String path, String simpleClassName, Class[] clazzes){

        //byte[] classFile = ProxyGenerator.generateProxyClass("$proxy4", new Class[]{PersonInter.class});
        byte[] classFile = ProxyGenerator.generateProxyClass(simpleClassName, clazzes);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            fos.write(classFile);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
