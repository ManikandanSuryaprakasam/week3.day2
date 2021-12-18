package week3.day2;

import java.util.LinkedHashSet;

//import java.lang.*;
public class RemDupStringSet {
    public static void main(String args[]) {
      
String text = "We learn java basics as part of java sessions in java week1";
      
      String[] split = text.split(" ");
    //  System.out.println(split[0]);
    LinkedHashSet<String> s1= new LinkedHashSet<String>();
    LinkedHashSet<String> s2 =new LinkedHashSet<String>();
    for(String str:split)
    {
        if(s1.add(str))
        {
           continue; 
        }
        else
        {
            s2.add(str);
        }
        
    }
    
    for(String str2:s2 ){
    
    if(s1.contains(str2))
    s1.remove(str2);}
    
    for(String str3:s1 )
     System.out.print(" "+str3);
    }
}