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
import io.swagger.client.model.EmployeeDAO;
import io.swagger.client.model.EnclosureDAO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AnimalDAO
 */


public class AnimalDAO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("species")
  private String species = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("age")
  private Integer age = null;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("MALE"),
    FEMALE("FEMALE");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GenderEnum fromValue(String input) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return GenderEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("gender")
  private GenderEnum gender = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    SOLD("SOLD"),
    DEAD("DEAD");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  /**
   * Gets or Sets acquisitionType
   */
  @JsonAdapter(AcquisitionTypeEnum.Adapter.class)
  public enum AcquisitionTypeEnum {
    BOUGHT("BOUGHT"),
    OFFSPRING("OFFSPRING");

    private String value;

    AcquisitionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AcquisitionTypeEnum fromValue(String input) {
      for (AcquisitionTypeEnum b : AcquisitionTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AcquisitionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AcquisitionTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AcquisitionTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AcquisitionTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("acquisitionType")
  private AcquisitionTypeEnum acquisitionType = null;

  @SerializedName("enclosureDAO")
  private EnclosureDAO enclosureDAO = null;

  @SerializedName("employee")
  private EmployeeDAO employee = null;

  public AnimalDAO id(Long id) {
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

  public AnimalDAO species(String species) {
    this.species = species;
    return this;
  }

   /**
   * Get species
   * @return species
  **/
  @Schema(description = "")
  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public AnimalDAO name(String name) {
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

  public AnimalDAO age(Integer age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @Schema(description = "")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public AnimalDAO gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @Schema(description = "")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public AnimalDAO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AnimalDAO acquisitionType(AcquisitionTypeEnum acquisitionType) {
    this.acquisitionType = acquisitionType;
    return this;
  }

   /**
   * Get acquisitionType
   * @return acquisitionType
  **/
  @Schema(description = "")
  public AcquisitionTypeEnum getAcquisitionType() {
    return acquisitionType;
  }

  public void setAcquisitionType(AcquisitionTypeEnum acquisitionType) {
    this.acquisitionType = acquisitionType;
  }

  public AnimalDAO enclosureDAO(EnclosureDAO enclosureDAO) {
    this.enclosureDAO = enclosureDAO;
    return this;
  }

   /**
   * Get enclosureDAO
   * @return enclosureDAO
  **/
  @Schema(description = "")
  public EnclosureDAO getEnclosureDAO() {
    return enclosureDAO;
  }

  public void setEnclosureDAO(EnclosureDAO enclosureDAO) {
    this.enclosureDAO = enclosureDAO;
  }

  public AnimalDAO employee(EmployeeDAO employee) {
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @Schema(description = "")
  public EmployeeDAO getEmployee() {
    return employee;
  }

  public void setEmployee(EmployeeDAO employee) {
    this.employee = employee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalDAO animalDAO = (AnimalDAO) o;
    return Objects.equals(this.id, animalDAO.id) &&
        Objects.equals(this.species, animalDAO.species) &&
        Objects.equals(this.name, animalDAO.name) &&
        Objects.equals(this.age, animalDAO.age) &&
        Objects.equals(this.gender, animalDAO.gender) &&
        Objects.equals(this.status, animalDAO.status) &&
        Objects.equals(this.acquisitionType, animalDAO.acquisitionType) &&
        Objects.equals(this.enclosureDAO, animalDAO.enclosureDAO) &&
        Objects.equals(this.employee, animalDAO.employee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, species, name, age, gender, status, acquisitionType, enclosureDAO, employee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalDAO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    acquisitionType: ").append(toIndentedString(acquisitionType)).append("\n");
    sb.append("    enclosureDAO: ").append(toIndentedString(enclosureDAO)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
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