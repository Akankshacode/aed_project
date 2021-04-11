/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.TherapistRole;
import java.util.ArrayList;

/**
 *
 * @author markynsailamar
 */
public class TherapistOrganization extends Organization{
    
     public TherapistOrganization() {
        super(Organization.Type.Therapist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TherapistRole());
        return roles;
    }
}
