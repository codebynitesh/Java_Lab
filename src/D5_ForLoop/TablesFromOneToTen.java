package D5_ForLoop;
//Print tables from 1 to 10
public class TablesFromOneToTen {
    public static void main(String args[]){
       for (int count = 1; count <= 10; count++ ) {
           System.out.println( "Table of " + count);
           System.out.println();
        for (int i = 1; i <= 10; i++ )
            {System.out.println(count +" x " + i + " = " + count*i);
        }
       System.out.println(); }
    }
}
