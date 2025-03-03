package katagawa.test.shelter.config.dev;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class BrowserLauncher {

    @Value("${server.port:8080}")
    private int port;

    @EventListener(ApplicationReadyEvent.class)
    public void launchSwaggerUI() {
        String url = "http://localhost:" + port + "/swagger-ui/index.html";
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(url));
            } else {
                String osName = System.getProperty("os.name").toLowerCase();
                ProcessBuilder processBuilder;
                if (osName.contains("windows")) {
                    processBuilder = new ProcessBuilder("rundll32", "url.dll,FileProtocolHandler", url);
                } else if (osName.contains("mac")) {
                    processBuilder = new ProcessBuilder("open", url);
                } else { 
                    processBuilder = new ProcessBuilder("xdg-open", url);
                }
                processBuilder.start();
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
