package calculator;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/zofia/gitProjects/programowanieObiektowe2019/dolars/dolar.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String st;
        HashMap<String, Double> values = new HashMap<String, Double>();
        reader.readLine();
        while ((st = reader.readLine()) != null) {
            String[] line = st.split("\t");
            String code = line[1];
            Double value = Double.parseDouble(line[2]);
            values.put(code, value);
        }
        System.out.println(values.get("EUR"));
    }
}