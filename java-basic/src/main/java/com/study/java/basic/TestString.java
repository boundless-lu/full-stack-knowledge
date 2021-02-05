package com.study.java.basic;

/**
 * @Description: TestString
 * @Author Xiaoyaoyou
 * @Date: 2021/2/2 21:45
 * @Version 1.0
 */
public class TestString {

    public static void main(String[] args) {

    }


    /**
     * 知识点1:  {@link String} intern()
     *  intern() 首先把 s1 引用的对象放到 String Pool(字符串常量池)中，然后返回这个对象(常量池中的对象)引用
     *
     * 在 Java 7 之前，字符串常量池被放在运行时常量池中，它属于永久代。
     * 而在 Java 7，字符串常量池被移到 Native Method 中。这是因为永久代的空间有限，
     * 在大量使用字符串的场景下会导致 OutOfMemoryError 错误。
    */
    public static void testIntern(){
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);           // false
        String s3 = s1.intern();
        System.out.println(s1 == s3);           // false
        String s4 = "aaa";
        System.out.println(s4 == s3);           // true
    }

    /**
     * Incompatible types. Found: 'long', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
     *  switch 在Java7之后可以支持String
    */
    public static void testSwitch(){
        char a = 65;
        switch (a){
            case 'a':
                System.out.println("a");
            case 'A':
                System.out.println("A");

        }
    }
}
