public class Kadai04 {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 75, 82},
                {74, 68, 50},
                {98, 58, 84}
        };

        double[] studentAverages = new double[scores.length];
        double[] subjectAverages = new double[scores[0].length];

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            studentAverages[i] = (double) sum / scores[i].length;
        }

        for (int j = 0; j < scores[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i][j];
            }
            subjectAverages[j] = (double) sum / scores.length;
        }

        System.out.println("\t\t国語\t数学\t理科\t学生平均");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("学生" + (i + 1) + "\t");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.printf("%.1f\n", studentAverages[i]);
        }

        System.out.print("教科平均\t");
        for (double avg : subjectAverages) {
            System.out.printf("%.1f\t", avg);
        }
        System.out.println();
    }
}
