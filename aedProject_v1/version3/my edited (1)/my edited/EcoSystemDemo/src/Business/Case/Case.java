/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Case;

import Business.Employee.Employee;

/**
 *
 * @author Akanksha
 */
public class Case {
    private static int caseID=1;
    private String victimName;
    private String issue;
    private String details;
    private String date;
    private String culpritName;
    private String status;
    private String socialObservations;

    public String getSocialObservations() {
        return socialObservations;
    }

    public void setSocialObservations(String socialObservations) {
        this.socialObservations = socialObservations;
    }
   

    private Employee emp;
    
    public Case(){
        caseID++;
//        this.issue=
    }

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public String getVictimName() {
        return victimName;
    }

    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCulpritName() {
        return culpritName;
    }

    public void setCulpritName(String culpritName) {
        this.culpritName = culpritName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
//    @Override
//    public String toString() {
//        return caseID;
//    }
    
}
