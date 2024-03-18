package kr.ac.kopo.day10;

public class Foo {
    public static void main(String[]args){
        try{
            int a = get50thItem(new int[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("1. " + e.toString());
        }catch(Exception e) {
        	System.out.println("2. "+ e.toString());
        }
        
    }
    public static int get50thItem (int []array) throws Exception{
        return  array[49];
    }
}
