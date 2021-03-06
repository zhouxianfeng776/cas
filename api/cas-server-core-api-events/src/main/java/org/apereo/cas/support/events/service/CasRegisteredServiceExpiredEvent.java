package org.apereo.cas.support.events.service;

import org.apereo.cas.services.RegisteredService;

import lombok.ToString;

/**
 * This is {@link CasRegisteredServiceExpiredEvent} that is signaled
 * when a registered service is expired.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
@ToString
public class CasRegisteredServiceExpiredEvent extends BaseCasRegisteredServiceEvent {

    private static final long serialVersionUID = 291168299766263298L;

    private final RegisteredService registeredService;

    /**
     * Instantiates a new event.
     *
     * @param source            the source
     * @param registeredService the registered service
     */
    public CasRegisteredServiceExpiredEvent(final Object source, final RegisteredService registeredService) {
        super(source);
        this.registeredService = registeredService;
    }

    public RegisteredService getRegisteredService() {
        return this.registeredService;
    }
}
