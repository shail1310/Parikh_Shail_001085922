/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.VitalSign;
import java.util.Scanner;


/**
 *
 * @author shail
 */
public class Patient {
        
    private double ageGroup;
    private double respiratoryRate;
    private double heartRate;
    private double bloodPressure;
    
    private double weightKgs;
    private double weightPounds;
    

    private Patient(VitalSign vs) {
        this.ageGroup = vs.getAgeGroup();
        this.bloodPressure = vs.getBloodPressure();
        this.heartRate = vs.getHeartRate();
        this.respiratoryRate = vs.getRespiratoryRate();
        this.weightKgs = vs.getWeightKgs();
        this.weightPounds = vs.getWeightPounds();
    
    }
    private boolean isPatientNormal()
    {
         if (this.ageGroup >0 && this.ageGroup <0.1 
                 && this.respiratoryRate >30 && this.respiratoryRate <50 
                 && this.heartRate >120 && this.heartRate <160 
                 && this.bloodPressure >50 && this.bloodPressure <70 
                 && this.weightKgs >2 && this.weightKgs <3 
                 && this.weightPounds >4.5 && this.weightPounds <7) {
    return true;
    }
         if (this.ageGroup >0.1 && this.ageGroup <1 
                 && this.respiratoryRate >20 && this.respiratoryRate <30 
                 && this.heartRate >80 && this.heartRate <140 
                 && this.bloodPressure >70 && this.bloodPressure <100 
                 && this.weightKgs >4 && this.weightKgs <10
                 && this.weightPounds >9 && this.weightPounds <22) {
    return true;
    }
         if (this.ageGroup >1 && this.ageGroup <3
                 && this.respiratoryRate >20 && this.respiratoryRate <30 
                 && this.heartRate >80 && this.heartRate <130 
                 && this.bloodPressure >80 && this.bloodPressure <110 
                 && this.weightKgs >10 && this.weightKgs <14
                 && this.weightPounds >22 && this.weightPounds <31) {
    return true;
    }
         if (this.ageGroup >3 && this.ageGroup <5 
                 && this.respiratoryRate >20 && this.respiratoryRate <30 
                 && this.heartRate >80 && this.heartRate <120 
                 && this.bloodPressure >80 && this.bloodPressure <110 
                 && this.weightKgs >14 && this.weightKgs <18
                 && this.weightPounds >31 && this.weightPounds <40) {
    return true;
    }
         if (this.ageGroup >6 && this.ageGroup <12 
                 && this.respiratoryRate >20 && this.respiratoryRate <30 
                 && this.heartRate >70 && this.heartRate <110 
                 && this.bloodPressure >80 && this.bloodPressure <120 
                 && this.weightKgs >20 && this.weightKgs <42 
                 && this.weightPounds >41 && this.weightPounds <92) {
    return true;
    }
         if (this.ageGroup >13 && this.ageGroup <100 
                 && this.respiratoryRate >12 && this.respiratoryRate <20 
                 && this.heartRate >55 && this.heartRate <105 
                 && this.bloodPressure >110 && this.bloodPressure <120 
                 && this.weightKgs >50  
                 && this.weightPounds >110) {
    return true;
    }
    else 
         
             return false;
        
    

    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double ageGroup; double respiratoryRate; double heartRate; double bloodPressure; double weightKgs; double weightPounds;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the age of the child");
        ageGroup = Double.parseDouble(scan.nextLine());
        System.out.println("enter the Respiratory rate of the child");
        respiratoryRate = Double.parseDouble(scan.nextLine());
         System.out.println("enter the heart rate of the child");
        heartRate = Double.parseDouble(scan.nextLine());
         System.out.println("enter the blood pressure of the child");
        bloodPressure = Double.parseDouble(scan.nextLine());
         System.out.println("enter the weighth in kgs of the child");
        weightKgs = Double.parseDouble(scan.nextLine());
        System.out.println("enter the weighth in pounds of the child");
        weightPounds = Double.parseDouble(scan.nextLine());
        VitalSign vs = new VitalSign(ageGroup,respiratoryRate,heartRate,bloodPressure,weightKgs,weightPounds);
        Patient patient = new Patient(vs);
         
            System.out.println(patient.isPatientNormal());
    
    }

   
    
}
