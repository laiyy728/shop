package com.laiyy.shop.model.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.laiyy.shop.common.constants.SexConstant;

import java.io.IOException;

/**
 * @author laiyy
 * @date 2019/6/28 16:48
 * description：
 */
public class SexSerializer extends JsonSerializer<Integer> {
    @Override
    public void serialize(Integer sex, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        switch (sex) {
            case SexConstant.MAN:
                jsonGenerator.writeString("男性");
                break;
            case SexConstant.FEMALE:
                jsonGenerator.writeString("女性");
                break;
            case SexConstant.OTHER:
                jsonGenerator.writeString("其他");
                break;
            default:
                jsonGenerator.writeString("保密");
                break;
        }

    }
}
