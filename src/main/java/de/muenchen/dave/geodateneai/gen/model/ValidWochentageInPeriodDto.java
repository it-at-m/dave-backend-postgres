/*
 * DAVE GEODATA EAI
 * DAVE GEODATA EAI - Service zum Abfragen von Geoinformationen
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: unbekannt@muenchen.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.muenchen.dave.geodateneai.gen.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ValidWochentageInPeriodDto
 */
@JsonPropertyOrder({
  ValidWochentageInPeriodDto.JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_DI_MI_DO,
  ValidWochentageInPeriodDto.JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_MO_FR,
  ValidWochentageInPeriodDto.JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_SAMSTAG,
  ValidWochentageInPeriodDto.JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_SONNTAG_FEIERTAG,
  ValidWochentageInPeriodDto.JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_WERKTAG_FERIEN,
  ValidWochentageInPeriodDto.JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_MO_SO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValidWochentageInPeriodDto {
  public static final String JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_DI_MI_DO = "numberOfValidTagesTypDiMiDo";
  private Integer numberOfValidTagesTypDiMiDo;

  public static final String JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_MO_FR = "numberOfValidTagesTypMoFr";
  private Integer numberOfValidTagesTypMoFr;

  public static final String JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_SAMSTAG = "numberOfValidTagesTypSamstag";
  private Integer numberOfValidTagesTypSamstag;

  public static final String JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_SONNTAG_FEIERTAG = "numberOfValidTagesTypSonntagFeiertag";
  private Integer numberOfValidTagesTypSonntagFeiertag;

  public static final String JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_WERKTAG_FERIEN = "numberOfValidTagesTypWerktagFerien";
  private Integer numberOfValidTagesTypWerktagFerien;

  public static final String JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_MO_SO = "numberOfValidTagesTypMoSo";
  private Integer numberOfValidTagesTypMoSo;

  public ValidWochentageInPeriodDto() {
  }

  public ValidWochentageInPeriodDto numberOfValidTagesTypDiMiDo(Integer numberOfValidTagesTypDiMiDo) {
    
    this.numberOfValidTagesTypDiMiDo = numberOfValidTagesTypDiMiDo;
    return this;
  }

   /**
   * Get numberOfValidTagesTypDiMiDo
   * @return numberOfValidTagesTypDiMiDo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_DI_MI_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfValidTagesTypDiMiDo() {
    return numberOfValidTagesTypDiMiDo;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_DI_MI_DO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfValidTagesTypDiMiDo(Integer numberOfValidTagesTypDiMiDo) {
    this.numberOfValidTagesTypDiMiDo = numberOfValidTagesTypDiMiDo;
  }


  public ValidWochentageInPeriodDto numberOfValidTagesTypMoFr(Integer numberOfValidTagesTypMoFr) {
    
    this.numberOfValidTagesTypMoFr = numberOfValidTagesTypMoFr;
    return this;
  }

   /**
   * Get numberOfValidTagesTypMoFr
   * @return numberOfValidTagesTypMoFr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_MO_FR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfValidTagesTypMoFr() {
    return numberOfValidTagesTypMoFr;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_MO_FR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfValidTagesTypMoFr(Integer numberOfValidTagesTypMoFr) {
    this.numberOfValidTagesTypMoFr = numberOfValidTagesTypMoFr;
  }


  public ValidWochentageInPeriodDto numberOfValidTagesTypSamstag(Integer numberOfValidTagesTypSamstag) {
    
    this.numberOfValidTagesTypSamstag = numberOfValidTagesTypSamstag;
    return this;
  }

   /**
   * Get numberOfValidTagesTypSamstag
   * @return numberOfValidTagesTypSamstag
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_SAMSTAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfValidTagesTypSamstag() {
    return numberOfValidTagesTypSamstag;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_SAMSTAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfValidTagesTypSamstag(Integer numberOfValidTagesTypSamstag) {
    this.numberOfValidTagesTypSamstag = numberOfValidTagesTypSamstag;
  }


  public ValidWochentageInPeriodDto numberOfValidTagesTypSonntagFeiertag(Integer numberOfValidTagesTypSonntagFeiertag) {
    
    this.numberOfValidTagesTypSonntagFeiertag = numberOfValidTagesTypSonntagFeiertag;
    return this;
  }

   /**
   * Get numberOfValidTagesTypSonntagFeiertag
   * @return numberOfValidTagesTypSonntagFeiertag
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_SONNTAG_FEIERTAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfValidTagesTypSonntagFeiertag() {
    return numberOfValidTagesTypSonntagFeiertag;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_SONNTAG_FEIERTAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfValidTagesTypSonntagFeiertag(Integer numberOfValidTagesTypSonntagFeiertag) {
    this.numberOfValidTagesTypSonntagFeiertag = numberOfValidTagesTypSonntagFeiertag;
  }


  public ValidWochentageInPeriodDto numberOfValidTagesTypWerktagFerien(Integer numberOfValidTagesTypWerktagFerien) {
    
    this.numberOfValidTagesTypWerktagFerien = numberOfValidTagesTypWerktagFerien;
    return this;
  }

   /**
   * Get numberOfValidTagesTypWerktagFerien
   * @return numberOfValidTagesTypWerktagFerien
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_WERKTAG_FERIEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfValidTagesTypWerktagFerien() {
    return numberOfValidTagesTypWerktagFerien;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_WERKTAG_FERIEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfValidTagesTypWerktagFerien(Integer numberOfValidTagesTypWerktagFerien) {
    this.numberOfValidTagesTypWerktagFerien = numberOfValidTagesTypWerktagFerien;
  }


  public ValidWochentageInPeriodDto numberOfValidTagesTypMoSo(Integer numberOfValidTagesTypMoSo) {
    
    this.numberOfValidTagesTypMoSo = numberOfValidTagesTypMoSo;
    return this;
  }

   /**
   * Get numberOfValidTagesTypMoSo
   * @return numberOfValidTagesTypMoSo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_MO_SO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfValidTagesTypMoSo() {
    return numberOfValidTagesTypMoSo;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_VALID_TAGES_TYP_MO_SO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfValidTagesTypMoSo(Integer numberOfValidTagesTypMoSo) {
    this.numberOfValidTagesTypMoSo = numberOfValidTagesTypMoSo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidWochentageInPeriodDto validWochentageInPeriodDto = (ValidWochentageInPeriodDto) o;
    return Objects.equals(this.numberOfValidTagesTypDiMiDo, validWochentageInPeriodDto.numberOfValidTagesTypDiMiDo) &&
        Objects.equals(this.numberOfValidTagesTypMoFr, validWochentageInPeriodDto.numberOfValidTagesTypMoFr) &&
        Objects.equals(this.numberOfValidTagesTypSamstag, validWochentageInPeriodDto.numberOfValidTagesTypSamstag) &&
        Objects.equals(this.numberOfValidTagesTypSonntagFeiertag, validWochentageInPeriodDto.numberOfValidTagesTypSonntagFeiertag) &&
        Objects.equals(this.numberOfValidTagesTypWerktagFerien, validWochentageInPeriodDto.numberOfValidTagesTypWerktagFerien) &&
        Objects.equals(this.numberOfValidTagesTypMoSo, validWochentageInPeriodDto.numberOfValidTagesTypMoSo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfValidTagesTypDiMiDo, numberOfValidTagesTypMoFr, numberOfValidTagesTypSamstag, numberOfValidTagesTypSonntagFeiertag, numberOfValidTagesTypWerktagFerien, numberOfValidTagesTypMoSo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidWochentageInPeriodDto {\n");
    sb.append("    numberOfValidTagesTypDiMiDo: ").append(toIndentedString(numberOfValidTagesTypDiMiDo)).append("\n");
    sb.append("    numberOfValidTagesTypMoFr: ").append(toIndentedString(numberOfValidTagesTypMoFr)).append("\n");
    sb.append("    numberOfValidTagesTypSamstag: ").append(toIndentedString(numberOfValidTagesTypSamstag)).append("\n");
    sb.append("    numberOfValidTagesTypSonntagFeiertag: ").append(toIndentedString(numberOfValidTagesTypSonntagFeiertag)).append("\n");
    sb.append("    numberOfValidTagesTypWerktagFerien: ").append(toIndentedString(numberOfValidTagesTypWerktagFerien)).append("\n");
    sb.append("    numberOfValidTagesTypMoSo: ").append(toIndentedString(numberOfValidTagesTypMoSo)).append("\n");
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

}

