import java.io.*;
import java.lang.*;
import java.util.*;

class ActivitySelection {
    public static void printMaxActivities(int s[], int f [],int n)
    {
        int i , j;

        System.out.println("Following activities are selected");
        //first activity always get selected
        i=0;
        System.out.println(i + " ");

        //consider rest of the activities
        for(j = 1;j < n; j++) {
            //if this activity has start time greater than
            //or equal to finish time of previously
            // selected activity , then select it
            if (s[j] >= f[i]) {
                System.out.println(j + " ");
                i = j;
            }
        }

    }

    public static void main(String []args){
        int s[] = {1,3,0,5,8,5};
        int f[] = {2,4,6,7,9,9};
        int n = s.length;

        //function call
        printMaxActivities(s, f, n);
    }
}