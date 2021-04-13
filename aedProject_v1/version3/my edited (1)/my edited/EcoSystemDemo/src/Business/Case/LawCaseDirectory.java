/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Case;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author markynsailamar
 */
public class LawCaseDirectory {
    private ArrayList<Case> caseList;
    private Employee emp;
    public LawCaseDirectory() {
        caseList = new ArrayList();
    }

    public ArrayList<Case> getCaseList() {
        return caseList;
    }


    public Case createCase(String issue,String culpritName, String description, String status,String name,String date){
        Case c = new Case();
        c.setIssue(issue);
        c.setCulpritName(culpritName);
        c.setDetails(description);
        c.setStatus(status);
        c.setVictimName(name);
        c.setDate(date);
        c.setLawyer("Not Assigned");
        c.setAssigned(false);
        c.setLawyerStatus("Not Assigned");
        caseList.add(c);
        return c;
    }
    public void AddCase( Case c)
    {
        caseList.add(c);
    }
       public void deleteCase(Case c){
              caseList.remove(c);
    }
       public Case findCase(String name)
       {
           for(Case ca: caseList)
           {
           if(ca.getVictimName().equals(name))
               return ca;
            }
           return null;
       }
}
