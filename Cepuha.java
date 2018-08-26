import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cepuha {
    static Framet frame;
    final static String[] uvestions = {"Кто?", "С кем?", "Где?", "Когда?", "Что делали?", "Что получилось?"};
    static ArrayList<ArrayList<String>> users = new ArrayList<>(3);
    static int userCount = 3, i = 0;
    //static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        frame = new Framet();
        intializ();
    }

    public static void intializ() {
        for (int j = 0; j < userCount; j++) {
            users.add(new ArrayList<String>(6));
        }
    }

    public static void setLable() {
        frame.label.setText("User" + ((i % userCount) + 1) + ": " + uvestions[i / userCount]);
    }

    public static void getInformation() {
        users.get((i+i/userCount) % userCount).add(frame.textArea.getText());
        frame.textArea.setText("");
    }

    public static String finish() {
        StringBuilder builder = new StringBuilder();
        for (int t = 0; t < userCount; t++) {
            builder.append("user" + t + ":\n");
            for (int j = 0; j < 6; j++) {
                builder.append(users.get(t).get(j) + "\n");
            }
        }
        return builder.toString();
    }
}
