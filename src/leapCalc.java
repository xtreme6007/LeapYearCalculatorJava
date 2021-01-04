public class leapCalc {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999){
            int Even4 = year % 4;
            int Even100 = year % 100;
            int Even400 = year % 400;
            if(Even4 == 0 ){
                if (Even100 == 0) {
                    if(Even400 == 0){
                        return true;
                    } else{
                        return false;
                    }

                } else {
                    return true;
                }
            }

        }

    return false;
    }

}
