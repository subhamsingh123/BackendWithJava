package Java.Strings;

// Java program to illustrate intern() method
class StringImmutability {
  
    public static void main(String[] args) {
      
        // // S1 refers to object in the Heap Area
        // String s1 = new String("GFG");
        

    
        // // S2 refers to object in the SCP Area
        // String s2 = "GFG";
        
        
        // // Comparing memory locations
        // System.out.println(s1 == s2);  
        
        // // Comparing values
        // System.out.println(s1.equals(s2));  
        
        // // S3 refers to object in the SCP Area
        // String s3 = "GFG";
        
        // // Comparing s2 and s3 in SCP
        // System.out.println(s2 == s3);  

        // String s4 = new String("GFG");

        // System.out.println(s4 == s3);  

        // System.out.println(s4 == s1);  

        // String s5 = "GFG";


        // System.out.println(s4 == s5);  
        // // while(true)
        // // {

        // // }



        String t1= new String("Test");
        
        String t2= "Test";
        String t3= t1.toString();
        System.out.println(t2);
        System.out.println(t1==t2);
        System.out.println(t3==t2);
    }
}
