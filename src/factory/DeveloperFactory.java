package factory;

public class DeveloperFactory {

    public String assignDeveloper(String type) {
        switch (type) {
            case "Android" -> {
                return new AndroidDeveloper().develop();
            } case "Java" -> {
                return new JavaDeveloper().develop();
            }
        }
        return null;
    }
}
