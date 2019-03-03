package pl.saltsoft;

import com.google.gson.Gson;

public class motoryzacja {

    void serializacja(BMW bestBMW) {

        Gson gson = new Gson();
        String json = gson.toJson(bestBMW);

        System.out.println(json);
    }

    public void writeFile() {


    }
}