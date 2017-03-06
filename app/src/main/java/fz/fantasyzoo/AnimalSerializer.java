package fz.fantasyzoo;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * Created by user on 06/03/2017.
 */

public class AnimalSerializer implements JsonSerializer<Animal> {
public JsonElement serialize(Animal src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.toString());
        }
        }