package com.example.udemy.javadesignpatterns.patterns.chain;

public class UserAndPasswordProcessor implements AuthProcessor {

    private AuthProcessor nextProcessor;

    public UserAndPasswordProcessor(AuthProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public boolean authorize(AuthenticationProvider authProvider) {
        if(authProvider instanceof UsernamePasswordProvider) {
            return true;
        }
        else if(nextProcessor != null) {
            return nextProcessor.authorize(authProvider);
        }

        return false;
    }
}
