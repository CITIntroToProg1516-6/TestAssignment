package cit.programming.testassignment;

public class TestClass {
    public static void main(String[] args){
        do { break; } while(true);
        
        int i = 7;
        int[] j = new int[++i];
        
        for (int k = 0; k < j.length; k++) {
            j[k] = j[i++] + j[j[--i]];
        }
        
        System.out.println(j[i++] + j[j[--i]]);
    }
}
