import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     boolean isError=false;
     int month,day;
     String burc="";
        System.out.print("Dogdunuz ayi giriniz:");
         month=in.nextInt();
        System.out.print("Dogdunuz gunu giriniz:");
        day=in.nextInt();
if(day>=1&&day<=31)
     {
         if(month==1){
         if(day>=1&&day<22)
          burc="Oglak";
           else
          burc="Kova";}
        else if(month==2){
             if(day>=1&&day<20)
                 burc="Kova";
             else
                 burc="Balik";}


        else if(month==3){
    if(day>=1&&day<21)
        burc="Balik";
    else
        burc="Koc";
         }
        else if(month==4){
         if(day>=1&&day<21)
        burc="Koc";
         else
         burc="Boga";
         }

        else if(month==5){
             if(day>=1&&day<22)
                 burc="Boga";
             else
                 burc="İkizler";

         }
        else if(month==6){
             if(day>=1&&day<23)
                 burc="İkizler";
             else
                 burc="Yengec";
         }
        else if(month==7){
             if(day>=1&&day<23)
                 burc="Yengec";
             else
                 burc="Aslan";
         }
        else if(month==8){
             if(day>=1&&day<23)
                 burc="Aslan";
             else
                 burc="Basak";
         }
        else if(month==9){
             if(day>=1&&day<23)
                 burc="Basak";
             else
                 burc="Terazi";
         }
        else if(month==10){
             if(day>=1&&day<23)
                 burc="Terazi";
             else
                 burc="Akrep";
         }
        else if(month==11){
             if(day>=1&&day<22)
                 burc="Akrep";
             else
                 burc="Yay";
         }
        else if(month==12){
             if(day>=1&&day<22)
                 burc="Yay";
             else
                 burc="Oglak";
         }
        else
        {  isError=true;}

        if(isError){
            System.out.println("Hatali Ay Girisi.");
        }
        else
            System.out.print("Burcunuz----->"+ burc);
}

else {
    System.out.println("Hatali Gun Girisi:");


}


    }

}
