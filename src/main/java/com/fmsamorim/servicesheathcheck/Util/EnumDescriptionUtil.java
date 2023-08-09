package com.fmsamorim.servicesheathcheck.Util;
import java.lang.reflect.Field;

public class EnumDescriptionUtil {
    public static String getDescription(Enum<?> value) {
        try {
            Field field = value.getDeclaringClass().getField(value.name());
            Description description = field.getAnnotation(Description.class);
            if (description != null) {
                return description.value();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
