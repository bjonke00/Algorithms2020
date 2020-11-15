package com.algorithmpractice.other;

public class ValidateIP {
    static boolean validateIP(String ip) {
        String[] numbers = ip.split("\\.");
        if(numbers.length != 4){
            return false;
        }

        for(String number : numbers){
            if(number.length() == 0){
                return false;
            }

            if(number.charAt(0) == '0' && number.length() != 1){
                return false;
            }

            for(int i = 0; i < number.length(); i++){
                char c = number.charAt(i);
                if(c < '0' || c > '9'){
                    return false;
                }
            }
            
            if(Integer.parseInt(number) < 0 || Integer.parseInt(number) > 255){
                return false;
            }
        }

        return true;
    }
}
