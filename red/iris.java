import java.util.ArrayList;
import java.util.Collections;

public class iris{

    public static void main(String[] args) {

        // Create an ArrayList to store the iris dataset
        ArrayList<iris> dataset = new ArrayList<iris>();

        // Load the dataset from a file, or create an array of Iris objects

        // Calculate summary statistics for each attribute
        double[] sepalLengths = new double[dataset.size()];
        double[] sepalWidths = new double[dataset.size()];
        double[] petalLengths = new double[dataset.size()];
        double[] petalWidths = new double[dataset.size()];

        for (int i = 0; i < dataset.size(); i++) {
            sepalLengths[i] = dataset.get(i).getSepalLength();
            sepalWidths[i] = dataset.get(i).getSepalWidth();
            petalLengths[i] = dataset.get(i).getPetalLength();
            petalWidths[i] = dataset.get(i).getPetalWidth();
        }
         // Calculate summary statistics for SepalLengthCm
         double sepalLengthMean = mean(sepalLengths);
         double sepalLengthMedian = median(sepalLengths);
         double sepalLengthMode = mode(sepalLengths);
         double sepalLengthMin = min(sepalLengths);
         double sepalLengthMax = max(sepalLengths);

         
        System.out.println("SepalLengthCm: Mean = " + sepalLengthMean + ", Median = " + sepalLengthMedian +
        ", Mode = " + sepalLengthMode + ", Min = " + sepalLengthMin + ", Max = " + sepalLengthMax);

        // Calculate summary statistics for SepalWidthCm
        double sepalWidthMean = mean(sepalWidths);
        double sepalWidthMedian = median(sepalWidths);
        double sepalWidthMode = mode(sepalWidths);
        double sepalWidthMin = min(sepalWidths);
        double sepalWidthMax = max(sepalWidths);

        System.out.println("SepalWidthCm: Mean = " + sepalWidthMean + ", Median = " + sepalWidthMedian +
        ", Mode = " + sepalWidthMode + ", Min = " + sepalWidthMin + ", Max = " + sepalWidthMax);

        // Calculate summary statistics for PetalLengthCm
        double petalLengthMean = mean(petalLengths);
        double petalLengthMedian = median(petalLengths);
        double petalLengthMode = mode(petalLengths);
        double petalLengthMin = min(petalLengths);
        double petalLengthMax = max(petalLengths);

        System.out.println("PetalLengthCm: Mean = " + petalLengthMean + ", Median = " + petalLengthMedian +
                ", Mode = " + petalLengthMode + ", Min = " + petalLengthMin + ", Max = " + petalLengthMax);

        // Calculate summary statistics for PetalWidthCm
        double petalWidthMean = mean(petalWidths);
        double petalWidthMedian = median(petalWidths);
        double petalWidthMode = mode(petalWidths);
        double petalWidthMin = min(petalWidths);
        double petalWidthMax = max(petalWidths);

        System.out.println("PetalWidthCm: Mean = " + petalWidthMean + ", Median = " + petalWidthMedian +
                ", Mode = " + petalWidthMode + ", Min = " + petalWidthMin + ", Max = " + petalWidthMax);

    }
}

