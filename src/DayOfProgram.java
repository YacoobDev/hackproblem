/*
 * This program is part of my learning Java series
 * This one looks at the Day of the Programmer challenge on hackerrank
 */
public class DayOfProgram {
    
    //given a year find the 256th day of the year in the format dd.mm.yyyy using the julian calendar

    public static void main(String[] args) {
        int year = 1800;
        System.out.println(dayOfProgrammer(year));
    }

    public static String dayOfProgrammer(int year){

        //1918 is a special year because it is the year that the julian calendar was replaced by the gregorian calendar
        if(year==1918){
            return "26.09.1918";
        } else if(year<1918){
            //Before 1918, leap years were divisible by 4
            if(year%4==0){
                return "12.09."+year;
            } else {
                return "13.09."+year;
            }
        } else {
            //After 1918, leap years were divisible by 400 or divisible by 4 but not divisible by 100
            if(year%400==0 || (year%4==0 && year%100!=0)){
                return "12.09."+year;
            } else {
                return "13.09."+year;
            }
        }
    }
}
