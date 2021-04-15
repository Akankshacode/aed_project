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
    private String caseIID;
    private String victimName;
    private String issue;
    private String details;
    private String date;
    private String culpritName;
    private String status;
    private String socialObservations;
    private String SocialStatus;
    private String SocialWorker;
   private boolean assigned;


//HOSPITAL PARAMETERS
 private String VictomDescription;
    private String CaseStatusDoctor;
      private String CaseStatusTherapist;
private String Dstatus;
private String Tstatus; 
   private String Doctor;
     private String Therapist;
     private String DocAppointment;
     private String TherapistAppointement;
     private String DoctorNotes;
      private String DoctorPrescribedMedication;
      private String TherapistDescription;
       private String TherapistSymptom;
       private String TherapistTherapy;
       private boolean flagTaken =false;
     
      
       
       
       
       //LAW PARAMENT

        private String Lstatus;
       private String Lawyer;
       private String Court;
       private String LawyerStatus;
       private String Status;
       private String LawInvoked;
       private String ActionPlan;
       private String LawEnforcedRequired;
       private String PersonalComments;
       private String Decision;
       private String Evidence_Present;
       private String Judgement;
       private String Sentence;
       private String RestrainingOrder;


    public String getLstatus() {
        return Lstatus;
    }

    public void setLstatus(String Lstatus) {
        this.Lstatus = Lstatus;
    }

    public String getLawyer() {
        return Lawyer;
    }

    public void setLawyer(String Lawyer) {
        this.Lawyer = Lawyer;
    }

    public String getCourt() {
        return Court;
    }

    public void setCourt(String Court) {
        this.Court = Court;
    }

    public String getLawyerStatus() {
        return LawyerStatus;
    }

    public void setLawyerStatus(String LawyerStatus) {
        this.LawyerStatus = LawyerStatus;
    }

    public String getLawInvoked() {
        return LawInvoked;
    }

    public void setLawInvoked(String LawInvoked) {
        this.LawInvoked = LawInvoked;
    }

    public String getActionPlan() {
        return ActionPlan;
    }

    public void setActionPlan(String ActionPlan) {
        this.ActionPlan = ActionPlan;
    }

    public String getLawEnforcedRequired() {
        return LawEnforcedRequired;
    }

    public void setLawEnforcedRequired(String LawEnforcedRequired) {
        this.LawEnforcedRequired = LawEnforcedRequired;
    }

    public String getPersonalComments() {
        return PersonalComments;
    }

    public void setPersonalComments(String PersonalComments) {
        this.PersonalComments = PersonalComments;
    }
       
       
    public String getCaseIID() {
        return caseIID;
    }

    public void setCaseIID(String caseIID) {
        this.caseIID = caseIID;
    }

       
    public String getSocialWorker() {
        return SocialWorker;
    }

    public void setSocialWorker(String SocialWorker) {
        this.SocialWorker = SocialWorker;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public String getSocialStatus() {
        return SocialStatus;
    }

    public void setSocialStatus(String victimStatus) {
        this.SocialStatus = victimStatus;
    }
    
    
    
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
    
    public String getVictomDescription() {
        return VictomDescription;
    }

    public void setVictomDescription(String VictomDescription) {
        this.VictomDescription = VictomDescription;
    }

    public String getCaseStatusDoctor() {
        return CaseStatusDoctor;
    }

    public void setCaseStatusDoctor(String CaseStatusDoctor) {
        this.CaseStatusDoctor = CaseStatusDoctor;
    }

    public String getCaseStatusTherapist() {
        return CaseStatusTherapist;
    }

    public void setCaseStatusTherapist(String CaseStatusTherapist) {
        this.CaseStatusTherapist = CaseStatusTherapist;
    }

    public String getDstatus() {
        return Dstatus;
    }

    public void setDstatus(String Dstatus) {
        this.Dstatus = Dstatus;
    }

    public String getTstatus() {
        return Tstatus;
    }

    public void setTstatus(String Tstatus) {
        this.Tstatus = Tstatus;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public String getTherapist() {
        return Therapist;
    }

    public void setTherapist(String Therapist) {
        this.Therapist = Therapist;
    }

    public String getDocAppointment() {
        return DocAppointment;
    }

    public void setDocAppointment(String DocAppointment) {
        this.DocAppointment = DocAppointment;
    }

    public String getTherapistAppointement() {
        return TherapistAppointement;
    }

    public void setTherapistAppointement(String TherapistAppointement) {
        this.TherapistAppointement = TherapistAppointement;
    }

    public String getDoctorNotes() {
        return DoctorNotes;
    }

    public void setDoctorNotes(String DoctorNotes) {
        this.DoctorNotes = DoctorNotes;
    }

    public String getDoctorPrescribedMedication() {
        return DoctorPrescribedMedication;
    }

    public void setDoctorPrescribedMedication(String DoctorPrescribedMedication) {
        this.DoctorPrescribedMedication = DoctorPrescribedMedication;
    }

    public String getTherapistDescription() {
        return TherapistDescription;
    }

    public void setTherapistDescription(String TherapistDescription) {
        this.TherapistDescription = TherapistDescription;
    }

    public String getTherapistSymptom() {
        return TherapistSymptom;
    }

    public void setTherapistSymptom(String TherapistSymptom) {
        this.TherapistSymptom = TherapistSymptom;
    }

    public String getTherapistTherapy() {
        return TherapistTherapy;
    }

    public void setTherapistTherapy(String TherapistTherapy) {
        this.TherapistTherapy = TherapistTherapy;
    }

    public boolean isFlagTaken() {
        return flagTaken;
    }

    public void setFlagTaken(boolean flagTaken) {
        this.flagTaken = flagTaken;
    }
    
//    @Override
//    public String toString() {
//        return caseID;
//    }
    
}
