
/**
 * Write a description of class AutoRickshaw here.
 *
 * @author (NP01CP4S220043 Kishan raj malla)
 * @version (1.0)
 */
class AutoRickshaw extends Vehicle // subclass AutoRickshaw
{
    private int engineDisplacement;
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;          // attributes of AutoRickShaw
    private int chargeAmount;
    private String bookedDate;
    private boolean isBooked;
    
    public AutoRickshaw(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed, int engineDisplacement, String torque, int fuelTankCapacity, String groundClerance)
    {
        super(vehicleID, vehicleName, vehicleColor, vehicleWeight); // calling the constructor of Vehicle class
        this.engineDisplacement = engineDisplacement; 
        this.torque = torque;
        this.fuelTankCapacity = fuelTankCapacity;
        this.groundClearance = groundClearance;       // constructor of auto rickshaw
        this.numberOfSeats = 0;
        this.bookedDate = "";
        this.chargeAmount = 0; 
        super.setVehicleSpeed(vehicleSpeed); // calling setVehicleSpeed() method from the vehicle class
        super.setVehicleColor(vehicleColor); // calling setVehicleColor() method from the vehicle class
        this.isBooked = false;
        
    }
    // accessor method of each attributes
    public int getEngineDisplacement(){
        return this.engineDisplacement;      
        
    }
    
    public String getTorque(){
        return this.torque;
        
    }
    
    public int getNumberOfseats(){
        return this.numberOfSeats;
        
    }
    
    public int getFuelTankCapacity(){
        return this.fuelTankCapacity;
        
    }
    
    public String getGroundClearance(){
        return this.groundClearance;
        
    }
    
    public int getChargeAmount(){
        return this.chargeAmount;
        
    }
    
    public String getBookedDate(){
        return this.bookedDate;
    }
    
    public boolean getisBooked(){
        return this.isBooked;
    }
    
    public void setChargeAmount(int newChargeAmount){ // mutator method to set the chargeAmount
        this.chargeAmount = newChargeAmount;
    
    }
    
    public void setNumberOfSeats(int newNumberOfSeats){//mutator method to the set the NumberOfSeats
        this.numberOfSeats = newNumberOfSeats;
       
    }
    
    public void bookAutoRickshaw(String bookedDate, int chargeAmount, int numberOfSeats){   //method to book autorickshaw
        if(!this.isBooked){
            this.bookedDate = bookedDate;
            setChargeAmount(chargeAmount); // calling setChargeAmount() method of same class
            setNumberOfSeats(numberOfSeats); // calling setNumberOfSeats() method of same class
            this.isBooked = true;
            System.out.println("your autorickshaw" + super.getVehicleID() +" is now booked");
        }else{
            System.out.println("Booking status: "+ this.isBooked);
            System.out.println("your autorickshaw" +super.getVehicleID() +"is already booked");
            
        }
        }
        
        public void display()
        {                                        //display method
            super.display();
            if(this.isBooked){
                System.out.println("Engine displacement: "+ getEngineDisplacement());
                System.out.println("Torque: "+ getTorque());
                System.out.println("Fuel Tank Capacity: "+ getFuelTankCapacity());
                System.out.println("BookedDate: "+ getBookedDate());
                System.out.println("Ground clearance:"+ getGroundClearance());
                
            }
            
            if(this.chargeAmount == 0){    //if charge amount is zero
                System.out.println("Charge Amount have not been set");
            }else{
                System.out.println("Charge amount: "+ getChargeAmount());   // if chargeamount is given
            }
            
            if(this.numberOfSeats == 0){
                System.out.println("number Of Not set");
            }else{
                System.out.println("number of seats: "+ getNumberOfseats());
                
            }
                
            }
            
        }
    
        

   

