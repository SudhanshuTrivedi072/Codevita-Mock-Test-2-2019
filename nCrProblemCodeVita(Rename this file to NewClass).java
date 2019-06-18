import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewClass {

    public static long factorial(long num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static long nCr(int n, int r) {
        if (n < r) {
            return 0;
        } else if (n == r || r == 0) {
            return 1;
        } else if (n - 1 == r || r == 1) {
            return (long) n;
        } else {
            long nCr = 1, rfact = 0;
            for (int i = n; i > n - r; i--) {
                nCr = nCr * (long) i;
            }

            rfact = factorial(r);
            nCr = nCr / rfact;
            return nCr;
        }
    }

    public static void main(String args[]) {
        int x = 0, y = 0, z = 0, s = 0, m = 0, c = 0;
        String X = "", Y = "", Z = "", a1 = "", a2 = "", a3 = "";
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        s = sc.nextInt();
        y = sc.nextInt();
        m = sc.nextInt();
        z = sc.nextInt();
        c = sc.nextInt();
        a1 = sc.next();
        a2 = sc.next();
        a3 = sc.next();
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> maptwo = new HashMap<String, Integer>();
        map.put("x", x);
        maptwo.put("x", s);
        map.put("y", y);
        maptwo.put("y", m);
        map.put("z", z);
        maptwo.put("z", c);
        if ((s <= x && m <= y && c <= z) && (a1.length() == 1 && a2.length() == 1 && a3.length() == 1) && (s >= 1 || m >= 1 || c >= 1) && (x >= 1 || y >= 1 || z >= 1) && (x + y + x <= 26)) {
            System.out.println(NewClass.nCr(x, s) * NewClass.nCr(y, m) * NewClass.nCr(z, c));
            int a = 65;
            for (int i = 0; i < x; i++) {
                X = X + (char) a;
                a++;
            }
            for (int i = 0; i < y; i++) {
                Y = Y + (char) a;
                a++;
            }
            for (int i = 0; i < z; i++) {
                Z = Z + (char) a;
                a++;
            }
//                System.out.println("X = " + X + " Y =" + Y + " Z =" + Z);

            int check = 0;
            String a1check = "", a2check = "", a3check = "";
            for (int i = 0; i <= 2; i++) {
                if (i == 1) {
                    check = X.indexOf(a1);
                    if (check == -1) {
                        check = Y.indexOf(a1);
                        if (check == -1) {
                            check = Z.indexOf(a1);
                            if (check == -1) {
                                System.out.println("out of bound");
                            } else {

                                a1check = "z";
                            }
                        } else {
                            a1check = "y";
                        }
                    } else {
                        a1check = "x";
                    }
                } else if (i == 0) {
                    check = X.indexOf(a2);
                    if (check == -1) {
                        check = Y.indexOf(a2);
                        if (check == -1) {
                            check = Z.indexOf(a2);
                            if (check == -1) {
                                System.out.println("out of bound");
                            } else {
                                a2check = "z";
                            }
                        } else {
                            a2check = "y";
                        }
                    } else {
                        a2check = "x";
                    }
                } else if (i == 2) {
                    check = X.indexOf(a3);
                    if (check == -1) {
                        check = Y.indexOf(a3);
                        if (check == -1) {
                            check = Z.indexOf(a3);
                            if (check == -1) {
                                System.out.println("out of bound");
                            } else {
                                a3check = "z";
                            }
                        } else {
                            a3check = "y";
                        }
                    } else {
                        a3check = "x";
                    }
                }
            }
            int type = 0;
            boolean a12 = false, a13 = false, a23 = false;
            a12 = a1check.equalsIgnoreCase(a2check);
            a13 = a1check.equalsIgnoreCase(a3check);
            a23 = a2check.equalsIgnoreCase(a3check);
//            System.out.println(a12 + "" + a13 + "" + a23);
            if (a12 == true && a13 == true && a23 == true) {
                type = 1;
            } else if (a12 == false && a13 == false && a23 == false) {
                type = 2;
            } else if (a12 == true && a13 == false && a23 == false) {
                type = 3;
            } else if (a12 == false && a13 == true && a23 == false) {
                type = 4;
            } else if (a12 == false && a13 == false && a23 == true) {
                type = 5;
            }
            if (type == 1) {
                int first = 0, second = 0, third = 0;
                int sf = 0, ss = 0, st = 0;
                long answc;
                if (a1check.equalsIgnoreCase("x")) {
                    first = x;
                    sf = s;
                    second = y;
                    ss = m;
                    third = z;
                    st = c;
                } else if (a1check.equalsIgnoreCase("y")) {
                    first = y;
                    sf = m;
                    second = z;
                    ss = c;
                    third = x;
                    st = s;
                } else if (a1check.equalsIgnoreCase("z")) {
                    first = z;
                    sf = c;
                    second = x;
                    ss = s;
                    third = y;
                    st = m;
                }
                answc = NewClass.nCr(second, ss) * NewClass.nCr(third, st);
                long woa1a2a3 = NewClass.nCr(first - 3, sf);
                long wa1woa2a3 = NewClass.nCr(first - 3, sf - 1);
                answc = woa1a2a3 * answc + answc * 2 * wa1woa2a3 + 1;
                System.out.println(answc);
            } else if (type == 2) {
                int first, fs, second, ss, third, ts;
                first = map.get(a3check);
                fs = maptwo.get(a3check);
                second = map.get(a2check);
                ss = maptwo.get(a2check);
                third = map.get(a1check);
                ts = maptwo.get(a1check);
                long ans, temp1, temp2, temp3;
                ans = NewClass.nCr(first - 1, fs);
                temp1 = NewClass.nCr(second - 1, ss - 1) * NewClass.nCr(third - 1, ts);
                temp2 = NewClass.nCr(second - 1, ss) * NewClass.nCr(third - 1, ts - 1);
                temp3 = NewClass.nCr(second - 1, ss) * NewClass.nCr(third - 1, ts);
                System.out.println(temp1 + "" + temp2 + "" + temp3);
                ans = ans * (temp1 + temp2 + temp3);
                ans++;
                System.out.println(ans);
            } else if (type == 3) {
                int first, fs, second, ss, third, ts;
                long ans;
                String fthird = "";
                first = map.get(a1check);
                fs = maptwo.get(a1check);
                second = map.get(a3check);
                ss = maptwo.get(a3check);
                if (a1check.equalsIgnoreCase("x") && a3check.equalsIgnoreCase("y")) {
                    fthird = "z";
                }
                if (a1check.equalsIgnoreCase("x") && a3check.equalsIgnoreCase("z")) {
                    fthird = "y";
                }
                if (a1check.equalsIgnoreCase("y") && a3check.equalsIgnoreCase("z")) {
                    fthird = "x";
                }
                third = map.get(fthird);
                ts = maptwo.get(fthird);
                ans = NewClass.nCr(first - 2, fs - 1) * 2;
                ans = ans + NewClass.nCr(first - 2, fs);
                ans = ans * NewClass.nCr(second - 1, ss) * NewClass.nCr(third, ts);
                ans++;
                System.out.println(ans);
            } else if (type == 4) {
                int first, fs, second, ss, third, ts;
                long ans;
                String fthird = "";
                first = map.get(a1check);
                fs = maptwo.get(a1check);
                second = map.get(a2check);
                ss = maptwo.get(a2check);
                if (a1check.equalsIgnoreCase("x") && a2check.equalsIgnoreCase("y")) {
                    fthird = "z";
                }
                if (a1check.equalsIgnoreCase("x") && a2check.equalsIgnoreCase("z")) {
                    fthird = "y";
                }
                if (a1check.equalsIgnoreCase("y") && a2check.equalsIgnoreCase("z")) {
                    fthird = "x";
                }
                third = map.get(fthird);
                ts = maptwo.get(fthird);
                ans = NewClass.nCr(first - 2, fs - 1) * NewClass.nCr(second - 1, ss);
                ans = ans + NewClass.nCr(first - 2, fs) * NewClass.nCr(second - 1, ss - 1);
                ans = ans + NewClass.nCr(first - 2, fs) * NewClass.nCr(second - 1, ss);
                ans = ans * NewClass.nCr(third, ts) + 1;
                System.out.println(ans);
            } else if (type == 5) {
                int first, fs, second, ss, third, ts;
                long ans;
                String fthird = "";
                first = map.get(a2check);
                fs = maptwo.get(a2check);
                second = map.get(a1check);
                ss = maptwo.get(a1check);
                if (a1check.equalsIgnoreCase("x") && a2check.equalsIgnoreCase("y")) {
                    fthird = "z";
                }
                if (a1check.equalsIgnoreCase("x") && a2check.equalsIgnoreCase("z")) {
                    fthird = "y";
                }
                if (a1check.equalsIgnoreCase("y") && a2check.equalsIgnoreCase("z")) {
                    fthird = "x";
                }
                third = map.get(fthird);
                ts = maptwo.get(fthird);
                ans = NewClass.nCr(first - 2, fs - 1) * NewClass.nCr(second - 1, ss);
                ans = ans + NewClass.nCr(first - 2, fs) * NewClass.nCr(second - 1, ss - 1);
                ans = ans + NewClass.nCr(first - 2, fs) * NewClass.nCr(second - 1, ss);
                ans = ans * NewClass.nCr(third, ts) + 1;
                System.out.println(ans);
            }
        } else {
            System.out.println("out of bound");
        }
    }

}
