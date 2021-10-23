package aa;
import java.util.Scanner;

public class aa20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for year:");
        int year = input.nextInt();
        System.out.print("Enter a number for the first day:");
        int day = input.nextInt();
        String str = "";
        String str2 = "";
        for (int month = 1; month <= 12 ; month++){
            switch (month){
                case 1: {day += 31; str += "January 1, ";} break;
                case 2: {day += 28; str += "Febrary 1, ";} break;
                case 3: {day += 31; str += "March 1, ";} break;
                case 4: {day += 30; str += "April 1, ";} break;
                case 5: {day += 31; str += "May 1, ";} break;
                case 6: {day += 30; str += "June 1, ";} break;
                case 7: {day += 31; str += "July 1, ";} break;
                case 8: {day += 31; str += "August 1, ";} break;
                case 9: {day += 30; str += "September 1, ";} break;
                case 10: {day += 31; str += "November 1, ";} break;
                case 11: {day += 30; str += "October 1, ";} break;
                case 12: {day += 31; str += "December 1, ";}
            }
            if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0))){
                if (month != 1)
                    day +=1;
            }
            int week = day % 7;
            switch (week){
                case 1:str2 = " is Monday";break;
                case 2:str2 = " is Tuesday";break;
                case 3:str2 = " is Wednesday";break;
                case 4:str2 = " is Thurday";break;
                case 5:str2 = " is Friday";break;
                case 6:str2 = " is Saturday";break;
                case 0:str2 = " is Sunday";break;
            }
            System.out.println(str + year + str2);
            str = "";
            str2 = "";
        }
    }
}