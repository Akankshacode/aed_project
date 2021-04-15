/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LawyerRole;
import Business.Role.PrisonRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author markynsailamar
 */
public class PrisonOrganization  extends Organization{
    
    public PrisonOrganization() {
        super(Type.Prison.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PrisonRole());
        return roles;
    }
}
