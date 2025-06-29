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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pl.wtx.qualtrics.api.client.model.ImportReportEntry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.wtx.qualtrics.api.client.invoker.JSON;

/**
 * Response information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class GetImportReportResponseResults {
  public static final String SERIALIZED_NAME_IMPORT_REPORT_ENTRIES = "importReportEntries";
  @SerializedName(SERIALIZED_NAME_IMPORT_REPORT_ENTRIES)
  @javax.annotation.Nullable
  private List<ImportReportEntry> importReportEntries = new ArrayList<>();

  public GetImportReportResponseResults() {
  }

  public GetImportReportResponseResults importReportEntries(@javax.annotation.Nullable List<ImportReportEntry> importReportEntries) {
    this.importReportEntries = importReportEntries;
    return this;
  }

  public GetImportReportResponseResults addImportReportEntriesItem(ImportReportEntry importReportEntriesItem) {
    if (this.importReportEntries == null) {
      this.importReportEntries = new ArrayList<>();
    }
    this.importReportEntries.add(importReportEntriesItem);
    return this;
  }

  /**
   * Report entries of for the response information.
   * @return importReportEntries
   */
  @javax.annotation.Nullable
  public List<ImportReportEntry> getImportReportEntries() {
    return importReportEntries;
  }

  public void setImportReportEntries(@javax.annotation.Nullable List<ImportReportEntry> importReportEntries) {
    this.importReportEntries = importReportEntries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetImportReportResponseResults getImportReportResponseResults = (GetImportReportResponseResults) o;
    return Objects.equals(this.importReportEntries, getImportReportResponseResults.importReportEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importReportEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImportReportResponseResults {\n");
    sb.append("    importReportEntries: ").append(toIndentedString(importReportEntries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("importReportEntries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetImportReportResponseResults
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetImportReportResponseResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetImportReportResponseResults is not found in the empty JSON string", GetImportReportResponseResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetImportReportResponseResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetImportReportResponseResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("importReportEntries") != null && !jsonObj.get("importReportEntries").isJsonNull()) {
        JsonArray jsonArrayimportReportEntries = jsonObj.getAsJsonArray("importReportEntries");
        if (jsonArrayimportReportEntries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("importReportEntries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `importReportEntries` to be an array in the JSON string but got `%s`", jsonObj.get("importReportEntries").toString()));
          }

          // validate the optional field `importReportEntries` (array)
          for (int i = 0; i < jsonArrayimportReportEntries.size(); i++) {
            ImportReportEntry.validateJsonElement(jsonArrayimportReportEntries.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetImportReportResponseResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetImportReportResponseResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetImportReportResponseResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetImportReportResponseResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetImportReportResponseResults>() {
           @Override
           public void write(JsonWriter out, GetImportReportResponseResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetImportReportResponseResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetImportReportResponseResults given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetImportReportResponseResults
   * @throws IOException if the JSON string is invalid with respect to GetImportReportResponseResults
   */
  public static GetImportReportResponseResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetImportReportResponseResults.class);
  }

  /**
   * Convert an instance of GetImportReportResponseResults to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

