package annotation.exercise.deprecated;

public class LegacyAPI {

    @Deprecated
    public void oldFeature(){
        System.out.println("This is an old feature!! Use latest feature");
    }

    public void newFeature(){
        System.out.println("The latest feature with latest security patch");
    }



}
