static long FindLcm(long a,long b)
 {
     long lcm,hcf = 0;
     long i=1;
     long ger=a>b?a:b;
     while(i<ger)
     {
         if((a%i==0) && (b%i==0))
             hcf=i;
         i++;
     }
     lcm=(a*b)/hcf;
     return lcm;
 }
 static void FindMultiple()
 {
     long lcm=1;
     for(long i=2;i<=20;i++)
     {
         lcm=FindLcm(lcm,i);
     }   
     System.out.println("Lcm="+lcm);
 }

class smallestMultiple{
public static void main(String[] args){
smallestMultiple s=new smallestMultiple();
s.FindLcm();
s.FindMultiple();
}
}