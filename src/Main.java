public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String s = "The";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
        String a = "AAbb";
        StringBuilder as = new StringBuilder();
        for (int i = 0; i< a.length(); i++) {
            as.append(a.charAt(i));
            as.append(a.charAt(i));
        }
        System.out.println(as);
        String b = "Hi-There";
        StringBuilder bs = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            bs.append(b.charAt(i));
            bs.append(b.charAt(i));
        }
        System.out.println(bs);
    }
    public static void task2() {
        System.out.println("Задача 2");
        String a = "Yay";
        StringBuilder as = new StringBuilder();
            as.append("<<");
            as.append(a.substring(0,3));
            as.append(">>");
        System.out.println(as);

        String b = "<<>>";
        String c = "WooHoo";
        int mid = b.length() / 2;
        String result = b.substring(0,mid) + c + b.substring(mid);
        System.out.println(result);

        String d = "[[]]";
        String e = "word";
        int midl = d.length()/2;
        String res = d.substring(0,midl) + e + d.substring(midl);
        System.out.println(res);
    }
    public static void task3() {
        System.out.println("Задача 3");
        String a ="last";
        String b = "chars";
        int bs = b.length() -1;
        if (a.isEmpty()) {
            a = "@";
        }
        if (b.isEmpty()) {
           b = "@";
        }
        String result = String.valueOf(a.charAt(0)) + b.charAt(bs);
        System.out.println(result);

        String d ="yo";
        String c = "yava";
        int dc = c.length() -1;
        if (d.isEmpty()) {
            d = "@";
        }
        if (c.isEmpty()) {
            c = "@";
        }
        String res = String.valueOf(d.charAt(0)) + c.charAt(dc);
        System.out.println(res);

        String f ="hi";
        String z = "";
        if (f.isEmpty()) {
            f = "@";
        }
        if (z.isEmpty()) {
            z = "@";
        }
        String resu = String.valueOf(f.charAt(0)) + z.charAt(z.length() -1);
        System.out.println(resu);
    }
    public static void task4() {
        System.out.println("Задача 4");
        String lastTwo = "coding";
        String lastNew = lastTwo.substring(0,lastTwo.length()-2) + lastTwo.charAt(lastTwo.length()-1) + lastTwo.charAt(lastTwo.length()-2);
        System.out.println(lastNew);

        String a = "cat";
        char[] cat = a.toCharArray();
        char pos = cat[cat.length-2];
        cat[cat.length-2] = cat[cat.length-1];
        cat[cat.length-1] = pos;
        String result = new String(cat);
        System.out.println(result);

        String b = "ab";
        char[] ab = b.toCharArray();
        char posl = ab[ab.length-2];
        ab[ab.length-2] = ab[ab.length-1];
        ab[ab.length-1] = posl;
        String res = new String(ab);
        System.out.println(res);
    }
    public static void task5() {
        System.out.println("Задача 5");
        String a ="Hello";
        String b = "Hi";
        String news = "";
        if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                int index = a.length() - b.length();
                news = a.substring(index) + b;
            } else {
                int index = b.length() - a.length();
                news = a + b.substring(index);
            }
        }
        System.out.println(news);

        String c ="Hello";
        String d = "java";
        int min = Math.min(c.length(), d.length());
        String res = c.substring(c.length()-min) + d.substring(d.length()-min);
        System.out.println(res);

    }
    public static void task6() {
        System.out.println("Задача 6");
        String a = "hihi";
        int count = 0;
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == 'h' && a.charAt(i+1) == 'i'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void task7() {
        System.out.println("Задача 7");
        String a = "Hello";
        int n = 1;
        String aNew = a.substring(a.length()-n);
        String result = aNew.repeat(n);
        System.out.println(result);
    }
    public static void task8() {
        System.out.println("Задача 8");

    }
}
