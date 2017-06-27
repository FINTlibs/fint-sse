package no.fint.sse;

import lombok.AccessLevel;
import lombok.Setter;
import org.glassfish.jersey.media.sse.EventListener;

import java.util.Collections;
import java.util.Map;

class FintSseClient {
    private EventListener listener;
    private String[] names;
    @Setter(AccessLevel.PACKAGE)
    private Map<String, String> headers;

    public FintSseClient(EventListener listener, String[] names) {
        this.listener = listener;
        this.headers = Collections.emptyMap();
        this.names = names;
    }

    public FintSseClient(EventListener listener, Map<String, String> headers, String[] names) {
        this.listener = listener;
        this.headers = headers;
        this.names = names;
    }

    public EventListener getListener() {
        return listener;
    }

    public String[] getNames() {
        return names;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}
