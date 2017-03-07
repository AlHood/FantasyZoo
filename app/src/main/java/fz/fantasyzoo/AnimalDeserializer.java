package fz.fantasyzoo;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by user on 06/03/2017.
 */

public class AnimalDeserializer implements JsonDeserializer<Animal> {
    public Animal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        String info = json.getAsJsonPrimitive().getAsString();

//        return new Animal(json.getAsJsonPrimitive().getAsString());
        return new Troll();
    }
}

//reminder - at the close of play we were interested in ensuring the serializers and deserializers were all correclty registered
//and to give the above method the ability to acquire and output the correct class