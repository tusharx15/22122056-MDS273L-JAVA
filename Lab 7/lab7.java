import java.io.File; //package imported for file handling
import java.util.*; //package imported for Scanner class

import java.io.*;

public class lab7 {

    static double[] mean(double sel[], double sew[], double pel[], double pew[]) {
        double m1, m2, m3, m4;

        double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
        for (int j = 0; j < 150; j++) {
            s1 = s1 + sel[j];
            s2 = s2 + sew[j];
            s3 = s3 + pel[j];
            s4 = s4 + pew[j];

            // System.out.println(sel[i]);

        }
        m1 = s1 / 150;
        m2 = s2 / 150;
        m3 = s3 / 150;
        m4 = s4 / 150;

        double mn[] = { m1, m2, m3, m4 };

        return mn;

    }

    static double[] median(double sel[], double sew[], double pel[], double pew[]) {
        int m11 = 150 / 2;
        double me1 = sel[m11];
        double me2 = sew[m11];
        double me3 = pel[m11];
        double me4 = pew[m11];

        double med[] = { me1, me2, me3, me4 };

        return med;
    }

    static double mode(double sel[]) {
        double maxValue = 0.0;
        int maxCount = 0, i, j;

        for (i = 0; i < sel.length; i++) {
            int count = 0;
            for (j = 0; j < sel.length; ++j) {
                if (sel[j] == sel[i])
                    ++count;

            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = sel[i];
            }
        }

        return maxValue;
    }

    static double[] minmax(double sel[]) {
        double min = sel[0];
        double max = sel[149];
        double mint[] = { min, max };
        return mint;
    }

    public static void main(String[] args) {
        try {
            File file = new File("D:\\Tushar\\CHRIST DOCS\\SEM-II\\JAVA\\22122056-MDS273L-JAVA\\Lab 7\\Iris.csv");
            if (file.exists()) {
                System.out.println("File exists..");
                Scanner sc = new Scanner(file);
                String str = "";
                while (sc.hasNextLine()) {
                    str = str + sc.nextLine().trim() + ",";
                }

                String sl[] = new String[150];
                String sw[] = new String[150];
                String pl[] = new String[150];
                String pw[] = new String[150];
                String dt[] = new String[936];

                dt = str.split(",");

                // System.out.println(Arrays.toString(dt));

                int i = 0;
                int c = 0;
                int d = 0;
                int j = 0;

                for (int a = 7; a < dt.length; a += 6) {
                    // System.out.println(dt[a]);
                    sl[i] = dt[a];
                    i += 1;
                }
                for (int b = 8; b < dt.length; b += 6) {
                    // System.out.println(dt[b]);
                    sw[c] = dt[b];
                    c += 1;
                }
                for (int l = 9; l < dt.length; l += 6) {
                    // System.out.println(dt[b]);
                    pl[d] = dt[l];
                    d += 1;
                }
                for (int p = 10; p < dt.length; p += 6) {
                    // System.out.println(dt[p]);
                    pw[j] = dt[p];
                    j += 1;
                }

                // double m1,m2,m3,m4;

                double[] sel = Arrays.stream(sl).mapToDouble(Double::parseDouble).toArray();
                double[] sew = Arrays.stream(sw).mapToDouble(Double::parseDouble).toArray();
                double[] pel = Arrays.stream(pl).mapToDouble(Double::parseDouble).toArray();
                double[] pew = Arrays.stream(pw).mapToDouble(Double::parseDouble).toArray();

                System.out.println("***Mean****");
                String arr[]={"Sepal length","Sepal width","Petal length","Petal width"};
                int iii = 0;
                for (double mm : mean(sel, sew, pel, pew)) {
                    
                    System.out.println(arr[iii]+ "\t" + mm);
                    iii++;

                }
                System.out.println();

                double temp;
                for (int n = 0; n < 150; n++) {
                    for (int k = 0; k < 150; k++) {
                        if (sel[k] > sel[n]) {
                            temp = sel[n];
                            sel[n] = sel[k];
                            sel[k] = temp;
                        }
                        if (sew[k] > sew[k]) {
                            temp = sew[n];
                            sew[n] = sew[k];
                            sew[k] = temp;
                        }
                        if (pel[k] > pel[n]) {
                            temp = pel[n];
                            pel[n] = pel[k];
                            pel[k] = temp;
                        }
                        if (pew[k] > pew[n]) {
                            temp = pew[n];
                            pew[n] = pew[k];
                            pew[k] = temp;

                        }
                    }
                }
                System.out.println("**Median***");

                int cu=0;

                for (double kk : median(sel, sew, pel, pew)) {
                    System.out.println(arr[cu]+"\t"+kk);
                

                }
                System.out.println("****Mode*****");

                System.out.println(" Sepal length: \t" + mode(sel));
                System.out.println(" Sepal width: \t" + mode(sew));
                System.out.println(" Petal length:\t" + mode(pel));
                System.out.println(" Petal width: \t" + mode(pew));

                System.out.println();

                System.out.println("****MinMax*****");

                System.out.println("Minimum " + " Maximum");
                for (double kk : minmax(sel)) {
                    System.out.print(kk + "\t");
                }
                System.out.println();
                for (double kk : minmax(sew)) {
                    System.out.print(kk + "\t");

                }
                System.out.println();
                for (double kk : minmax(pel)) {
                    System.out.print(kk + "\t");
                }
                System.out.println();
                for (double kk : minmax(pew)) {
                    System.out.print(kk + "\t");
                }
                System.out.println();

                
            } else {
                System.out.println("File does not exist");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}