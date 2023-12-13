package org.example.lesson2.Lecture;

//public class Lecture {
//    public static void main(String[] args) {
//        String str = " ";
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            str += "%";
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
//    }
//}

// 58539 ms

public class Lecture {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append("+");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

// 7 ms

