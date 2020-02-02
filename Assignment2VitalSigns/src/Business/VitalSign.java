/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author shail
 */
public class VitalSign {


   
    
    private double ageGroup;
    private double respiratoryRate;
    private double heartRate;
    private double bloodPressure;
    
    private double weightKgs;
    private double weightPounds;

    VitalSign(double ageGroup, double respiratoryRate, double heartRate, double bloodPressure, double weightKgs, double weightPounds) {
        
       this.ageGroup = ageGroup;
       this.bloodPressure = bloodPressure;
       this.heartRate = heartRate;
       this.respiratoryRate = respiratoryRate;
       this.weightKgs = weightKgs;
       this.weightPounds = weightPounds;
       
    }
    
    

  

    public double getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(double ageGroup) {
        this.ageGroup = ageGroup;
    }

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

   
    public double getWeightKgs() {
        return weightKgs;
    }

    public void setWeightKgs(double weightKgs) {
        this.weightKgs = weightKgs;
    }

    public double getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(double weightPounds) {
        this.weightPounds = weightPounds;
    }
    

    /**
     * @param args the command line arguments
     */
    
    
}
