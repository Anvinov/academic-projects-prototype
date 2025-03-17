/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lopez
 */
public class Subject {
    private static List<IObserver> observers = new ArrayList<>(); // Lista estática

    public void addObserver(IObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("Notificando a " + observers.size() + " observadores...");
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
