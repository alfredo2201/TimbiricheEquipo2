/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;


/**
 *
 * @author Equipo Gatazo
 */
public interface IObservable {
     public void attach();
     public void notificar();
}
