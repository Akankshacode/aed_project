/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.Role;
import Business.Role.SocialWorkerRole;
import java.util.ArrayList;

/**
 *
 * @author Akanksha
 */
public class SocialWorkerOrganization extends Organization {

    public SocialWorkerOrganization() {
        super(Organization.Type.SocialWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SocialWorkerRole());
        return roles;

    }
}
