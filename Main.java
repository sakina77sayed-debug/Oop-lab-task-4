/* ==========================================================
   OOP Lab Task - 4
   Name: Bibi Sakina 
   Roll no : 2260051
   GitHub ID: sakina77sayed-debug
   
   Description:
   1. Class Area is created with an area(int side) method that returns side * side.
   2. A second overloaded method area(int length, int width) is added that returns length * width.
   3. In the main method, area(4) and area(3, 5) are called and printed.
   ========================================================== */

class Area {
    int area(int side) {
        return side * side;
    }

    int area(int length, int width) {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println(obj.area(4));
        System.out.println(obj.area(3, 5));
    }
}
