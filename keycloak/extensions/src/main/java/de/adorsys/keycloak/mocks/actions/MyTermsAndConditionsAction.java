package de.adorsys.keycloak.mocks.actions;

import com.google.auto.service.AutoService;
import org.keycloak.Config;
import org.keycloak.authentication.RequiredActionContext;
import org.keycloak.authentication.RequiredActionFactory;
import org.keycloak.authentication.RequiredActionProvider;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class MyTermsAndConditionsAction implements RequiredActionProvider {
    @Override
    public void evaluateTriggers(RequiredActionContext context) {

    }

    @Override
    public void requiredActionChallenge(RequiredActionContext context) {

    }

    @Override
    public void processAction(RequiredActionContext context) {

    }

    @Override
    public void close() {

    }

    @AutoService(RequiredActionFactory.class)
    public static class Factory implements RequiredActionFactory {

        @Override
        public String getId() {
            return "my_terms_and_conditions";
        }

        @Override
        public String getDisplayText() {
            return "my_terms_and_conditions";
        }

        @Override
        public RequiredActionProvider create(KeycloakSession session) {
            return new MyTermsAndConditionsAction();
        }

        @Override
        public void init(Config.Scope config) {

        }

        @Override
        public void postInit(KeycloakSessionFactory factory) {

        }

        @Override
        public void close() {

        }
    }
}
