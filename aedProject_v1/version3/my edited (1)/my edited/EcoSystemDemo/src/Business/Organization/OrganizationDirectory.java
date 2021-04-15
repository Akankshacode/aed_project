/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
         if(type.getValue().equals(Type.Victim.getValue())){
            organization = new VictimOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals((Type.SocialWorker.getValue()))){
            organization = new SocialWorkerOrganization();
            organizationList.add(organization);
        }
          else if(type.getValue().equals((Type.Doctor.getValue()))){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
          else if(type.getValue().equals((Type.Therapist.getValue()))){
            organization = new TherapistOrganization();
            organizationList.add(organization);
        }
          else if(type.getValue().equals((Type.Lawyer.getValue()))){
            organization = new LawyerOrganization();
            organizationList.add(organization);
        }
          else if(type.getValue().equals((Type.Court.getValue()))){
            organization = new CourtOrganization();
            organizationList.add(organization);
        }
         else if(type.getValue().equals((Type.Police.getValue()))){
            organization = new PoliceOrganization();
            organizationList.add(organization);
        }
          else if(type.getValue().equals((Type.Prison.getValue()))){
            organization = new PrisonOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}