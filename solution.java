 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;
 
 
 
 class solution
     {
     
     public static void com()
         {
         ArrayList<Double> l1 = new ArrayList<Double>();
         ArrayList<Double> l2 = new ArrayList<Double>();
     	double R =5.0,r=1.0,a=4.0,nRev = 80;
         double x,y,lon,lat,lo = -118.289391;
         double t, la = 34.021205;
         l1.add(lo);
         l2.add(la+0.001*(R+r-a));
         
         for(t = 0.00; t<= (Math.PI*nRev) ;t+=0.02)
             {
              x = (R+r)*Math.cos((r/R)*t) - a*Math.cos((1+r/R)*t);
              y = (R+r)*Math.sin((r/R)*t) - a*Math.sin((1+r/R)*t);
              lon = (lo + 0.0001*y);
              lat = (la + 0.0001*x);
             l1.add(lon);
             l2.add(lat);
             
         }
         for(int i=0;i<l1.size();i++)
         	System.out.println(l1.get(i)+","+l2.get(i));
         	
     }
     
     public static void main(String[] args)
         {
      
         
         com();
         
     
     }
 
 }