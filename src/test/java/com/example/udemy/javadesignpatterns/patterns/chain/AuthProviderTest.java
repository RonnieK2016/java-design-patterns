package com.example.udemy.javadesignpatterns.patterns.chain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AuthProviderTest {

    private AuthProcessor chain;

    @Before
    public void setUp() throws Exception {
        UserAndPasswordProcessor userAndPasswordProcessor = new UserAndPasswordProcessor(null);
        chain = new OAuthTokenProcessor(userAndPasswordProcessor);
    }

    @Test
    public void verifyUserIsAuthenticatedByUsernameAndPassword() {
        assertTrue(chain.authorize(new UsernamePasswordProvider()));
    }

    @Test
    public void verifyUserIsAuthenticatedByOAuthToken() {
        assertTrue(chain.authorize(new OAuthTokenProvider()));
    }

    @Test
    public void verifyAnonymousClientIsNotAuthenticated() {
        assertFalse(chain.authorize(new AnonymousClientProvider()));
    }
}
