/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.prog;

import br.univali.prog.m1.Backuper;
import br.univali.prog.m1.Timer;
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
        InputStream fis = new FileInputStream("Tomorrows Schedule.txt");
        OutputStream fos = new FileOutputStream("Next days schedule.txt");
        Backuper backuper = new Backuper(fis, fos);
        Timer time = new Timer();
        
        time.countStart();
        backuper.backup();
        System.out.println(time.getElapsedTime());
    }
    
}
