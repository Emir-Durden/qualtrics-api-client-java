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
import java.util.Arrays;

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
 * ElementsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class ElementsInner {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contactId";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  @javax.annotation.Nonnull
  private String contactId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_EXT_REF = "extRef";
  @SerializedName(SERIALIZED_NAME_EXT_REF)
  @javax.annotation.Nullable
  private String extRef;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  @javax.annotation.Nullable
  private String language;

  public static final String SERIALIZED_NAME_UNSUBSCRIBED = "unsubscribed";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBED)
  @javax.annotation.Nullable
  private Boolean unsubscribed;

  public ElementsInner() {
  }

  public ElementsInner contactId(@javax.annotation.Nonnull String contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * 
   * @return contactId
   */
  @javax.annotation.Nonnull
  public String getContactId() {
    return contactId;
  }

  public void setContactId(@javax.annotation.Nonnull String contactId) {
    this.contactId = contactId;
  }


  public ElementsInner firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * THe contact&#39;s first name.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public ElementsInner lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The contact&#39;s last name.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public ElementsInner email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The contact&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public ElementsInner phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The contact&#39;s phone number.
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public ElementsInner extRef(@javax.annotation.Nullable String extRef) {
    this.extRef = extRef;
    return this;
  }

  /**
   * External reference information for the contact.
   * @return extRef
   */
  @javax.annotation.Nullable
  public String getExtRef() {
    return extRef;
  }

  public void setExtRef(@javax.annotation.Nullable String extRef) {
    this.extRef = extRef;
  }


  public ElementsInner language(@javax.annotation.Nullable String language) {
    this.language = language;
    return this;
  }

  /**
   * The contact&#39;s preferred language.
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(@javax.annotation.Nullable String language) {
    this.language = language;
  }


  public ElementsInner unsubscribed(@javax.annotation.Nullable Boolean unsubscribed) {
    this.unsubscribed = unsubscribed;
    return this;
  }

  /**
   * Whether the contact is unsubscribed.
   * @return unsubscribed
   */
  @javax.annotation.Nullable
  public Boolean getUnsubscribed() {
    return unsubscribed;
  }

  public void setUnsubscribed(@javax.annotation.Nullable Boolean unsubscribed) {
    this.unsubscribed = unsubscribed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementsInner elementsInner = (ElementsInner) o;
    return Objects.equals(this.contactId, elementsInner.contactId) &&
        Objects.equals(this.firstName, elementsInner.firstName) &&
        Objects.equals(this.lastName, elementsInner.lastName) &&
        Objects.equals(this.email, elementsInner.email) &&
        Objects.equals(this.phone, elementsInner.phone) &&
        Objects.equals(this.extRef, elementsInner.extRef) &&
        Objects.equals(this.language, elementsInner.language) &&
        Objects.equals(this.unsubscribed, elementsInner.unsubscribed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, firstName, lastName, email, phone, extRef, language, unsubscribed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementsInner {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    extRef: ").append(toIndentedString(extRef)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
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
    openapiFields.add("contactId");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("extRef");
    openapiFields.add("language");
    openapiFields.add("unsubscribed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contactId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ElementsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ElementsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ElementsInner is not found in the empty JSON string", ElementsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ElementsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ElementsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ElementsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contactId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactId").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("extRef") != null && !jsonObj.get("extRef").isJsonNull()) && !jsonObj.get("extRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extRef").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ElementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ElementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ElementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ElementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ElementsInner>() {
           @Override
           public void write(JsonWriter out, ElementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ElementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ElementsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ElementsInner
   * @throws IOException if the JSON string is invalid with respect to ElementsInner
   */
  public static ElementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ElementsInner.class);
  }

  /**
   * Convert an instance of ElementsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

