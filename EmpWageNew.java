public class EmpWageNew{
   public static final int is_part_time=1;
   public static final int is_full_time=2;
   public static final int rate_per_hour=20;
   public static final int working_days=20;
   public static final int maxWorkingHours=100;
   public static final int maxWorkingDays=20;
   
   public static int calcEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs){ 

        int hours=0;
        int totalHours=0;
        int totalDays=0;
        int wage=0;
        int netWage=0;

   while(totalHours<=maxHrs && totalDays<=numOfDays){

        int presence = (int) Math.floor(Math.random()*10) % 3;
          switch (presence){
            case is_full_time:
                 hours=8;
                 break;
            case is_part_time:
                 hours=4;
                 break;
            default :
                 hours=0;
         }
     wage = hours * empRate;
     netWage += wage;
     totalHours += hours;
     totalDays +=1;
     }

    System.out.println("Total Employee Wage for company "+company+" is : "+netWage);
    return netWage;
    }
    public static void main(String[]  args){
 
       System.out.println("Welcome to Employee Wage Computation Program");
    
       calcEmpWageForCompany("DMart" , 20 , 2 , 10);
       calcEmpWageForCompany("Reliance" , 10 , 4 , 20);

     }

 }
