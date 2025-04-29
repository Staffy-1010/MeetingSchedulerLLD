package MeetingPkg;

import java.util.Random;
import java.util.UUID;

public class RandomIdGenerator {
    public static String getRandomStringId(){
        String randomId = UUID.randomUUID().toString();
        return randomId;
    }

    private static final Random random = new Random();

    public static int getRandomIntegerId() {
        int randomInt = 100000 + random.nextInt(900000); // generates a 6-digit random number
        return randomInt;
    }
}