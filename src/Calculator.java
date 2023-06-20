import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    private double curse;

    public Calculator(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("course.txt"));
            this.curse = Double.parseDouble(br.readLine());
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public double getCurse() {
        return curse;
    }

    public void setCurse(double curse) {
        this.curse = curse;
    }
}
