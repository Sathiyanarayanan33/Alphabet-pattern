class Alphabet{
 public static void main(String ar [])
{
 Alphabet Star=new Alphabet();
 Star.Starprinting();
 Star.Starprinting_1();
 Star.Oprinting();
}
public void Starprinting()
{
  for(int row=1; row<=5; row++){
   
  for(int colm=1; colm<=5; colm++){
System.out.print("*");   

}
System.out.println();
  }
 }

public void Starprinting_1()
{
  for(int row=1; row<=5; row++){

  for(int colm=1; colm<=row; colm++){
    System.out.print("*");
}//colm
    System.out.println();
}//row
}//method

public void Oprinting()
 {
  for(int row=1; row<=5; row++){

  for(int colm=1; colm<=5; colm++){
   if(row==1){
   System.out.print("*");}
   else if(colm==5){
   System.out.print("*");}
   else if(row==5){
   System.out.print("*");}
   else if(colm==1){
   System.out.print("*");}
   else
     System.out.print(" ");
   }//c
System.out.println();
  }//r
 }//method
}//class
