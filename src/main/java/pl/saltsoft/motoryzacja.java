package pl.saltsoft;

import com.google.gson.Gson;

public class motoryzacja<bestBMW> {

    void serializacja(BMW bestBMW) {

        Gson gson = new Gson();
        String json = gson.toJson(bestBMW);

        System.out.println(json);
    }

    public void writeFile() {


    }

    public BMW deserializacja(String json) {


        Gson gson = new Gson();
        BMW bestBMWAgain = gson.fromJson(json, BMW.class);
        return bestBMWAgain;
    }

}