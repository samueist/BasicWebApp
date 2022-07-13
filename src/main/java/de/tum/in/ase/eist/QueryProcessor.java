package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Samuel";
        }else if(query.contains("plus")){
            String number = query.substring(8);
            int indexPlus = number.indexOf("plus");
            String number1 = number.substring(0,indexPlus-1);
            String number2 = number.substring(indexPlus+5);
            int result = Integer.parseInt(number1)+Integer.parseInt(number2);
            return String.valueOf(result);
        }else if(query.contains("largest")){
            String numbers = query.substring(query.indexOf("largest")+9);
            String nr[] = numbers.split(",");
            int max = 0;
            for(String n: nr){
                if(Integer.parseInt(n) > max){
                    max = Integer.parseInt(n);
                }
            }
            return String.valueOf(max);
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
