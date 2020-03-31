package testFeature;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class TestGson {
    public static void main(String argsp[]){
        List<SamplePojo> samplePojos = new ArrayList<>();
        SamplePojoSub s1 = new SamplePojoSub(1);
        SamplePojoSub s2 = new SamplePojoSub(2);
        SamplePojoSub s3 = new SamplePojoSub(3);
        SamplePojo ss1 = new SamplePojo("a","a1",9,s1);
        SamplePojo ss2 = new SamplePojo("b","b1",9,s2);
        SamplePojo ss3 = new SamplePojo("c","c1",9,s3);
        samplePojos.add(ss1);
        samplePojos.add(ss2);
        samplePojos.add(ss3);
        Gson gson = new GsonBuilder().create();
        String op = gson.toJson(samplePojos);
        System.out.println(op);



    }
}
