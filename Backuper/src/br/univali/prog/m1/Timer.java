/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.prog.m1;

/**
 *
 * @author stit_
 */
public class Timer {
    long time;

    public Timer() {
    }
    
    public void countStart(){
        this.time = System.currentTimeMillis();
    }
    
    private long ElapsedTime(){
        return System.currentTimeMillis() - this.time;
    }
    
    public long getElapsedTime(){
        long auxTime = 0;
        auxTime = ElapsedTime();
        time = 0;
        return auxTime;
    }
}
