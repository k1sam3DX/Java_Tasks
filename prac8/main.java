    import java.util.Scanner;
    import java.util.*;
    public class main {
    
      static void task_1(int amount) {
        int k = 0;
        int j = 1;
        int result = 0;
        for (int i = 1; i <= amount; i++) {
          result += i;
        }
        for (int i = 0; i < result; i++) {
          System.out.print(j + " ");
          k++;
          if (j == k) {
            k = 0;
            j++;
          }
        }
      }
    
      static int task_4(int len, int sum, int k, int s) {
        if (len == k) {
          if (sum == s) {
            return 1;
          } else {
            return 0;
          }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
          res += task_4(len + 1, sum + i, k, s);
        }
        return res;
      }
    
      static int task_5(int number) {
        return (number == 0) ? 0 : (number % 10) + task_5(number / 10);
      }
    
      static String task_6(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        if (n < 2) {
          return "NO";
        }
        else if (n == 2) {
          return "YES";
        }
        else if (n % i == 0) {
          return "NO";
        }
        else if (i < n / 2) {
          return task_6(n, i + 1);
        } else {
          return "YES";
        }
      }
    
      static void task_7(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        if (k > n / 2) {
          System.out.print(n + " ");
          return;
        }
        if (n % k == 0) {
          System.out.print(k + " ");
          task_7(n / k, k);
        }
        else {
          task_7(n, ++k);
        }
      }
      
      static String task_8(String s) {
        if (s.length() == 1) {
          return "YES";
        } else {
          if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
            if (s.length() == 2) {
              return "YES";
            }
            return task_8(s.substring(1, s.length() - 1));
          } else {
            return "NO";
          }
        }
      }
      
      static int task_9(int a, int b) {
        if (a > b + 1) {
          return 0;
        }
        if (a == 0 || b == 0) {
          return 1;
        }
        return task_9(a, b - 1) + task_9(a - 1, b - 1);
      }
    
      static int task__10(int n, int i) {
        return (n == 0) ? i : task__10(n / 10, i * 10 + n % 10);
      }
    
      static int task_11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
          int m = in.nextInt();
          if (m == 1) {
            return task_11() + n + m;
          } else {
            int k = in.nextInt();
            if (k == 1) {
              return task_11() + n + m + k;
            } else {
              return n + m + k;
            }
          }
        } else {
          int m = in.nextInt();
          if (m == 1) {
            return task_11() + n + m;
          } else {
            return n + m;
          }
        }
      }
      
      static void task_12() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
          if (n % 2 == 1) {
            System.out.println("  Число: " + n);
            task_12();
          } else {
            task_12();
          }
        }
      }
    
      static void task_13() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
          int m = in.nextInt();
          System.out.println("  Число: " + n);
          if (m > 0) {
            task_13();
          }
        }
      }
    
      static String task_14(int n) {
        if (n < 10) {
          return Integer.toString(n);
        }
        else {
          return task_14(n / 10) + " " + n % 10;
        }
      }

      static String task_14_2(int n2) {
        if (n2 < 10) {
            return Integer.toString(n2);
        }
        else {
            System.out.print(n2 % 10 + " ");
            return task_14_2(n2 / 10);
        }
      }
    
      static void task_15(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
          if (n > max) {
            task_15(n, 1);
          }
          else if (n == max) {
            task_15(max, ++count);
          }
          else {
            task_15(max, count);
          }
        } else {
          System.out.print("  Результат: " + count);
        }
      }
    
      static int task_16() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
          return 0;
        } 
        else {
          return Math.max(n, task_16());
        }
      }
    
      public static void main(String[] args) {
        // 1)
        System.out.print("1) Треугольная последовательность: ");
        task_1(10);
        System.out.println();
    
        // 2)
        System.out.print("2) От 1 до n. Дано натуральное число n. Выведите все числа от 1 до n. Введи число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("  Все числа от 1 до n: ");
        for (int i = 1; i <= n; i++) {
          System.out.print(i + " ");
        }
    
        // 3)
        System.out.println("\n3) Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.");
        System.out.print("  Введи число А: ");
        int A = scanner.nextInt();
        System.out.print("  Введи число B: ");
        int B = scanner.nextInt();
        System.out.print("  Вcе числа: ");
        if (A > B)
          for (int i = A; i >= B; i--) {
            System.out.print(i + " ");
          }
        else
          for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
          }
      
        // 4)
        System.out.println("\n4) Даны натуральные числа k и s. Определите, сколько существует k-значных натуральных чисел, сумма цифр которых равна d.");
        System.out.print("  Введи число k: ");
        int k = scanner.nextInt();
        System.out.print("  Введи число s: ");
        int s = scanner.nextInt();
        System.out.print("  Кол-во чисел: " + task_4(0, 0, k, s));
    
        // 5)
        System.out.println("\n5) Сумма цифр числа. Дано натуральное число N. Вычислите сумму его цифр.");
        System.out.print("  Введи число N: ");
        int N = scanner.nextInt();
        System.out.println("  Сумма цифр числа N: " + task_5(N));
    
        // 6)
        System.out.println("6) Проверка числа на простоту. Дано натуральное число n>1. Проверьте, является ли оно простым.");
        System.out.print("  Введи число N: ");
        N = scanner.nextInt();
        System.out.println("  Результат: " + task_6(N, 2));
    
        // 7)
        System.out.println("7)  Разложение на множители. Дано натуральное число n>1. Выведите все простые множители этого числа в порядке неубывания с учетом кратности.");
        System.out.print("  Введи число N: ");
        N = scanner.nextInt();
        System.out.print("  Результат: ");
        task_7(N, 2);
    
        // 8)
        System.out.println("\n8) Палиндром. Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом.");
        System.out.print("  Введи слово: ");
        String line = scanner.next();
        System.out.println("  Результат: " + task_8(line));
    
        // 9)
        System.out.println("9) Без двух нулей. Даны числа a и b. Определите, сколько существует последовательностей из a нулей и b единиц, в которых никакие два нуля не стоят рядом.");
        System.out.print("  Введи число a: ");
        int a = scanner.nextInt();
        System.out.print("  Введи число b: ");
        int b = scanner.nextInt();
        System.out.print("  Кол-во последовательностей: " + task_9(a, b));
    
        // 10)
        System.out.println("\n10) Разворот числа. Дано число n, десятичная запись которого не содержит нулей. Получите число, записанное теми же цифрами, но в противоположном порядке.");
        System.out.print("  Введи число: ");
        N = scanner.nextInt();
        System.out.println("  Результат: " + task__10(N, 0));
    
        // 11)
        System.out.println("11) Количество единиц. Дана последовательность натуральных чисел (одно число в строке), завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой последовательности встречается число 1.");
        System.out.println("  Введи числа: ");
        System.out.print("  Результат: " + task_11());
    
        // 12)
        System.out.println( "\n12) Вывести нечетные числа последовательности. Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0. Выведите все нечетные числа из этой последовательности, сохраняя их порядок.");
        System.out.println("  Введи числа: ");
        //System.out.println("  Результат: ");
        task_12();
    
        // 13)
        System.out.println("13) Вывести члены последовательности с нечетными номерами. Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0. Выведите первое, третье, пятое и т.д. из введенных чисел. Завершающий ноль выводить не надо.");
        System.out.print("  Введи числа: ");
        task_13();
    
        // 14) 
        System.out.println( "\n14) Цифры числа слева направо. Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.");
        System.out.println("  Введи числа: ");
        a = scanner.nextInt();
        System.out.print("  Результат: " + task_14(a));
    
        // 15)
        System.out.println( "\n15) Цифры числа справа налево. Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами или новыми строками.");
        System.out.println("  Введи числа: ");
        a = scanner.nextInt();
        System.out.print("  Результат: " + task_14_2(a));

        // 16)
        System.out.println( "\n16) Количество элементов, равных максимуму. Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0. Определите, какое количество элементов этой последовательности, равны ее наибольшему элементу.");
        System.out.println("  Введи числа: ");
        task_15(0, 0);
    
        // 17)
        System.out.println("\n17) Максимум последовательности. Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0. Определите наибольшее значение числа в этой последовательности.");
        System.out.println("  Введи числа: ");
        a =  task_16();
        System.out.print("  Результат: " + a);
    
        scanner.close();
      }
    }