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
import Business.Organization.PoliceOrganization;
import Business.Organization.PrisonOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.LawyerRole.LawyerWorkAreaJPanel;
import ui.PrisonRole.PrisonWorkAreaJPanel;

/**
 *
 * @author markynsailamar
 */
public class PrisonRole extends Role{
 
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PrisonWorkAreaJPanel(userProcessContainer, account, (PrisonOrganization)organization, enterprise,business);
    }
}
