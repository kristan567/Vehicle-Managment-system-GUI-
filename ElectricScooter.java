
/**
 * Write a description of class ElectricScooter here.                                           
 *
 * @author (NP01CP4S220043 Kishan raj malla)
 * @version (1.0)
 */
class ElectricScooter extends Vehicle
{
    private int range;          
    private int batteryCapacity;
    private int price;
    private String chargingTime;             //attributes of ElectricScooter
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    
    public ElectricScooter(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed, int batteryCapacity)
    {
        super(vehicleID, vehicleName, vehicleColor, vehicleWeight);   // calling the constructor of Vehicle class
        super.setVehicleSpeed(vehicleSpeed);    // calling SetVehicleSpeed(vehicleSpeed) from class Vehicle
        super.setVehicleColor(vehicleColor);    // calling SetVehicleColor(vehicleColor) from class Vehicle
        this.batteryCapacity = batteryCapacity;
        this.range = 0;                  // value is assigned to zero
        this.price = 0;                  // value is assigned to zero 
        this.brand = "";
        this.mileage = "";
        this.chargingTime = "";
        this.hasPurchased = false;        // value is assigned to false
        this.hasSold = false;             // value is assigned to false
    }
    
    // accessor method of each attributes
    
    public int getrange()
    {
        return this.range;
        
    }
    
    public int getBatteryCapacity(){
        return this.batteryCapacity;
        
    }
    
    public int getprice(){
        return this.price;
        
    }
    
    public String getChargingTime(){
        return this.chargingTime;
        
    }
    
    public String getBrand(){
        return this.brand;
        
    }
    
    public String getmileage(){
        return this.mileage;
        
    }
    
    public boolean getHasPurchased()
    {
        return this.hasPurchased;
        
    }
    
    public boolean getHasSold()
    {
        return this.hasSold;
        
    }
    
    
    public void setBrand(String newBrand)           //// mutator method to set the setbrand
    {
        if (!this.hasPurchased )
        {
            this.brand = newBrand;
        }else{
            System.out.println("it is not possible to change the brand.");
            
        }
    }
        
        
    public void purchase(String brand, int price, String chargingTime, String mileage, int range){       //method for the purchase of the scooter
                if(!this.hasPurchased)
                {
                setBrand(brand);
                this.price = price;
                this.chargingTime  = chargingTime;
                this.mileage = mileage;
                this.range =  range;
                this.hasPurchased = true;
            }else
            {
                System.out.println("The scooter"+super.getVehicleID()+" has already been purchased.");
                
            }
        }
        
        public void sell(int newPrice )                         //method to sell
        {
            
            if (this.hasPurchased){
                
                if(!this.hasSold){
                    this.price = newPrice;
                    this.range = 0;
                    this.chargingTime="";
                    this.mileage ="";
                    this.batteryCapacity = 0;
                    this.hasSold = true;
                    this.hasPurchased = false;
                }else{
                    System.out.println("the scooter is purchased");
                }
                
            }else {
                System.out.println("the scooter has not been purchased");
                
           }
            }
            
            
            
            public void display(){                                       // method to display
                super.display();
                if (this.hasPurchased){
                    System.out.println("Brand: "+ getBrand());
                    System.out.println("battery Capacity:" + getBatteryCapacity());
                    System.out.println("mileage; " + getmileage());
                    System.out.println("Recharge Time:" + getChargingTime());
                    
                }
            }
        }
    
        
    


