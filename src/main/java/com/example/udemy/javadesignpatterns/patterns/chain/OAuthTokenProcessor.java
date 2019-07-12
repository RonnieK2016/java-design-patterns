package com.example.udemy.javadesignpatterns.patterns.chain;

public class OAuthTokenProcessor implements AuthProcessor {

    private AuthProcessor nextProcessor;

    public OAuthTokenProcessor(AuthProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public boolean authorize(AuthenticationProvider authProvider) {
        if(authProvider instanceof OAuthTokenProvider) {
            return true;
        }
        else if(nextProcessor != null) {
            return nextProcessor.authorize(authProvider);
        }

        return false;
    }
}
