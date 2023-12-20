package kjm.sample.keycloak.keycloak.keycloak;

import java.io.File;

import org.keycloak.Config.Scope;
import org.keycloak.common.Profile;
import org.keycloak.common.profile.PropertiesFileProfileConfigResolver;
import org.keycloak.common.profile.PropertiesProfileConfigResolver;
import org.keycloak.platform.PlatformProvider;
import org.keycloak.services.ServicesLogger;

public class SimplePlatformProvider implements PlatformProvider {
    public SimplePlatformProvider() {
        Profile.configure(new PropertiesProfileConfigResolver(System.getProperties()),
                new PropertiesFileProfileConfigResolver());
    }

    Runnable shutdownHook;

    @Override
    public void exit(Throwable arg0) {
        ServicesLogger.LOGGER.fatal(arg0);
        exit(1);
    }

    private void exit(int status) {
        new Thread() {
            @Override
            public void run() {
                System.exit(status);
            }
        }.start();
    }

    @Override
    public ClassLoader getScriptEngineClassLoader(Scope arg0) {
        return null;
    }

    @Override
    public File getTmpDirectory() {
        return new File(System.getProperty("java.io.tmpdir"));
    }

    @Override
    public String name() {
        return "oauth-authorization-server";
    }

    @Override
    public void onShutdown(Runnable arg0) {
        this.shutdownHook = arg0;
    }

    @Override
    public void onStartup(Runnable arg0) {
        arg0.run();
    }

}
