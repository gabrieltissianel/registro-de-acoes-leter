/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 * @param <T>
 */
public class Subject<T extends Object> {
    protected ArrayList<Observer<T>> observers;
    protected T data;
    
    public Subject(){
        observers = new ArrayList<>();
    }
    
    public void attach(Observer<T> observer){
        observers.add(observer);
    }
    
    public void detach(int index){
        observers.remove(index);
    }
    
    public void setState(T data){
        this.data = data;
        notifyObservers();
    }
    
    private void notifyObservers(){
        for (Observer<T> observer : observers) {
            observer.update(data);
        }
    }
    
}

