package ejExtra;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        int limiteMax = 999, limiteMin = 0;
        for (Integer i = limiteMin ; i <= limiteMax ; i++){
            String l = i.toString().replace('3','E');
            switch (l.length()){
                case 1:
                    System.out.println("0-0-"+l);
                    break;
                case 2:
                    System.out.println("0-"+l.substring(0,1)+"-"+l.substring(1));
                    break;
                case 3:
                    System.out.println(l.substring(0,1)+"-"+l.substring(1,2)+"-"+l.substring(2));
                    break;
            }
        }
    }
}
