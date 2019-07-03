/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.lsp.solucao;

/**
 *
 * @author Rehenrique
 */
public class CordinatorEducational {

    private void takeAttendence() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void makeAnnouncements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void collectPaperWork() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void conductHallwayDuties() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void performOtherResponsabilities() {
        makeAnnouncements();
        conductHallwayDuties();
        collectPaperWork();
        takeAttendence();
        performOtherResponsabilities();
    }
}
