
/**
 * Write a description of class AutoRickshawGUI here.
 *
 * @author ( np01cp4s220043_kishan Raj Malla)
 * @version (1.0)
 */
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class TransportGUI implements ActionListener
{
    //arraylsit named as ar_list,all the data are saved in this array
    ArrayList<Vehicle> ar_list = new ArrayList<Vehicle>();
    
    String[] year={"1st","2nd","3rd","4th",};
    String[] year1={"1995","1996","1997","1998","1999","2000","2001","2002",};                //for combo box
    String[] months= {"January","Febuary","March","April","May","June","July","August","September","October","November","December"}; 
    
   //attributes of frame and panel with button of main frame 
   private JFrame mainFrame;
   private JPanel mainPanel;
   private JLabel chooseVehicle;
   private JButton autoRickshawBtn;
   private JButton electricScooterBtn;
   
   //attributes of Frame and panel of GUI()   
   private JFrame Frame;
   private JPanel AutoRickshaw;
   private JPanel Panel;
   private JPanel panel2;
   private JPanel change;
   
   //attributes of the tite "AutoRickshaw" 
   private JLabel title;
   
   //attributes of all the label addded in the panel2 GUI
   private JLabel desc; 
   private JLabel vehicleID;
   private JLabel vehiclename;
   private JLabel l4;
   private JLabel l5;
   private JLabel vehicleSpeed;
   private JLabel EngineDisplacemnet;
   private JLabel torque;
   private JLabel fueltankcapacity;
   private JLabel groundclerance;
   
   //atributes of all the textfield added in the panel2 GUI
   private JTextField vehicleIDt;
   private JTextField vehiclenamet;
   private JTextField vehicleweightt;
   private JTextField vehiclecolort;
   private JTextField vehicleSpeedt;   
   private JTextField engineDisplacemnett;
   private JTextField torquet;
   private JTextField fueltankcapacityt;
   private JTextField groundclerancet;
   
   //attributes of all the button added in the panel2 GUI
   private JButton B1;
   private JButton B2;
   
   //attributes of all the label added in the panel3 GUI
   private JLabel bookAuto;
   private JLabel vid;
   private JLabel bd;
   private JLabel cha;
   private JLabel nos;
   
   //attributes of all the rexrfield and combo box added in the panel3 GUI
   private JTextField vidt;
   private JComboBox box1;
   private JComboBox box2;
   private JComboBox box3;
   private JTextField chat;
   private JTextField nost;
   
   //attributes of all the button added in the panel3 GUI
   private JButton b3;
   private JButton b4;
   
   
   
   //attributes of all the button added in the panel4 GUI
   private JButton b5;
   private JButton b6;
   private JButton b7;
   
   
   
   public void mainGUI(){
                                                              //main frame
      mainFrame =  new JFrame("Transport GUI");
      mainFrame.setBounds(350, 350, 700, 300);
      
                                                                          //main frame's panel
      mainPanel = new JPanel();
      mainPanel.setLayout(null);

                                                                                  //choose Vehicle label
      chooseVehicle = new JLabel("Vehicles");
      chooseVehicle.setBounds(300, 20, 400, 50 );
      chooseVehicle.setFont(new Font("Arial", Font.BOLD, 20));

                                                                                  //autoRickshaw button
      autoRickshawBtn = new JButton("Auto-Rickshaw");
      autoRickshawBtn.setBounds(100, 120, 200, 50);
      autoRickshawBtn.addActionListener(this);

                                                                                  //electricscooter button
      electricScooterBtn = new JButton("Electric-Scooter");
      electricScooterBtn.setBounds(350, 120, 200, 50);
      electricScooterBtn.addActionListener(this);

      mainPanel.add(chooseVehicle);
      mainPanel.add(autoRickshawBtn);
      mainPanel.add(electricScooterBtn);
      mainFrame.add(mainPanel);
      mainFrame.setResizable(false);
      mainFrame.setVisible(true);

   }

   
   
   
   
   public void GUI()
   {                                                                            //autorickshaw frame
        Frame = new JFrame("transport GUI");
        Frame.setBounds(142,50,1000,780);
        Frame.setLayout(null);
                                                                           //panel for the title
        AutoRickshaw = new JPanel();
        AutoRickshaw.setBounds(360,50,300,40);
        AutoRickshaw.setLayout(null);
                                                                            //panel for description of the vehicle
        Panel = new JPanel();
        Panel.setBounds(40,120,450,600);       
        Panel.setBackground(new Color(229,255,204));
        Panel.setLayout(null);
                                                                           //panel for bookAutorickshaw
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(530,120,400,350);
        panel2.setBackground(Color.decode("#99D4DF"));
                                                            //all the buuton added here fro change
        change = new JPanel();
        change.setLayout(null);
        change.setBounds(530,500,400,250);
                                                                //label for the title 
        title = new JLabel("Auto Rickshaw");
        title.setBounds(0,0,290,40);
        title.setFont(new Font("Arial", Font.BOLD, 30));
                                                                //label for the "description"
        desc = new JLabel("DESCRIPTION");
        desc.setBounds(150,20,150,40);
        desc.setFont(new Font("Arial", Font.BOLD, 20));
                                                    //label for "vehicleID"
        vehicleID =  new JLabel();
        vehicleID.setBounds(40,80,80,50);
        vehicleID.setText("vehicle ID");
                                                    //label for "vehiclename"
        vehiclename = new JLabel();
        vehiclename.setBounds(40,130,80,50);
        vehiclename.setText("vehicle name");
                                                        //label for "vehicleweight"
        l4 = new JLabel();
        l4.setBounds(40,180,90,50);
        l4.setText("vehicle weight");
                                                //label for "vehicle color"
        l5 = new JLabel();
        l5.setBounds(40,230,80,50);
        l5.setText("vehicle color"); 
                                                            //labell for "vehicle speed"
        vehicleSpeed =new JLabel();
        vehicleSpeed.setBounds(40,280,90,50);
        vehicleSpeed.setText("Vehicle Speed");
                                                            //label for "enginedisplacment"
        EngineDisplacemnet = new JLabel();
        EngineDisplacemnet.setBounds(40,330,120,50);
        EngineDisplacemnet.setText("EngineDisplacement");
                                                            //label for "torque"
        torque = new JLabel();
        torque.setBounds(40,380,80,50);
        torque.setText("torque"); 
                                                            //label for "fuel tank cpacity"
        fueltankcapacity = new JLabel();
        fueltankcapacity.setBounds(40,430,120,50);
        fueltankcapacity.setText("Fuel Tank Capacity");
                                                                //"ground clearance"
        groundclerance = new JLabel();
        groundclerance.setBounds(40, 480,120,50);
        groundclerance.setText("Ground Clearance");
         
        //textfield for vehicleID
        vehicleIDt= new JTextField();
        vehicleIDt.setBounds(180,90,200,30);
                                                                //textfield for vehicle name
        vehiclenamet= new JTextField();
        vehiclenamet.setBounds(180,140,200,30);
                                                            //textfield for vehicle weight
        vehicleweightt = new JTextField();
        vehicleweightt.setBounds(180,190,200,30);
                                                            //textfield for vehicle color
        vehiclecolort= new JTextField();
        vehiclecolort.setBounds(180,240,200,30);
                                                    //textfield for vehicle speed
        vehicleSpeedt = new JTextField();
        vehicleSpeedt.setBounds(180,290,200,30);
                                                            //textfield for engineDisplacemnett 
        engineDisplacemnett = new JTextField();
        engineDisplacemnett.setBounds(180,340,200,30);
                                                            //engineDisplacemnett textfield
        torquet = new JTextField();
        torquet.setBounds(180,390,200,30);
                                                            // textfield fueltankcapacityt
        fueltankcapacityt = new JTextField();
        fueltankcapacityt.setBounds(180,440,200,30);
                                                                        //TextField groundclerancet 
        groundclerancet = new JTextField();
        groundclerancet.setBounds(180,490,200,30);
        
                                                            //button for add of description
        B1 = new JButton("Add");
        B1.setBounds(40,550,150,40);
                                                                //button fror clear of description
        B2 = new JButton("Clear");
        B2.setBounds(240,550,150,40);
        
        
        
        
                                                                    //title for bookautorickshaw panel 3
        bookAuto = new JLabel("Book AutoRickshaw");
        bookAuto.setBounds(20,30,300,40);
        bookAuto.setFont(new Font("Arial", Font.BOLD, 20));
        
        vid = new JLabel();
        vid.setBounds(40,80,80,50);
        vid.setText("Vehicle ID");
        
        bd =new JLabel();
        bd.setBounds(40,130,80,50);
        bd.setText("Booked Date");
                                                             //labels added in the panel3 to bookAutorickshaw
        cha = new JLabel();
        cha.setBounds(40,180,100,50);
        cha.setText("Charge Amount");
        
        nos = new JLabel();
        nos.setBounds(40,230,100,50);
        nos.setText(" No of Seats");
        
        vidt = new JTextField();
        vidt.setBounds(150,90,200,30);                    //textfield and combo box to book autorickshaw in the panel3
        
        box1 = new JComboBox(year);
        box1.setBounds(150,140,50,25);
        
        box2 = new JComboBox(year1);
        box2.setLayout(null);
        box2.setBounds(300,140,50,25);
        
        box3 = new JComboBox(months);
        box3.setBounds(210,140,80,25);
        
        chat = new JTextField();                                            //textfield and combo box to book autorickshaw in the panel3
        chat.setBounds(150,190,200,30);
        
        nost = new JTextField();
        nost.setBounds(150,240,200,30);
        
        b3 = new JButton("Clear");
        b3.setBounds(240,300,120,40);                         //button for clear in in bookautorickshaw
        
        b4 = new JButton("Book");
        b4.setBounds(50,300,120,40);
        
        
        
        
        b5 = new JButton(" Change for Electric Scooter");
        b5.setBounds(0,0,400,50);
        
        b6 =  new JButton(" Go BAck");
        b6.setBounds(0,80,400,50);                                                   //panel4 where all the button are added to change frame
        
        b7 =  new JButton("Display");
        b7.setBounds(0,160,400,50);
        
        
        
        
        
        
        
        
        
        
   
        
        
        B1.addActionListener(this);
        B2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);                           //actionlistener is added in the button
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        AutoRickshaw.add(title);
        Panel.add(desc);
        Panel.add(vehicleID);
        Panel.add(vehiclename);
        Panel.add(l4);
        Panel.add(l5);                                      //labels added in the panel
        Panel.add(vehicleSpeed);
        Panel.add(EngineDisplacemnet);
        Panel.add(torque);
        Panel.add(fueltankcapacity);
        Panel.add(groundclerance);
        
        Panel.add(vehicleIDt);
        Panel.add(vehiclenamet);
        Panel.add(vehicleweightt);
        Panel.add(vehiclecolort);
        Panel.add(vehicleSpeedt);                          //TextField added in the panel
        Panel.add(engineDisplacemnett);
        Panel.add(torquet);
        Panel.add(fueltankcapacityt);
        Panel.add(groundclerancet);
        
        Panel.add(B1);
        Panel.add(B2);                                         //buttons added in the panel 
        
        
        panel2.add(bookAuto);
        panel2.add(vid);
        panel2.add(bd);                                        //labels added in the panel2 
        panel2.add(cha);
        panel2.add(nos);
        
        panel2.add(vidt);
        panel2.add(box1);
        panel2.add(box2);
        panel2.add(box3);                                      //textfield  adn combo box added in the panel2
        panel2.add(chat);
        panel2.add(nost);
        
        
        panel2.add(b3);                                          //buttons added in the panel
        panel2.add(b4);                                          
        
        
        
        change.add(b5);
        change.add(b6);                                        //buttons added in the panel4
        change.add(b7);
        

        
        
        
        
        Frame.add(panel2);
        Frame.add(AutoRickshaw);
        Frame.add(Panel);                                             //panel, panel2,panel3,panel4 added in the frame
        Frame.add(change);
        Frame.setVisible(true);
        Frame.setResizable(false);

    }
    
    
    
    
    
    
   private JFrame eleframe; 
   private JPanel elepanel1;
   private JPanel elepanel2;                                  //attributes of the frame and the panel of the method GUI2()
   private JPanel elepanel3;
   private JPanel elepanel4;

   
   
   
   private JLabel eletitle;
   private JButton elebutton;                                 //attributes of the buttons that are added in the frame;
   private JButton elegoback;
   private JButton eledisplay;
   
   
   
   private JLabel eledesc;
   private JLabel elevehicleID;
   private JLabel elevehiclename;                             //attributes of the label added in the panel2 
   private JLabel elevehicleweight;
   private JLabel elevehiclecolor;
   private JLabel elevehiclespeed;
   private JLabel elebatterycapacity;
   
   private JTextField elevehicleIDt;
   private JTextField elevehiclenamet;
   private JTextField elevehicleweightt;                      // attributes of the TExtfield that are addded in the panel2
   private JTextField elevehiclecolort;
   private JTextField elevehicleSpeedt; 
   private JTextField elebatterycapacityt;
   
   private JButton eleb1;
   private JButton eleb2;                                       //attributes of the buttons that are added in the panel2 and buttons for add and clear  
   
   
   
   
   
   private JLabel sell;
   private JLabel sellid;                                       //attributes of the label added that are in the panel3
   private JLabel price;
   
   private JTextField sellidt;
   private JTextField pricet;                                   //attributes of the TextField that are added in the panel3
   
   private JButton sellb;
   private JButton priceb;                                      //buttons for the panel3 "add" and "clear"
   
   
   
   
   
   private JLabel purvid;
   private JLabel purbrand;
   private JLabel purprice;                                  //attributes of the label whhich is added in the panel4
   private JLabel purcharging;
   private JLabel mileage;
   private JLabel purrange;
   
   private JTextField purvidt ;
   private JTextField purbrandt;
   private JTextField purpricet;                             //attributes of the textfield which is added in the panel4 or purchase 
   private JTextField purchargingt;
   private JTextField mileaget;
   private JTextField purranget;
   
   private JButton purchaseb;
   private JButton purclear;                                //attributs of the button which is added in the panel4
   
   

   public void GUI2(){                                    //method is created
       
       eleframe = new JFrame("Electric-Scooter");
       eleframe.setBounds(142,50,1000,780);                            //frame for the electricscooter
       eleframe.setLayout(null);

       
       elebutton = new JButton("Go to AutoRickshaw");
       elebutton.setBounds(0,520,270,250);
       
       elegoback = new JButton("Go back");                            //buttons added in the frame 
       elegoback.setBounds(720,520,270,250);
       
       eledisplay =  new JButton("Display");
       eledisplay.setBounds(800,20,150,50);
       
       
       
       elepanel1 = new JPanel();
       elepanel1.setBounds(360,20,400,40);                              //panel1 fot the topic or title
       elepanel1.setLayout(null);
       
       
       elepanel2 = new JPanel();
       elepanel2.setBounds(0,70,500,450);                              
       elepanel2.setLayout(null);                                            //panel2 for the desc
       elepanel2.setBackground(Color.decode("#EBE4AC"));
       
       elepanel3 = new JPanel();
       elepanel3.setBounds(270,520,450,250);                                 //panel3 to sell the electric scooter
       elepanel3.setLayout(null);
       elepanel3.setBackground(Color.decode("#2BEBB8"));
       
       elepanel4 = new JPanel();
       elepanel4.setBounds(500,70,500,450);
       elepanel4.setLayout(null);                                               //panel4 to purchase the electricscooter
       elepanel4.setBackground(Color.decode("#878782"));
       
       
       
       
       
       
       

       
       eletitle = new JLabel("ElectricScooter");
       eletitle.setBounds(0,0,250,30);
       eletitle.setFont(new Font("Arial", Font.BOLD, 30));                       //label for the title "electricScooter"
        
        
        
        
        
        
        eledesc = new JLabel("Description");
        eledesc.setBounds(190,20,350,50);
        eledesc.setFont(new Font("Arial", Font.BOLD, 20));                        //label for the description tite in the panel2 or add type or electric 
       
        elevehicleID =  new JLabel();
        elevehicleID.setBounds(40,80,80,50);                                        //label for the vehicleID in the panel2 or add type or electric
        elevehicleID.setText("vehicle ID");
        
        elevehiclename = new JLabel();
        elevehiclename.setBounds(40,130,80,50);                                      //label for the vehicleName in the panel2 or add type or electric
        elevehiclename.setText("vehicle name");

        elevehicleweight = new JLabel();
        elevehicleweight.setBounds(40,180,90,50);                                   //label for the vehicleweight in the panel2 or add type or electric
        elevehicleweight.setText("vehicle weight");
        
        elevehiclecolor = new JLabel();
        elevehiclecolor.setBounds(40,230,80,50);                                  //label for the vehiclecolor in the panel2 or add type or electric
        elevehiclecolor.setText("vehicle color"); 
        
        elevehiclespeed =new JLabel();
        elevehiclespeed.setBounds(40,280,90,50);                                 //label for the vehiclespeed in the panel2 or add type or electric
        elevehiclespeed.setText("Vehicle Speed");
        
        elebatterycapacity = new JLabel();
        elebatterycapacity.setBounds(40,330,110,50);                            //label for the vehiclespeed in the panel2 or electric or add
        elebatterycapacity.setText("Battery Capacity");
        
        
        
        elevehicleIDt= new JTextField();
        elevehicleIDt.setBounds(180,90,250,30);                
       
        elevehiclenamet= new JTextField();
        elevehiclenamet.setBounds(180,140,250,30);
        
        elevehicleweightt = new JTextField();
        elevehicleweightt.setBounds(180,190,250,30);
       
        elevehiclecolort= new JTextField();                                         //TextField added in the panel2 for electricscooter description
        elevehiclecolort.setBounds(180,240,250,30);
        
        elevehicleSpeedt = new JTextField();
        elevehicleSpeedt.setBounds(180,290,250,30);
        
        elebatterycapacityt = new JTextField();
        elebatterycapacityt.setBounds(180,340,250,30);
        
        
        eleb1  = new JButton("add");
        eleb1.setBounds(50,390,120,50);
                                                                                 //buttons added in the panel2 for the electricscooter description
        eleb2 =  new JButton("Clear");
        eleb2.setBounds(310,390,110,50);
        
        
        
        sell = new JLabel();
        sell.setBounds(100,20,200,50);
        sell.setText("Sell Ellectric_scooter");                                //label added for title  in the panel3 or sell  
        sell.setFont(new Font("Arial", Font.BOLD, 15));
        
        sellid = new JLabel();
        sellid.setBounds(30,60,60,50);
        sellid.setText("VehicleID");                                        //label added for sellid in the panel3 or sell
        
        price = new JLabel();
        price.setBounds(30,110,60,50);                                     //label added for price in the panel3 or sell
        price.setText("Price");                     
        
        sellidt = new JTextField();
        sellidt.setBounds(100,70,250,30);
        
        pricet = new JTextField();
        pricet.setBounds(100,120,250,30);
                                                                //TextField for all label present in the panel3 or sell
        sellb = new JButton();
        sellb.setBounds(30,160,150,50);
        sellb.setText("Sell");
        
        priceb = new JButton();                             //buttons for the sell 
        priceb.setBounds(250,160,150,50);
        priceb.setText("Clear");
        
        
        
        
        
        purvid = new JLabel();
        purvid.setBounds(40,80,80,50);
        purvid.setText("Vehicle ID");
        
        purbrand = new JLabel();
        purbrand.setBounds(40,130,80,50);
        purbrand.setText("Brand");
        
        purprice = new JLabel();
        purprice.setBounds(40,180,90,50);                       //label added in the panel4 or purchase
        purprice.setText("Price");
        
        purcharging = new JLabel();
        purcharging.setBounds(40,230,250,50);
        purcharging.setText("Charging Time");
        
        mileage = new JLabel();
        mileage.setBounds(40,280,90,50);
        mileage.setText("Mileage");
        
        purrange = new JLabel();
        purrange.setBounds(40,330,250,50);
        purrange.setText("Range");
        
        
        purvidt = new JTextField();
        purvidt.setBounds(180,90,250,30);                         //textfield added in the panel4 or purchase
        
        purbrandt= new JTextField();
        purbrandt.setBounds(180,140,250,30);
        
        purpricet = new JTextField();
        purpricet.setBounds(180,190,250,30);
                                                                 //textfield added in the panel4 or purchase
        purchargingt= new JTextField();
        purchargingt.setBounds(180,240,250,30);
        
        mileaget = new JTextField();
        mileaget.setBounds(180,290,250,30);
        
        purranget = new JTextField();
        purranget.setBounds(180,340,250,30);                     
        
        purchaseb = new JButton("Purchase");
        purchaseb.setBounds(40,390,110,50);
        
        purclear = new JButton("Clear");                           //button added in the panel4 fro the purchase and clear 
        purclear.setBounds(310,390,110,50);
        
        
        

        

        
       elepanel1.add(eletitle); 
        
       elepanel2.add(eledesc); 
       elepanel2.add(elevehicleID);
       elepanel2.add(elevehiclename);
       elepanel2.add(elevehicleweight);                         //label added in the panel2 or in description  
       elepanel2.add(elevehiclecolor);
       elepanel2.add(elevehiclespeed); 
       elepanel2.add(elebatterycapacity);
       
       
       elepanel2.add(elevehicleIDt);
       elepanel2.add(elevehiclenamet);
       elepanel2.add(elevehicleweightt);                      //Textfield added in the panel2 or in the description 
       elepanel2.add(elevehiclecolort);
       elepanel2.add(elevehicleSpeedt);
       elepanel2.add(elebatterycapacityt);
        
       elepanel2.add(eleb1);                                
       elepanel2.add(eleb2);                                   //button added in the panel2 or in the description
        
        
        
        
       eleb1.addActionListener(this);
       eleb2.addActionListener(this); 
       sellb.addActionListener(this);
       priceb.addActionListener(this);
       purchaseb.addActionListener(this);
       purclear.addActionListener(this);
       elebutton.addActionListener(this);       
       elegoback.addActionListener(this);
       eledisplay.addActionListener(this);
       
       
        
        
        
        
        
       elepanel3.add(sell);
        elepanel3.add(sellid);
        elepanel3.add(price);                                         //label added in the elepanel3 or sell 
        
        elepanel3.add(sellidt);
        elepanel3.add(pricet);                                        //TextField added in the elepanel3 or sell
        
        elepanel3.add(sellb);
        elepanel3.add(priceb);                                       //button added in the elepanel3 or sell
        
        
        
       elepanel4.add(purvid);
       elepanel4.add(purbrand);                                    //label added in the elepanel4 or purchase
       elepanel4.add(purprice);
       elepanel4.add(purcharging);
       elepanel4.add(mileage);
       elepanel4.add(purrange);
        
       elepanel4.add(purvidt); 
       elepanel4.add(purbrandt); 
       elepanel4.add(purpricet);                                   //textfield added in the elepanel4 or purchase
       elepanel4.add(purchargingt);
       elepanel4.add(mileaget);
       elepanel4.add(purranget);
           
       elepanel4.add(purchaseb);
       elepanel4.add(purclear);                                    //buttons added in the elepanel4 or purchase
       
       
       
       
        
        
        
    
       eleframe.add(elebutton);
       eleframe.add(elegoback);                                //buttons added in the eleframe
       eleframe.add(eledisplay);
        
       eleframe.setVisible(true);
       eleframe.add(elepanel1);
       eleframe.add(elepanel2); 
       eleframe.add(elepanel3);                                   //panel1, panel2, panel3,panel4,panel4 added in the frame
       eleframe.add(elepanel4);
       
       
   }
    
   public void actionPerformed(ActionEvent e){
       
        if (e.getSource() == autoRickshawBtn){                          //buttons in the mainGUI
           GUI();
           mainFrame.setVisible(false);
        }
        
        if (e.getSource() == electricScooterBtn){                       //buttons in the mainGUI
            GUI2();
            mainFrame.setVisible(false);
        }
        
        if(e.getSource()== B1){
            boolean duplicate = false;
            try{//for exception haldling
            for(Vehicle vehicle: ar_list){
                if(vehicle.getVehicleID() == Integer.parseInt(vehicleIDt.getText()) && vehicle instanceof AutoRickshaw){
                    duplicate=true;
                }
            }

            if (duplicate == false){                                                //
                int vehicleID = Integer.parseInt(vehicleIDt.getText());
                
                String vehicleName = vehiclenamet.getText();
                
                String vehicleWeight = vehicleweightt.getText();
                
                String vehicleColor = vehiclecolort.getText();
                
                String vehicleSpeed = vehicleSpeedt.getText();
                
                int engineDisplacement = Integer.parseInt(engineDisplacemnett.getText());
                
                String torque = torquet.getText();
                
                int fuelTankCapacity = Integer.parseInt(fueltankcapacityt.getText());
                              
                String groundClerance = groundclerancet.getText();
                
                AutoRickshaw input =new AutoRickshaw(vehicleID,vehicleName,vehicleWeight,vehicleColor,vehicleSpeed,engineDisplacement,torque,fuelTankCapacity,groundClerance);
                ar_list.add(input);
                
                JOptionPane.showMessageDialog(Panel, "successfully added");        
                
            }
            else{
            JOptionPane.showMessageDialog(Panel, "can't add");
            }
        }   
            catch(NumberFormatException ne){ //this code runs if exception is shown in try block
            JOptionPane.showMessageDialog(Panel, ne.getMessage(),"Empty Field",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(e.getSource()==B2)    //when clear button is clicked in the panel2 "desc" then a action is trigered where all the fields are changed with empty field
        {
            vehicleIDt.setText("");
            vehiclenamet.setText("");
            vehicleweightt.setText("");
            vehiclecolort.setText("");
            vehicleSpeedt.setText("");
            engineDisplacemnett.setText("");
            torquet.setText("");
            fueltankcapacityt.setText("");
            groundclerancet.setText("");         
        }
        
        if(e.getSource()== b3){
            vidt.setText("");
            chat.setText("");
            nost.setText("");
        }
        
        
        if(e.getSource()== b4 ){
            try{
                
            
            int vid = Integer.parseInt(vidt.getText());
            int cha = Integer.parseInt(chat.getText());
            int nos = Integer.parseInt(nost.getText());
            String bo = box1.getSelectedItem().toString();
            String bo2 = box2.getSelectedItem().toString();
            String bo3 = box3.getSelectedItem().toString();
            String date = bo + bo2 + bo3;
            
            boolean bookhave = false;
            for(Vehicle obj1 : ar_list){
                
                if(obj1 instanceof AutoRickshaw) {
                   
                    AutoRickshaw auto_obj= (AutoRickshaw) obj1;
                  
                    if(auto_obj.getVehicleID()==vid){
                        if(auto_obj.getisBooked() == false){
                            auto_obj.bookAutoRickshaw(date, cha, nos);
                            JOptionPane.showMessageDialog(panel2,"booked date:"+date + "\ncharge amount:"+cha + "\nno of  seats:"+nos);
                            
                        }
                        else{
                        JOptionPane.showMessageDialog(panel2,"This vehicle has been already been boooked");
                        }
                        bookhave = true;
                        break;
                                                
                    }   else{
                        bookhave = false;
                    }
                }
            }
            if(bookhave == false){
                JOptionPane.showMessageDialog(panel2, "Sorry! We dont have the vehicle");
            }
            }catch(NumberFormatException ne){ //this code runs if exception is shown in try block
                JOptionPane.showMessageDialog(panel2,"some field are empty ");
            
            }
        }
        
        if(e.getSource() == b5){                    //button for the change in the frame into electricscooter
            GUI2();
            Frame.setVisible(false);
        }
             
        if(e.getSource() == b6){                    
            mainGUI();                                       //button for "go back" in the autorickshaw Frame
            Frame.setVisible(false);
        }
        
        if(e.getSource() == b7)
        {
            for(Vehicle obj: ar_list){
                if(obj instanceof AutoRickshaw){
                AutoRickshaw autoobj = (AutoRickshaw) obj;  
                    autoobj.display();
                }
            }//button for display in the autorickshaw 
        }
        

        

          

        
        if(e.getSource() == eledisplay)
        {
            for(Vehicle obj2: ar_list){
                if(obj2 instanceof ElectricScooter){
                ElectricScooter eleobj = (ElectricScooter) obj2 ;   
                    eleobj.display();
                }
            }//button for display in the ElectricScooter
        }
        
        if(e.getSource() == elebutton){                                               //this button is used to change frame into autprickshaw
            GUI();
            eleframe.setVisible(false);
        }
        
        if(e.getSource() == elegoback){                                                      //this button is used to change the frame to mainGUI
            mainGUI();
            eleframe.setVisible(false);
        }
        
        //electricscooter backend
        if(e.getSource()== eleb1 ){
            boolean duplicate = false;
            try{ 
            for(Vehicle purchase: ar_list){
                if(purchase.getVehicleID() == Integer.parseInt(elevehicleIDt.getText()) && purchase instanceof ElectricScooter){
                    duplicate=true;
                }
            }

            if (duplicate == false){
                int elevehicleID = Integer.parseInt(elevehicleIDt.getText());
                
                String elevehicleName = elevehiclenamet.getText();
                
                String elevehicleWeight = elevehicleweightt.getText();
                
                String elevehicleColor = elevehiclecolort.getText();
                
                String elevehicleSpeed = elevehicleSpeedt.getText();
                
                int elebatterycapacity = Integer.parseInt(elebatterycapacityt.getText());
                
                ElectricScooter addinput2 =new ElectricScooter(elevehicleID,elevehicleName,elevehicleWeight,elevehicleColor,elevehicleSpeed,elebatterycapacity);
                ar_list.add(addinput2);
                
                JOptionPane.showMessageDialog(elepanel2, "successfully added");        
                
            } 
            else{
                JOptionPane.showMessageDialog(elepanel2, "can not add duplicate values");
                }
            }
                        
            catch(NumberFormatException ne){
                    JOptionPane.showMessageDialog(elepanel2, ne.getMessage(),"Empty Field",JOptionPane.ERROR_MESSAGE);
                }    
        } 
        
        if(e.getSource()== eleb2)// clears each field 
        {
            elevehicleIDt.setText("");
            elevehiclenamet.setText("");
            elevehicleweightt.setText("");
            elevehiclecolort.setText("");
            elevehicleSpeedt.setText("");
            elebatterycapacityt.setText("");
            JOptionPane.showMessageDialog(elepanel2,"field cleared");
            
        }
        
        if(e.getSource()== purchaseb ){
            try{  //for exception haldling
                int purvid = Integer.parseInt(purvidt.getText());
                String purbrand  = (purbrandt.getText());
                int purprice= Integer.parseInt(purpricet.getText());
                String purcharging = purchargingt.getText();
                String mileage = mileaget.getText();
                int purrange = Integer.parseInt(purranget.getText());
                
                boolean have = false;
                
                for(Vehicle obj: ar_list){
                    if(obj instanceof ElectricScooter){
                        ElectricScooter eleObj = (ElectricScooter) obj;
                        
                        if(eleObj.getVehicleID() == purvid){
                            if(eleObj.getHasPurchased() == false){
                                eleObj.purchase(purbrand, purprice, purcharging, mileage, purrange);
                                JOptionPane.showMessageDialog(elepanel4,"Scooter has been Purchased for Vehicle ID: " + purvid +"\nBrand: " + purbrand + "price" + purprice + "charging amount" + "Mileage" + mileage +  purcharging + "purrange" + purrange);
                            }else{
                                JOptionPane.showMessageDialog(elepanel4, "This vehicle has already been purchased!");
                            }
                            have = true;
                            break;
                        }else{
                            have = false;
                        }
                    }
                }
                
                if(have == false){
                    JOptionPane.showMessageDialog(elepanel4, "Sorry! We dont have the vehicle");
                }
            }
            catch(NumberFormatException ne){
                JOptionPane.showMessageDialog(elepanel4, "Enter correct values!!");
            }    
        }
        
        if(e.getSource() == purclear){            //when clear button is cleared is clicked in the purchase panel then all field is cleared 
            purvidt.setText("");
            purbrandt.setText("");
            purpricet.setText("");
            purchargingt.setText("");
            mileaget.setText("");
            purranget.setText("");
            JOptionPane.showMessageDialog(elepanel3,"purchase field cleared");
        }
        
        if(e.getSource() == priceb){             //button to priceb
            sellidt.setText("");
            pricet.setText("");
            JOptionPane.showMessageDialog(elepanel3,"field cleared");
        }
        

        if(e.getSource() == sellb){
            try{                             //for exception haldling
            int sellid = Integer.parseInt(sellidt.getText());
            int price = Integer.parseInt(pricet.getText());
            
            boolean sellhave = false;
            
            for(Vehicle sell :ar_list){
                if(sell instanceof ElectricScooter){
                    ElectricScooter elesell= (ElectricScooter) sell;
                    
                    if(elesell.getVehicleID() == sellid){
                          if(elesell.getHasSold() == false){
                              elesell.sell(price);
                              JOptionPane.showMessageDialog(elepanel3,"vehicle with vehicleID"+ sellid+"has been sold" + "\n range =" + price);
                        }
                        else{
                            JOptionPane.showMessageDialog(elepanel3,"the vehicle has been already sold");
                        }
                        sellhave = true;
                        break;   
                        } else{
                            sellhave = false;
                        }
                    }
                }
            }catch(NumberFormatException ne){               //this code runs if exception is shown in try block
                JOptionPane.showMessageDialog(elepanel3,"empty fields");
                
            }
            
            }
   }

   public static void main (String[]args){               //main method
     TransportGUI object= new TransportGUI();
     object.mainGUI();
        
   }
    
}


            
        
        

            

