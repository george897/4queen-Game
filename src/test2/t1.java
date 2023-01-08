/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import javax.swing.SwingWorker;
import static test2.NQueensVisualization.solveNQueen1;

/**
 *
 * @author GeorgeAlaa
 */
public class t1 extends SwingWorker <Void, Void> {
    @Override
    protected Void doInBackground() throws Exception {
         solveNQueen1(); 
         return null;
    }
    
}
