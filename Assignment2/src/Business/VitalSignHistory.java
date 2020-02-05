/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author shail
 */
public class VitalSignHistory {
    
    
     private ArrayList<VitalSign> vitalSignHistory;
 
    
    public VitalSignHistory()
{
   vitalSignHistory= new ArrayList<VitalSign>();
}


    
    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    
    public VitalSign addVitals()
    {
    VitalSign vs= new VitalSign();
    vitalSignHistory.add(vs);
    return vs;
    
}
      
    public void deleteVitals(VitalSign v){

        vitalSignHistory.remove(v);
        
    }
    
/*public ArrayList<VitalSign> getAbnormalList(){
    ArrayList<VitalSign> list = new ArrayList<VitalSign>();
       for (VitalSign vs : this.getVitalSignHistory()) {
          if (vs.getAgeGroup() >0 && vs.getAgeGroup() <0.1 && vs.getRespiratoryRate() >30 && 
                  vs.getRespiratoryRate() <50 && vs.getHeartRate() >120 && vs.getHeartRate() <150 &&
                  vs.getBloodPressure() >50 && vs.getBloodPressure() <70 && vs.getWeightKgs() >2 && 
                  vs.getWeightKgs() <3 && vs.getWeightPounds() >4.5 && vs.getWeightPounds() <7) {
             list.add(vs) ;
            
           }
            
       }
       return list;
}*/


    public boolean findNormality(VitalSign vs) {
        
        
             if (vs.getAgeGroup() >0 && vs.getAgeGroup() <0.1 
                 && vs.getRespiratoryRate() >20 && vs.getRespiratoryRate() <30 
                 && vs.getHeartRate() >80 && vs.getHeartRate() <140 
                 && vs.getBloodPressure() >70 && vs.getBloodPressure() <100 
                 && vs.getWeightKgs() >2 && vs.getWeightKgs() <3
                 && vs.getWeightPounds() >4.5 && vs.getWeightPounds() <7) {
              
           return true;    
           }
             
            if (vs.getAgeGroup() >0.1 && vs.getAgeGroup() <1 
                 && vs.getRespiratoryRate() >30 && vs.getRespiratoryRate() <50 
                 && vs.getHeartRate() >120 && vs.getHeartRate() <150 
                 && vs.getBloodPressure() >50 && vs.getBloodPressure() <70 
                 && vs.getWeightKgs() >4 && vs.getWeightKgs() <10
                 && vs.getWeightPounds() >9 && vs.getWeightPounds() <22){
              
           return true;    
           }
            
            if (vs.getAgeGroup() >1 && vs.getAgeGroup() <3
                 && vs.getRespiratoryRate() >20 && vs.getRespiratoryRate() <30 
                 && vs.getHeartRate() >80 && vs.getHeartRate() <130 
                 && vs.getBloodPressure() >80 && vs.getBloodPressure() <110 
                 && vs.getWeightKgs() >10 && vs.getWeightKgs() <14
                 && vs.getWeightPounds() >22 && vs.getWeightPounds() <31){
              
           return true;    
           }
            
            if (vs.getAgeGroup() >3 && vs.getAgeGroup() <5 
                 && vs.getRespiratoryRate() >20 && vs.getRespiratoryRate() <30 
                 && vs.getHeartRate() >80 && vs.getHeartRate() <120 
                 && vs.getBloodPressure() >80 && vs.getBloodPressure() <110 
                 && vs.getWeightKgs() >14 && vs.getWeightKgs() <18 
                 && vs.getWeightPounds() >31 && vs.getWeightPounds() <40){
              
           return true;    
           }
            
            if (vs.getAgeGroup() >6 && vs.getAgeGroup() <12
                 && vs.getRespiratoryRate() >20 && vs.getRespiratoryRate() <30 
                 && vs.getHeartRate() >70 && vs.getHeartRate() <110 
                 && vs.getBloodPressure() >80 && vs.getBloodPressure() <120 
                 && vs.getWeightKgs() >20 && vs.getWeightKgs() <42 
                 && vs.getWeightPounds() >41 && vs.getWeightPounds() <92){
              
           return true;    
           }
            
            if (vs.getAgeGroup() >13 
                 && vs.getRespiratoryRate() >12 && vs.getRespiratoryRate() <20 
                 && vs.getHeartRate() >55 && vs.getHeartRate() <105 
                 && vs.getBloodPressure() >110 && vs.getBloodPressure() <120 
                 && vs.getWeightKgs() >50  
                 && vs.getWeightPounds() >110 ){
              
           return true;    
           }
            
            
            
            
        else{
       return false;
        }
        }
}

