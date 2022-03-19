/*class area_a{
static int area(int a){
return 3.14*a*a;
}
}

public class Test{
public static void main(Strings[]args){
System.out.println(area_a(9));
}
}*/




public class matrix
{
public static void main (String args[])
{
   int a[][]={{2,4},{4,5}};
   int b[][]={{2,7},{1,7}};

   int c[] []=new int[2] [2]; 

   for(int i=0;i<2;i++){
   for(int j=0;j<2;j++){
   c[i] [j]=a[i] [j]+b[i] [j];
 
          System.out.print(c[i] [j]+"");
  }
   System.out.println( );
  }
 }
}