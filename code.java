public class Calendar {

    public static int getDaysOfMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return 0;
        }
        int leap = year % 4;
        if (month == 2) {
            if (leap == 0) {
                return 29;
            } else {
                return 28;
            }
        }
        else{
            if( month == 1 || month == 3 || month == 5|| month == 7|| month == 8|| month == 10 || month == 12){
                return 31;
            }
            else{
                return 30;
            }
        }
    }

    public static int getDayOfTheWeek(int day, int month, int year){
        int K = (year % 100);
        int J = (year / 100);
        int day_of_week = (day+ ((13 * (month +1)) / 5) + K + (K/4) + (J/4) - (2*J))%7;
        switch (day_of_week){
            case 0: return 6; case 1: return 7; case 2: return 1; case 3: return 2; case 4: return 3; case 5: return 4; case 6: return 5;
            };
        return 0;
    }

    public static void printCalendar(int month, int year){
        System.out.println("Mo Tu We Th Fr Sa Su");
        int num_days = getDaysOfMonth( month, year);
        int num = getDayOfTheWeek( 1,  month,  year);
        int Total_space = 21;
        if (num == 1){
            System.out.print(" " + num + " ");
            Total_space = Total_space - 1;
        }
        else{
            int spaces = (num -1) * 3;
            Total_space = Total_space - spaces - 3;
            for (int i = 0; i <= spaces; i++){
                System.out.print(" ");
            }
            System.out.print(1 +" ");
        }
        for (int i = 2; i <= num_days; i++){
            if (i < 10) {
                System.out.print(" " + i + " ");
            }
            else{
                System.out.print(i + " ");
            }
            Total_space = Total_space - 3;
            if (Total_space == 0) {
                System.out.print("\n");
                Total_space = 21;
            }
        }
    }

    public static void main(String[] args) {
        int month = Terminal.readInt("Month")
        int year = Terminal.readInt("Year")
        printCalendar(month, year);

    }
}
