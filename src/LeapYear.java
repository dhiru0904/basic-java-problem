public class LeapYear {
    public static void main(String[] args) {
    //year check
    int year=2000;
    boolean leap=false;
    //year is divided by 4
        if (year%4==0){
        //year is century
        if (year%100==0){
            //year is divided by 400
            if (year%400==0)
                leap=true;
            else
                leap=false;
        }
        //year is not century
        else
            leap = true;
    }else
    leap=false;
        if(leap)
            System.out.println(year+"is a leap year.");
        else
                System.out.println(year+"is not a leap year.");
}

        }
