
import java.util.Scanner;

public class NewClass {

    public int[] removedigit(int digits[], int digit, int lastIndex) {
        for (int x = 0; x <= lastIndex; x++) {
            if (x == digit) {
                int temp = digits[lastIndex];
                digits[lastIndex] = digit;
                digits[x] = temp;
                x = lastIndex + 1;
            }
        }
        return digits;
    }

    public int contains(int digits[], int digit, int lastIndex) {
        int status = -1;
        for (int x = 0; x <= lastIndex; x++) {
            if (digit == digits[x]) {
                status = x;
            }
        }
        return status;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "5,8,7,9,1,6,3,2,1,3,1,9";
        str = sc.nextLine();
        int[] digits = new int[12];
        int index = 0;
        int mdays = 0;
        int mc = 0, mp = 0;
        for (int x = 0; x <= 22; x++) {
            if (x % 2 == 0) {
                digits[index] = (int) str.charAt(x) - 48;
                index++;
            }
        }
        int d1 = 0, d2 = 0, m1 = 0, m2 = 0, h1 = 0, h2 = 0, mi1 = 0, mi2 = 0, temp = 0;
        String s1 = null;
        String s2 = null;
        NewClass nc = new NewClass();
        for (int i = 1; i >= 0; i--) {

            if (i == 0) {
                for (int j = 9; j >= 1; j--) {
                    int check = nc.contains(digits, i, 11);
                    if (check != -1) {
                        digits = nc.removedigit(digits, check, 11);
                        check = nc.contains(digits, j, 10);
                        if (check != -1) {
                            digits = nc.removedigit(digits, check, 10);
                            if (i == 0 && j == 2) {
                                for (int k = 2; k >= 0; k--) {
                                    check = nc.contains(digits, k, 9);
                                    if (check != -1) {
                                        if (k == 2) {
                                            for (int l = 8; l >= 0; l--) {
                                                digits = nc.removedigit(digits, check, 9);
                                                check = nc.contains(digits, l, 8);
                                                ///////////////////////////////////
                                                if (check != -1) {
                                                    digits = nc.removedigit(digits, check, 8);
                                                    for (int m = 2; m >= 0; m--) {
                                                        check = nc.contains(digits, m, 7);
                                                        if (check != -1) {
                                                            digits = nc.removedigit(digits, check, 7);
                                                            if (m == 2) {
                                                                for (int n = 3; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                for (int n = 9; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                                ///////////////////////////////////
                                            }
                                        } else if (k == 1) {
                                            for (int l = 9; l >= 0; l--) {
                                                digits = nc.removedigit(digits, check, 9);
                                                check = nc.contains(digits, l, 8);
                                                if (check != -1) {
                                                    digits = nc.removedigit(digits, check, 8);
                                                    for (int m = 2; m >= 0; m--) {
                                                        check = nc.contains(digits, m, 7);
                                                        if (check != -1) {
                                                            digits = nc.removedigit(digits, check, 7);
                                                            if (m == 2) {
                                                                for (int n = 3; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                for (int n = 9; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        } else if (k == 0) {
                                            for (int l = 9; l >= 1; l--) {
                                                digits = nc.removedigit(digits, check, 9);
                                                check = nc.contains(digits, l, 8);
                                                if (check != -1) {
                                                    digits = nc.removedigit(digits, check, 8);
                                                    for (int m = 2; m >= 0; m--) {
                                                        check = nc.contains(digits, m, 7);
                                                        if (check != -1) {
                                                            digits = nc.removedigit(digits, check, 7);
                                                            if (m == 2) {
                                                                for (int n = 3; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                for (int n = 9; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                for (int k = 3; k >= 0; k--) {
                                    check = nc.contains(digits, k, 9);
                                    if (check != -1) {
                                        if (k == 3) {
                                            if ((i == 0 && j == 1) || (i == 0 && j == 3) || (i == 0 && j == 5) || (i == 0 && j == 7) || (i == 0 && j == 8) || (i == 1 && j == 0) || (i == 1 && j == 2)) {
                                                for (int l = 1; l >= 0; l--) {
                                                    digits = nc.removedigit(digits, check, 9);
                                                    check = nc.contains(digits, l, 8);
                                                    if (check != -1) {
                                                        digits = nc.removedigit(digits, check, 8);
                                                        for (int m = 2; m >= 0; m--) {
                                                            check = nc.contains(digits, check, 7);
                                                            if (check != -1) {
                                                                digits = nc.removedigit(digits, check, 7);
                                                                if (m == 2) {
                                                                    for (int n = 3; n >= 0; n--) {
                                                                        check = nc.contains(digits, n, 6);
                                                                        if (check != -1) {
                                                                            digits = nc.removedigit(digits, check, 6);
                                                                            for (int o = 5; o >= 0; o--) {
                                                                                check = nc.contains(digits, o, 5);
                                                                                if (check != -1) {
                                                                                    digits = nc.removedigit(digits, check, 5);
                                                                                    for (int p = 9; p >= 0; p--) {
                                                                                        check = nc.contains(digits, p, 4);
                                                                                        if (check != -1) {
                                                                                            digits = nc.removedigit(digits, check, 4);
                                                                                            System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                            System.exit(1);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    for (int n = 9; n >= 0; n--) {
                                                                        check = nc.contains(digits, n, 6);
                                                                        if (check != -1) {
                                                                            digits = nc.removedigit(digits, check, 6);
                                                                            for (int o = 5; o >= 0; o--) {
                                                                                check = nc.contains(digits, o, 5);
                                                                                if (check != -1) {
                                                                                    digits = nc.removedigit(digits, check, 5);
                                                                                    for (int p = 9; p >= 0; p--) {
                                                                                        check = nc.contains(digits, p, 4);
                                                                                        if (check != -1) {
                                                                                            digits = nc.removedigit(digits, check, 4);
                                                                                            System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                            System.exit(1);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }
                                                }
                                            } else {
                                                int l = 0;
                                                digits = nc.removedigit(digits, check, 9);
                                                check = nc.contains(digits, l, 8);
                                                if (check != -1) {
                                                    digits = nc.removedigit(digits, check, 8);
                                                    for (int m = 2; m >= 0; m--) {
                                                        check = nc.contains(digits, m, 7);
                                                        if (check != -1) {
                                                            digits = nc.removedigit(digits, check, 7);
                                                            if (m == 2) {
                                                                for (int n = 3; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                for (int n = 9; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        } else if (k == 1 || k == 2) {
                                            for (int l = 9; l >= 0; l--) {
                                                digits = nc.removedigit(digits, check, 9);
                                                check = nc.contains(digits, l, 8);
                                                if (check != -1) {
                                                    digits = nc.removedigit(digits, check, 8);
                                                    for (int m = 2; m >= 0; m--) {
                                                        check = nc.contains(digits, m, 7);
                                                        if (check != -1) {
                                                            digits = nc.removedigit(digits, check, 7);
                                                            if (m == 2) {
                                                                for (int n = 3; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                for (int n = 9; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        } else if (k == 0) {
                                            for (int l = 9; l >= 1; l--) {
                                                digits = nc.removedigit(digits, check, 9);
                                                check = nc.contains(digits, l, 8);
                                                if (check != -1) {
                                                    digits = nc.removedigit(digits, check, 8);
                                                    for (int m = 2; m >= 0; m--) {
                                                        check = nc.contains(digits, m, 7);
                                                        if (check != -1) {
                                                            digits = nc.removedigit(digits, check, 7);
                                                            if (m == 2) {
                                                                for (int n = 3; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                for (int n = 9; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (i == 1) {
                for (int j = 2; j >= 0; j--) {

                    int check = nc.contains(digits, i, 11);
                    if (check != -1) {
                        digits = nc.removedigit(digits, check, 11);
                        check = nc.contains(digits, j, 10);
                        if (check != -1) {
                            digits = nc.removedigit(digits, check, 10);
                            for (int k = 3; k >= 0; k--) {
                                check = nc.contains(digits, k, 9);
                                if (check != -1) {
                                    if (k == 3) {
                                        if ((i == 0 && j == 1) || (i == 0 && j == 3) || (i == 0 && j == 5) || (i == 0 && j == 7) || (i == 0 && j == 8) || (i == 1 && j == 0) || (i == 1 && j == 2)) {
                                            for (int l = 1; l >= 0; l--) {
                                                digits = nc.removedigit(digits, check, 9);
                                                check = nc.contains(digits, l, 8);
                                                if (check != -1) {
                                                    digits = nc.removedigit(digits, check, 8);
                                                    for (int m = 2; m >= 0; m--) {
                                                        check = nc.contains(digits, m, 7);
                                                        if (check != -1) {
                                                            digits = nc.removedigit(digits, check, 7);
                                                            if (m == 2) {
                                                                for (int n = 3; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                for (int n = 9; n >= 0; n--) {
                                                                    check = nc.contains(digits, n, 6);
                                                                    if (check != -1) {
                                                                        digits = nc.removedigit(digits, check, 6);
                                                                        for (int o = 5; o >= 0; o--) {
                                                                            check = nc.contains(digits, o, 5);
                                                                            if (check != -1) {
                                                                                digits = nc.removedigit(digits, check, 5);
                                                                                for (int p = 9; p >= 0; p--) {
                                                                                    check = nc.contains(digits, p, 4);
                                                                                    if (check != -1) {
                                                                                        digits = nc.removedigit(digits, check, 4);
                                                                                        System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                        System.exit(1);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        } else {
                                            int l = 0;
                                            digits = nc.removedigit(digits, check, 9);
                                            check = nc.contains(digits, l, 8);
                                            if (check != -1) {
                                                digits = nc.removedigit(digits, check, 8);
                                                for (int m = 2; m >= 0; m--) {
                                                    check = nc.contains(digits, m, 7);
                                                    if (check != -1) {
                                                        digits = nc.removedigit(digits, check, 7);
                                                        if (m == 2) {
                                                            for (int n = 3; n >= 0; n--) {
                                                                check = nc.contains(digits, n, 6);
                                                                if (check != -1) {
                                                                    digits = nc.removedigit(digits, check, 6);
                                                                    for (int o = 5; o >= 0; o--) {
                                                                        check = nc.contains(digits, o, 5);
                                                                        if (check != -1) {
                                                                            digits = nc.removedigit(digits, check, 5);
                                                                            for (int p = 9; p >= 0; p--) {
                                                                                check = nc.contains(digits, p, 4);
                                                                                if (check != -1) {
                                                                                    digits = nc.removedigit(digits, check, 4);
                                                                                    System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                    System.exit(1);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            for (int n = 9; n >= 0; n--) {
                                                                check = nc.contains(digits, n, 6);
                                                                if (check != -1) {
                                                                    digits = nc.removedigit(digits, check, 6);
                                                                    for (int o = 5; o >= 0; o--) {
                                                                        check = nc.contains(digits, o, 5);
                                                                        if (check != -1) {
                                                                            digits = nc.removedigit(digits, check, 5);
                                                                            for (int p = 9; p >= 0; p--) {
                                                                                check = nc.contains(digits, p, 4);
                                                                                if (check != -1) {
                                                                                    digits = nc.removedigit(digits, check, 4);
                                                                                    System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                    System.exit(1);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }
                                    } else if (k == 1 || k == 2) {
                                        for (int l = 9; l >= 0; l--) {
                                            digits = nc.removedigit(digits, check, 9);
                                            check = nc.contains(digits, l, 8);
                                            if (check != -1) {
                                                digits = nc.removedigit(digits, check, 8);
                                                for (int m = 2; m >= 0; m--) {
                                                    check = nc.contains(digits, m, 7);
                                                    if (check != -1) {
                                                        digits = nc.removedigit(digits, check, 7);
                                                        if (m == 2) {
                                                            for (int n = 3; n >= 0; n--) {
                                                                check = nc.contains(digits, n, 6);
                                                                if (check != -1) {
                                                                    digits = nc.removedigit(digits, check, 6);
                                                                    for (int o = 5; o >= 0; o--) {
                                                                        check = nc.contains(digits, o, 5);
                                                                        if (check != -1) {
                                                                            digits = nc.removedigit(digits, check, 5);
                                                                            for (int p = 9; p >= 0; p--) {
                                                                                check = nc.contains(digits, p, 4);
                                                                                if (check != -1) {
                                                                                    digits = nc.removedigit(digits, check, 4);
                                                                                    System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                    System.exit(1);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            for (int n = 9; n >= 0; n--) {
                                                                check = nc.contains(digits, n, 6);
                                                                if (check != -1) {
                                                                    digits = nc.removedigit(digits, check, 6);
                                                                    for (int o = 5; o >= 0; o--) {
                                                                        check = nc.contains(digits, o, 5);
                                                                        if (check != -1) {
                                                                            digits = nc.removedigit(digits, check, 5);
                                                                            for (int p = 9; p >= 0; p--) {
                                                                                check = nc.contains(digits, p, 4);
                                                                                if (check != -1) {
                                                                                    digits = nc.removedigit(digits, check, 4);
                                                                                    System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                    System.exit(1);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }
                                    } else if (k == 0) {
                                        for (int l = 9; l >= 1; l--) {
                                            digits = nc.removedigit(digits, check, 9);
                                            check = nc.contains(digits, l, 8);
                                            if (check != -1) {
                                                digits = nc.removedigit(digits, check, 8);
                                                for (int m = 2; m >= 0; m--) {
                                                    check = nc.contains(digits, m, 7);
                                                    if (check != -1) {
                                                        digits = nc.removedigit(digits, check, 7);
                                                        if (m == 2) {
                                                            for (int n = 3; n >= 0; n--) {
                                                                check = nc.contains(digits, n, 6);
                                                                if (check != -1) {
                                                                    digits = nc.removedigit(digits, check, 6);
                                                                    for (int o = 5; o >= 0; o--) {
                                                                        check = nc.contains(digits, o, 5);
                                                                        if (check != -1) {
                                                                            digits = nc.removedigit(digits, check, 5);
                                                                            for (int p = 9; p >= 0; p--) {
                                                                                check = nc.contains(digits, p, 4);
                                                                                if (check != -1) {
                                                                                    digits = nc.removedigit(digits, check, 4);
                                                                                    System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                    System.exit(1);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            for (int n = 9; n >= 0; n--) {
                                                                check = nc.contains(digits, n, 6);
                                                                if (check != -1) {
                                                                    digits = nc.removedigit(digits, check, 6);
                                                                    for (int o = 5; o >= 0; o--) {
                                                                        check = nc.contains(digits, o, 5);
                                                                        if (check != -1) {
                                                                            digits = nc.removedigit(digits, check, 5);
                                                                            for (int p = 9; p >= 0; p--) {
                                                                                check = nc.contains(digits, p, 4);
                                                                                if (check != -1) {
                                                                                    digits = nc.removedigit(digits, check, 4);
                                                                                    System.out.println(i + "" + j + "/" + k + "" + l + " " + m + "" + n + "/" + o + "" + p);
                                                                                    System.exit(1);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }

                }
            }
        }
		System.out.println("0");
	}
}
