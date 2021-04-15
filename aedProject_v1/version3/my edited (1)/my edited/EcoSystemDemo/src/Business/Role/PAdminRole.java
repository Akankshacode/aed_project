/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LawyerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import PAdministrativeRole.PAdminstratorWorkAreaJPanel;
import javax.swing.JPanel;
import ui.PoliceRole.PoliceWorkAreaJPanel;

/**
 *
 * @author markynsailamar
 */
public class PAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PAdminstratorWorkAreaJPanel(userProcessContainer, enterprise);
    }
}
