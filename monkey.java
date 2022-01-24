package metodos;

import java.io.IOException;
import java.util.Locale;

public class regalo {
    public static void monos() throws IOException, InterruptedException {
        System.out.println("Te apetece ver un macaco?");
        Thread.sleep(1000);
        String SistemaOperativo = (System.getProperty("os.name")).toLowerCase(Locale.ROOT);
            if (SistemaOperativo.contains("windows")) {
                Runtime.getRuntime().exec("cmd /c" + "start msedge \"https://alfreditto.github.io/Recompensa/monkey.mp4\"");
            } else {
                if(SistemaOperativo.contains("linux")){
                    Runtime.getRuntime().exec("bash " + "firefox https://alfreditto.github.io/Recompensa/monkey.mp4");
                } else {
                Runtime.getRuntime().exec("open https://alfreditto.github.io/Recompensa/monkey.mp4");
                }
            }
    }
}