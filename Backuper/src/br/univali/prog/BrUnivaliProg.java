/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.prog;

import br.univali.prog.m1.Backuper;
import br.univali.prog.m1.Timer;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author stit_
 */
public class BrUnivaliProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        InputStream fis = new FileInputStream("Twenty schedule.txt");
        BufferedInputStream bfis = new BufferedInputStream(fis);
        OutputStream fos = new FileOutputStream("Next days schedule.txt");
        BufferedOutputStream bfos= new BufferedOutputStream(fos);
        Backuper backuper = new Backuper(bfis, bfos);
        Timer time = new Timer();
        
        time.countStart();
        backuper.backup();
        System.out.println(time.getElapsedTime());
    }
    
}
