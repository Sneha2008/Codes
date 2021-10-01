import java.io.*;
import java.util.*;
class pyTriplet{
public static void main(String[] args) {

    long a = 0, b=0 , c=0;

    for(long div=1; div<1000; div++){
        if( ((500000-(1000*div))%(1000-div)) ==0){
            a = (500000 - (1000*divisor))/(1000-div);
            b = div;
            c = (long)Math.sqrt(a*a + b*b);
            System.out.println("a is " + a + " b is: " + b + " c is : " + c);
            break;
        }
    }
    return a*b*c;
}
}