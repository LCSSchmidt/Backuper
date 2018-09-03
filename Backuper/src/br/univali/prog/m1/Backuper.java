    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.prog.m1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author stit_
 */

public class Backuper {
    String file;
    InputStream fis;
    OutputStream fos;
    
    public Backuper(InputStream dataIn, OutputStream dataOut) throws Exception{
        this.fis = dataIn;
        this.fos = dataOut;
    }
    
    public void backup() throws Exception{
        int lastReadByte = -1;
                
        do{
            lastReadByte = fis.read();
            if(lastReadByte >= 0){
                this.fos.write(lastReadByte);
                //System.out.print((char)byteLido);
            }
        } while(lastReadByte >= 0);
        this.fos.close();
    }
}