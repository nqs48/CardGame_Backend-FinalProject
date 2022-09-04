package com.sofka.appservices;

import com.sofka.appservices.generic.StoredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class GsonEventSerializer implements StoredEvent.EventSerializer {
    @Override
    public <T extends DomainEvent> T deserialize(String aSerialization, Class<?> aType) {
        return (T) new Gson().fromJson(aSerialization, aType);
    }

    @Override
    public String serialize(DomainEvent object) {
        return new Gson().toJson(object);
    }
}