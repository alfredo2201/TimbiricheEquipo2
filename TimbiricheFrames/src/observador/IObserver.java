/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import modelo.*;

/**
 *
 * @author Equipo gatazo
 * @param <T>
 */
public interface IObserver <T>{
    public void update(T modelo);
}
