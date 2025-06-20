/*
 * Qualtrics API
 * This is the API specification for Qualtrics platform.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pl.wtx.qualtrics.api.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Comparison
 */
@JsonAdapter(Comparison.Adapter.class)
public enum Comparison {
  
  EQ("eq"),
  
  NEQ("neq"),
  
  GT("gt"),
  
  LT("lt"),
  
  GTE("gte"),
  
  LTE("lte"),
  
  TRUE("true"),
  
  FALSE("false"),
  
  NOT_EMPTY("notEmpty"),
  
  EMPTY("empty");

  private String value;

  Comparison(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Comparison fromValue(String value) {
    for (Comparison b : Comparison.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Comparison> {
    @Override
    public void write(final JsonWriter jsonWriter, final Comparison enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Comparison read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Comparison.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Comparison.fromValue(value);
  }
}

