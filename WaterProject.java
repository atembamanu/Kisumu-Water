import java.util.*;
class Clients{
    int Cost,Units;
    double Total_Cost,Bill,FinalBill,Total_Charges,Discount1,Discount2,CostAfterUnitDiscount,Balance,Cash_Amount,LessBy;
    String Mode_Payment;
    int AmountInVisaCard=500000;
    int choice;
   void Metered(){
       System.out.println("Welcome To Kisumu Water Comapany Limited");
       System.out.println("------------------------------------------");
       int Meter_Rent=500;
       System.out.println("Water charges are:\n----------------");
       System.out.println("1.KSH 33 PER UNIT---------BELOW 150 UNITS.\n2.KSH 30 PER UNIT---------150 UNITS & ABOVE.");
       Scanner input=new Scanner(System.in);
       System.out.println("Please Enter the Number of Units you would like to Buy:");
       Units=input.nextInt();
       
       if (Units> 0& Units<=149){
           Cost=Units*33;
           System.out.println("You are about to complete the purchase of "+Units+" units for KSH "+Cost);
           System.out.println("Please Select whether TO CONTINUE or TO TERMINATE:\n1.CONTINUE\n2.TERMINATE");
           choice=input.nextInt();
           switch(choice){
               case 1:System.out.println("Please Select Mode of Payment to Complete the Purchase of   "+Units+" units for KSH "+Cost);
               System.out.println("SELECT THE MODE OF PAYMENT:\n1.Visa Cards.\n2.Cash");
           choice=input.nextInt();
           switch(choice){
               case 1:System.out.println("This Electronic Mode of payment.\nTherefore, You have been awarded 5% discount on your Bill!");
               if(Units>100){
                   CostAfterUnitDiscount=0.92*Cost;//Total Charges after discount due to Units above 100;
               }
               Total_Charges=0.90*CostAfterUnitDiscount;////Total Charges after 10% discount from the principle amount;
               FinalBill=0.95*Total_Charges;
                FinalBill=FinalBill+Meter_Rent;//Final computations after all discount have been calculated;
               Discount1=Cost-CostAfterUnitDiscount;
               Discount2=CostAfterUnitDiscount-Total_Charges;
               System.out.println("You have been entitled a discount of KSH "+Discount1+"  due to Units Above 100.");
               System.out.println("You have been entitled a discount of KSH  "+Discount2+" due to Meter Rent from the principle amount.");
               System.out.println("You have been awarded a discount of 5 % due to payment using Electronic Mode of Payment");
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
       if(AmountInVisaCard>=FinalBill){
           Balance=AmountInVisaCard-FinalBill;
           
           System.out.println("You have cleared your Bill of KSH "+FinalBill);
           System.out.println("Your Balance in Your Visa Card is::KSH " +Balance);
       }else{
           LessBy=FinalBill-AmountInVisaCard;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
            };break;
               
               case 2:System.out.println("This is Manual Mode of Payment.");
                        if(Units>100){
                   CostAfterUnitDiscount=0.92*Cost;//Total Charges after discount due to Units above 100;
               }
               Total_Charges=0.90*CostAfterUnitDiscount;////Total Charges after 10% discount from the principle amount;
               FinalBill=Meter_Rent+Total_Charges;//Final computations after all discount have been calculated;
               Discount1=Cost-CostAfterUnitDiscount;
               Discount2=CostAfterUnitDiscount-Total_Charges;
               System.out.println("You have been entitled a discount of KSH "+Discount1+"  due to Units Above 100.");
               System.out.println("You have been entitled a discount of KSH  "+Discount2+" due to Meter Rent from the principle amount.");
       
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
     System.out.println("Please Enter the Amount you would like to Pay::");
        Cash_Amount=input.nextInt();          
            if(Cash_Amount>=FinalBill){
                Balance=Cash_Amount-FinalBill;
                System.out.println("You have cleared your Bill of KSH "+FinalBill);
                System.out.println("Your Balance is::KSH " +Balance);
                }else{
                LessBy=FinalBill-Cash_Amount;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
           }
           }
           }
       }else{
                Cost=Units*30;
           System.out.println("You are about to complete the Purchase of  "+Units+" units for KSH "+Cost);
           System.out.println("Please Select whether TO CONTINUE or TO TERMINATE:\n1.CONTINUE.\n2.TERMINATES");
           choice=input.nextInt();
           switch(choice){
               case 1:System.out.println("Please Select Mode of Payment to Complete the Purchase of "+Units+" units for KSH "+Cost);
               System.out.println("SELECT THE MODE OF PAYMENT:\n1.Visa Cards.\n2.Cash");
           choice=input.nextInt();
           switch(choice){
               case 1:System.out.println("This Electronic Mode of payment.\nTherefore, You have been awarded 5% discount on your Bill!");
                       if(Units>100){
                   CostAfterUnitDiscount=0.92*Cost;//Total Charges after discount due to Units above 100;
               }
               Total_Charges=0.90*CostAfterUnitDiscount;////Total Charges after 10% discount from the principle amount;
               FinalBill=0.95*Total_Charges;
                FinalBill=FinalBill+Meter_Rent;//Final computations after all discount have been calculated;
               Discount1=Cost-CostAfterUnitDiscount;
               Discount2=CostAfterUnitDiscount-Total_Charges;
               System.out.println("You have been entitled a discount of KSH "+Discount1+"  due to Units Above 100.");
               System.out.println("You have been entitled a discount of KSH  "+Discount2+" due to Meter Rent from the principle amount.");
               System.out.println("You have been awarded a discount of 5 % due to payment using Electronic Mode of Payment");
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
       if(AmountInVisaCard>=FinalBill){
           Balance=AmountInVisaCard-FinalBill;
           
           System.out.println("You have cleared your Bill of KSH "+FinalBill);
           System.out.println("Your Balance in Your Visa Card is::KSH " +Balance);
       }else{
           LessBy=FinalBill-AmountInVisaCard;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
            };break; 
               case 2:System.out.println("This is Manual Mode of Payment.");
                         if(Units>100){
                   CostAfterUnitDiscount=0.92*Cost;//Total Charges after discount due to Units above 100;
               }
               Total_Charges=0.90*CostAfterUnitDiscount;////Total Charges after 10% discount from the principle amount;
               FinalBill=Meter_Rent+Total_Charges;//Final computations after all discount have been calculated;
               Discount1=Cost-CostAfterUnitDiscount;
               Discount2=CostAfterUnitDiscount-Total_Charges;
               System.out.println("You have been entitled a discount of KSH "+Discount1+"  due to Units Above 100.");
               System.out.println("You have been entitled a discount of KSH  "+Discount2+" due to Meter Rent from the principle amount.");
       
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
     System.out.println("Please Enter the Amount you would like to Pay::");
        Cash_Amount=input.nextInt();          
            if(Cash_Amount>=FinalBill){
                Balance=Cash_Amount-FinalBill;
                System.out.println("You have cleared your Bill of KSH "+FinalBill);
                System.out.println("Your Balance is::KSH " +Balance);
                }else{
                LessBy=FinalBill-Cash_Amount;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
            };break;
               default:System.out.println("INVALID INPUT,");
          
           }case 2:System.out.println("You have terminated you Progress of The Purchase of " +Units+ "Units for KSH "+Cost+" !.\nPlease Start over To buy Units");break;
               default:System.out.println("Invalid CHARACTER!!");break;
 
   }
   }
           }

   void Unmetered(){
       System.out.println("Welcome To Kisumu Water Comapany Limited");
       System.out.println("------------------------------------------");
       System.out.println("Water charges are:\n----------------");
       System.out.println("1.KSH 33 PER UNIT---------BELOW 150 UNITS.\n2.KSH 30 PER UNIT---------150 UNITS & ABOVE.");
       Scanner input=new Scanner(System.in);
       System.out.println("Please Enter the Number of Units you would like to Buy: ");
       Units=input.nextInt();
       if (Units> 0& Units<=149){
           Cost=Units*33;
           System.out.println("You are about to Complete the Purchase of "+Units+" units for KSH "+Cost);
           System.out.println("Please Select whether TO CONTINUE or TO TERMINATE:\n1.CONTINUE.\n2.TERMINATE");
           choice=input.nextInt();
           switch(choice){
               case 1:System.out.println("Please Select Mode of Payment to Complete the Purchase of  "+Units+" units for KSH "+Cost);
               System.out.println("SELECT THE MODE OF PAYMENT:\n1.Visa Cards.\n2.Cash");
           choice=input.nextInt();
           switch(choice){
               case 1:System.out.println("This Electronic Mode of payment.\nTherefore, You have been awarded 5% discount on your Bill!");
                        if(Units>100){
                   CostAfterUnitDiscount=0.92*Cost;//Total Charges after discount due to Units above 100;
               }
               FinalBill=0.95*CostAfterUnitDiscount;//After discount due to payment usimg electronic means;
               Discount1=Cost-CostAfterUnitDiscount;
             
               System.out.println("You have been entitled a discount of KSH "+Discount1+"  due to Units Above 100.");
               System.out.println("You have been awarded a discount of 5 % due to payment using Electronic Mode of Payment");
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
       if(AmountInVisaCard>=FinalBill){
           Balance=AmountInVisaCard-FinalBill;
           
           System.out.println("You have cleared your Bill of KSH "+FinalBill);
           System.out.println("Your Balance in Your Visa Card is::KSH " +Balance);
       }else{
           LessBy=FinalBill-AmountInVisaCard;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
            };break;
               case 2:System.out.println("This is Manual Mode of Payment.");
                        if(Units>100){
                   CostAfterUnitDiscount=0.92*Cost;//Total Charges after discount due to Units above 100;
               }
               FinalBill=0.95*CostAfterUnitDiscount;//After discount due to payment usimg electronic means;
               Discount1=Cost-CostAfterUnitDiscount;
             
               System.out.println("You have been entitled a discount of KSH "+Discount1+"  due to Units Above 100.");
               System.out.println("You have been awarded a discount of 5 % due to payment using Electronic Mode of Payment");
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
       if(AmountInVisaCard>=FinalBill){
           Balance=AmountInVisaCard-FinalBill;
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
     System.out.println("Please Enter the Amount you would like to Pay::");
        Cash_Amount=input.nextInt();          
            if(Cash_Amount>=FinalBill){
                Balance=Cash_Amount-FinalBill;
                System.out.println("You have cleared your Bill of KSH "+FinalBill);
                System.out.println("Your Balance is::KSH " +Balance);
                }else{
                LessBy=FinalBill-Cash_Amount;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
            }
       }
               default:System.out.println("INVALID INPUT,");
           };break;
               case 2:System.out.println("You have terminated you Progress of The Purchase of " +Units+ "Units for KSH "+Cost+" !.\nPlease Start over To buy Units");break;
               default:System.out.println("Invalid CHARACTER!!");break;
           }
       }else{
          Cost=Units*30;
           System.out.println("You are about to complete the Purchase of "+Units+" units for KSH "+Cost);
           System.out.println("Please Select whether TO CONTINUE or TO TERMINATE:\n1.CONTINUE.\n2.TERMINATE");
           choice=input.nextInt();
           switch(choice){
               case 1:System.out.println("Please Select Mode of Payment to Complete the Purchase of  "+Units+" units for KSH "+Cost);
               System.out.println("SELECT THE MODE OF PAYMENT:\n1.Visa Cards.\n2.Cash");
           choice=input.nextInt();
           switch(choice){
               case 1:System.out.println("This Electronic Mode of payment.\nTherefore, You have been awarded 5% discount on your Bill!");
                        if(Units>100){
                   CostAfterUnitDiscount=0.92*Cost;//Total Charges after discount due to Units above 100;
               }
               FinalBill=0.95*CostAfterUnitDiscount;//After discount due to payment usimg electronic means;
               Discount1=Cost-CostAfterUnitDiscount;
             
               System.out.println("You have been entitled a discount of KSH "+Discount1+"  due to Units Above 100.");
               System.out.println("You have been awarded a discount of 5 % due to payment using Electronic Mode of Payment");
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
       if(AmountInVisaCard>=FinalBill){
           Balance=AmountInVisaCard-FinalBill;
           
           System.out.println("You have cleared your Bill of KSH "+FinalBill);
           System.out.println("Your Balance in Your Visa Card is::KSH " +Balance);
       }else{
           LessBy=FinalBill-AmountInVisaCard;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
            };break;
               case 2:System.out.println("This is Manual Mode of Payment.");
                        if(Units>100){
                   CostAfterUnitDiscount=0.92*Cost;//Total Charges after discount due to Units above 100;
               }
               FinalBill=0.95*CostAfterUnitDiscount;//After discount due to payment usimg electronic means;
               Discount1=Cost-CostAfterUnitDiscount;
             
               System.out.println("You have been entitled a discount of KSH "+Discount1+"  due to Units Above 100.");
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
       if(AmountInVisaCard>=FinalBill){
           Balance=AmountInVisaCard-FinalBill;
               System.out.println("YOUR BILL IS::KSH "+FinalBill);
     System.out.println("Please Enter the Amount you would like to Pay::");
        Cash_Amount=input.nextInt();          
            if(Cash_Amount>=FinalBill){
                Balance=Cash_Amount-FinalBill;
                System.out.println("You have cleared your Bill of KSH "+FinalBill);
                System.out.println("Your Balance is::KSH " +Balance);
                }else{
                LessBy=FinalBill-Cash_Amount;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
            }
       };break;
               default:System.out.println("INVALID INPUT,");break;
           }
               case 2:System.out.println("You have terminated you Progress of The Purchase of " +Units+ " Units for KSH " +Cost+ " !.\nPlease Start over To buy Units");break;
               default:System.out.println("Invalid CHARACTER!!");break;
           }
                   }
       
           if(Units>100){
            Discount2=(8/100)*Cost;
       
   }
   }
   void MeteredIndustry(){
       Scanner input=new Scanner(System.in);
       System.out.println("Client Information Form");
       System.out.println("--------------------------");
       int Meter_Rent=500;
       if(Units>100){
            Discount1=(0.08)*Cost;
       }
       System.out.println("Meter Rent: "+Meter_Rent);
        Units=2500;
        System.out.println("Number of units:"+Units);
        Cost=2500*30;
        System.out.println("The Cost of 2500 Units is "+Cost);
        System.out.println("SELECT THE MODE OF PAYMENT:\n1.Visa Cards.\n2.Cash");
         choice=input.nextInt();
          switch(choice){
               case 1:System.out.println("This Electronic Mode of payment.\nTherefore, You have been awarded 5% discount on your Bill!");
             Total_Charges=Cost-Discount1;
       Total_Cost=Meter_Rent+Total_Charges;
       Bill=(0.91)*Total_Cost;
       FinalBill=(0.95)* Bill;
       System.out.println("YOUR BILL IS::KSH "+FinalBill);
       if(AmountInVisaCard>=FinalBill){
           Balance=AmountInVisaCard-FinalBill;
           
           System.out.println("You have cleared your Bill of KSH "+FinalBill);
           System.out.println("Your Balance in Your Visa Card is::KSH " +Balance);
       }else{
           LessBy=FinalBill-AmountInVisaCard;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
            }
           ;break;
               case 2:System.out.println("This is Manual Mode of Payment.");
               Total_Charges=Cost-Discount1;
       Total_Cost=Meter_Rent+Total_Charges;
       FinalBill=(0.91)*Total_Cost;
       Discount2=Total_Cost-FinalBill; 
       System.out.println("You have been entitled a discount of KSH "+Discount2);
       System.out.println("YOUR BILL IS:: KSH "+ FinalBill);
        System.out.println("Please Enter the Amount you would like to Pay::");
        Cash_Amount=input.nextInt();          
            if(Cash_Amount>=FinalBill){
                Balance=Cash_Amount-FinalBill;
                System.out.println("You have cleared your Bill of KSH "+FinalBill);
                System.out.println("Your Balance is::KSH " +Balance);
                }else{
                LessBy=FinalBill-Cash_Amount;
                System.out.println("INSUFFICIENT FUNDS...Please add more than KSH "+LessBy+" to complete Computations");
            }
                ; break;
               default:System.out.println("INVALID INPUT,");break;
          }
       }
}
public class WaterProject{
    public static void main(String args[]){
        int choice;
        do{
        System.out.println("KISUMU WATER COMPANY LIMITED");
        System.out.println("-------------------------------");
       Scanner input=new Scanner(System.in);
       System.out.println("Please select The Category of Client you belong::\nCATEGORIES\n--------------\n1.Metered Client.\n2.Unmetered Client.\n3.Metered Industry Client.");
        choice=input.nextInt();
        Clients ClientsObject=new Clients();
        switch(choice){
      
                case 1:ClientsObject.Metered();break;
                case 2:ClientsObject.Unmetered();break;
                case 3: ClientsObject.MeteredIndustry();break;
                default:System.out.println("INVALID CHOICE!!");
        }
    }while(choice!=2);
}
}
