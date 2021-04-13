/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Case.CaseDirectory;
import Business.Case.HospitalCaseDirectory;
import Business.Case.LawCaseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private CaseDirectory caseDir;
    private HospitalCaseDirectory hcaseDir;
       private LawCaseDirectory lcaseDir;
    private ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public HospitalCaseDirectory getHcaseDir() {
        return hcaseDir;
    }

    public void setHcaseDir(HospitalCaseDirectory hcaseDir) {
        this.hcaseDir = hcaseDir;
    }

    public LawCaseDirectory getLcaseDir() {
        return lcaseDir;
    }

    public void setLcaseDir(LawCaseDirectory lcaseDir) {
        this.lcaseDir = lcaseDir;
    }

    public HospitalCaseDirectory getHospitalCaseDirectory() {
        return hcaseDir;
    }

    public void setHospitalCaseDirectory(HospitalCaseDirectory hcaseDir) {
        this.hcaseDir = hcaseDir;
        
    }

    public CaseDirectory getCaseDir() {
        return caseDir;
    }
     public CaseDirectory getCaseDirectory() {
        return caseDir;
    }
    

    public void setCaseDir(CaseDirectory caseDir) {
        this.caseDir = caseDir;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        caseDir = new CaseDirectory();
        networkList=new ArrayList<Network>();
        hcaseDir=new HospitalCaseDirectory();
        lcaseDir=new LawCaseDirectory();
        
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
