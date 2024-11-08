
/**
 * Write a description of class Vehicle here.
 *
 * @author (NP01CP4S220043 Kishan raj malla)
 * @version (1.0)
 */
public class Vehicle//super class vehicle
{
    private int vehicleID;
    private String vehicleName;
    private String vehicleWeight;        // attributes of the vehicle class
    private String vehicleColor;
    private String vehicleSpeed;
    
    public Vehicle(int vehicleID,String vehicleName, String vehicleColor, String vehicleWeight  ){// constructor
    this.vehicleID = vehicleID;
    this.vehicleName = vehicleName;           //constructor of vehicle class
    this.vehicleColor = vehicleColor;
    this.vehicleWeight = vehicleWeight;
    this.vehicleSpeed = "";
}

public int getVehicleID(){//accessor methods of vehicleID
    return vehicleID;   
}

public String getVehicleName(){//accessor methods of VehicleName
    return vehicleName;   
 }
 
public String getVehicleWeight(){//accessor methods of VehicleWeight
    return vehicleWeight;   
 }
 
public String getVehiclecolor(){//accessor methods of Vehiclecolor
     return vehicleColor;   
 }
 
public String getVehicleSpeed(){//accessor methods of VehicleSpeed
    return vehicleSpeed;
 }
     

public void setVehicleSpeed(String newSpeed){//mutator method to set the vehicleSpeed
    this.vehicleSpeed= newSpeed;    
}

public void setVehicleColor(String newColor)  //mutator method to set the vehicleColor
{
    this.vehicleColor = newColor;
}
    
// dispaly method
public void display(){
    System.out.println("VehicleID: "+ this.vehicleID);
    System.out.println("VehicleName:"+ this.vehicleName);
    System.out.println("Vehiclecolor:"+ this.vehicleColor);
    System.out.println("VehicleWeight:"+ this.vehicleWeight);
    System.out.println("VehicleSpeed:"+ this.vehicleSpeed);
    if(this.vehicleWeight == null || this.vehicleWeight.isEmpty()){
      System.out.println("vehicle weight is not defined");  
    }
}

}
    