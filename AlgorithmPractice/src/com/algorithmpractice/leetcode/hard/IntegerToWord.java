package com.algorithmpractice.leetcode.hard;

public class IntegerToWord {
    String[] lessThanTwenty = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine", "Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty","Thirty","Forty","Fifty","Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }

        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(num > 0){
            if(num % 1000 != 0){
                StringBuilder currentSb = new StringBuilder();
                numToWord(num % 1000, currentSb);
                currentSb.append(thousands[index]).append(" ");
                sb.insert(0, currentSb);
            }
            num /= 1000;
            index++;
        }

        return sb.toString().trim();
    }

    private void numToWord(int num, StringBuilder sb){
        if(num == 0){
            return;
        }else if(num < 20){
            sb.append(lessThanTwenty[num]).append(" ");
            return;
        }else if(num < 100){
            sb.append(tens[num / 10]).append(" ");
            numToWord(num % 10, sb);
        }else{
            sb.append(lessThanTwenty[num / 100]).append(" Hundred ");
            numToWord(num % 100, sb);
        }
    }
}