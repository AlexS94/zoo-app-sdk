/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SalesBooth
 */


public class SalesBooth {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets salesType
   */
  @JsonAdapter(SalesTypeEnum.Adapter.class)
  public enum SalesTypeEnum {
    EAT("EAT"),
    DRINK("DRINK"),
    SOUVENIR("SOUVENIR");

    private String value;

    SalesTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SalesTypeEnum fromValue(String input) {
      for (SalesTypeEnum b : SalesTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SalesTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SalesTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SalesTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SalesTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("salesType")
  private SalesTypeEnum salesType = null;

  public SalesBooth id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SalesBooth name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SalesBooth salesType(SalesTypeEnum salesType) {
    this.salesType = salesType;
    return this;
  }

   /**
   * Get salesType
   * @return salesType
  **/
  @Schema(description = "")
  public SalesTypeEnum getSalesType() {
    return salesType;
  }

  public void setSalesType(SalesTypeEnum salesType) {
    this.salesType = salesType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesBooth salesBooth = (SalesBooth) o;
    return Objects.equals(this.id, salesBooth.id) &&
        Objects.equals(this.name, salesBooth.name) &&
        Objects.equals(this.salesType, salesBooth.salesType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, salesType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesBooth {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    salesType: ").append(toIndentedString(salesType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}