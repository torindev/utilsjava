import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Lgi {

    public static boolean LOG = true;
    private static final String SEPAR = ": ";
    private static long sStartTime = 0;

    // Выводит в лог имя класса и имя метода, в котором был вызван
    public static void p() {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            log("[" + className + "." + method + "]");
        }
    }

    // Выводит в лог имя класса + String переданный в параметре
    public static void p(String s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            log("[" + className + "." + method + "]" + SEPAR + s);
        }
    }

    public static void p(int s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            log("[" + className + "." + method + "]" + SEPAR + s);
        }
    }

    public static void p(double s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            log("[" + className + "." + method + "]" + SEPAR + s);
        }
    }

    public static void p(float s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            log("[" + className + "." + method + "]" + SEPAR + s);
        }
    }

    public static void p(long s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            log("[" + className + "." + method + "]" + SEPAR + s);
        }
    }

    public static void p(char s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            log("[" + className + "." + method + "]" + SEPAR + s);
        }
    }

    public static void p(byte s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            log("[" + className + "." + method + "]" + SEPAR + s);
        }
    }

    public static void p(boolean s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            log("[" + className + "." + method + "]" + SEPAR + s);
        }
    }

    public static void p(char[] s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            StringBuilder sb = new StringBuilder("");
            for (char c : s) {
                sb.append(c);
            }
            log("[" + className + "." + method + "]" + SEPAR + sb.toString());
        }
    }

    public static void p(long[] s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            StringBuilder sb = new StringBuilder("");
            for (long c : s) {
                sb.append(c).append("; ");
            }
            log("[" + className + "." + method + "]" + SEPAR + sb.toString());
        }
    }

    public static void p(List<String> s) {
        if (LOG) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getFileName().split("\\.")[0];
            String method = ste.getMethodName();
            StringBuilder sb = new StringBuilder("");
            for (String c : s) {
                sb.append(c).append("; ");
            }
            log("[" + className + "." + method + "]" + SEPAR + sb.toString());
        }
    }

    public static void userOut(String s) {
        if (LOG) {
            log(s + "");
        }
    }

    public static void userOut(char s) {
        if (LOG) {
            log(s + "");
        }
    }

    public static void userOut(int s) {
        if (LOG) {
            log(s + "");
        }
    }

    public static void userOut(long s) {
        if (LOG) {
            log(s + "");
        }
    }

    public static void userOut(boolean s) {
        if (LOG) {
            log(s + "");
        }
    }

    public static void userOut(float s) {
        if (LOG) {
            log(s + "");
        }
    }

    public static void userOut(double s) {
        if (LOG) {
            log(s + "");
        }
    }

    // просто перенос строки
    public static void separatorLine() {
        if (LOG) {
            log("\t-\t-\t-\t-\t-");
        }
    }

    // выводит в лог String s и Exception
    public static void err(String s, Exception ex) {
        if (LOG) {
            log(s);
            System.out.println(ex);
        }
    }

    // выводит класс, метод, и строку, в которой был вызван
    public static void err() {
        if (LOG) {
            StackTraceElement ste = null;
            ste = Thread.currentThread().getStackTrace()[2];
            String str = ste.getClassName() + "." + ste.getMethodName() +
                    "(" + ste.getFileName() + ":" + ste.getLineNumber() + ")";
            log(str);
        }
    }
    // выводит класс, метод, и строку, в которой был вызван + текст
    public static void err(String s) {
        if (LOG) {
            StackTraceElement ste = null;
            ste = Thread.currentThread().getStackTrace()[2];
            String str = ste.getClassName() + "." + ste.getMethodName() +
                    "(" + ste.getFileName() + ":" + ste.getLineNumber() + ")";
            log(str + " > " + s);
        }
    }


    public static long time() {
        return System.currentTimeMillis();
    }

    public static long getUsedMemoryBytes() {
        return Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    }



    // используется для замера промежутка времени
    public static void startTime() {
        sStartTime = time();
    }

    // используется для замера промежутка времени, возвращает время между
    // startTime и endTime
    public static void endTime() {
        if (sStartTime == 0) {
            log("Error, startTime = 0. Don't use endTime() without startTime() before.");
            return;
        } else {
            long diff = time() - sStartTime;
            sStartTime = 0;
            log("Time: " + diff + " ms.");
        }
    }

    public static String getFormatDate(long d) {
        return new SimpleDateFormat("dd MMMM yyyy 'at' HH:mm:ss", Locale.getDefault()).format(new Date(d));
    }

    public static String getFormatDate(long d, String format) {
        return new SimpleDateFormat(format, Locale.getDefault()).format(new Date(d));
    }

    private static void log(String s) {
        System.out.println(s);
    }
}