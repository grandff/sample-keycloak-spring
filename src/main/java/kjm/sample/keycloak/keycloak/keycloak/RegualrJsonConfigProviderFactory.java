package kjm.sample.keycloak.keycloak.keycloak;

import java.util.Properties;

import org.keycloak.common.util.SystemEnvProperties;
import org.keycloak.services.util.JsonConfigProviderFactory;

public class RegualrJsonConfigProviderFactory extends JsonConfigProviderFactory {

    @Override
    protected Properties getProperties() {
        return new SystemEnvProperties(System.getenv());
    }
}
