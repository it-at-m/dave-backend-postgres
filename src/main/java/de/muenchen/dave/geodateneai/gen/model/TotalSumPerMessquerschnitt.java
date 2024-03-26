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
 * TotalSumPerMessquerschnitt
 */
@JsonPropertyOrder({
  TotalSumPerMessquerschnitt.JSON_PROPERTY_MQ_ID,
  TotalSumPerMessquerschnitt.JSON_PROPERTY_SUM_KFZ,
  TotalSumPerMessquerschnitt.JSON_PROPERTY_SUM_SV,
  TotalSumPerMessquerschnitt.JSON_PROPERTY_SUM_GV,
  TotalSumPerMessquerschnitt.JSON_PROPERTY_SUM_RAD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TotalSumPerMessquerschnitt {
  public static final String JSON_PROPERTY_MQ_ID = "mqId";
  private String mqId;

  public static final String JSON_PROPERTY_SUM_KFZ = "sumKfz";
  private Integer sumKfz;

  public static final String JSON_PROPERTY_SUM_SV = "sumSv";
  private Integer sumSv;

  public static final String JSON_PROPERTY_SUM_GV = "sumGv";
  private Integer sumGv;

  public static final String JSON_PROPERTY_SUM_RAD = "sumRad";
  private Integer sumRad;

  public TotalSumPerMessquerschnitt() {
  }

  public TotalSumPerMessquerschnitt mqId(String mqId) {
    
    this.mqId = mqId;
    return this;
  }

   /**
   * Get mqId
   * @return mqId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MQ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMqId() {
    return mqId;
  }


  @JsonProperty(JSON_PROPERTY_MQ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMqId(String mqId) {
    this.mqId = mqId;
  }


  public TotalSumPerMessquerschnitt sumKfz(Integer sumKfz) {
    
    this.sumKfz = sumKfz;
    return this;
  }

   /**
   * Get sumKfz
   * @return sumKfz
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUM_KFZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSumKfz() {
    return sumKfz;
  }


  @JsonProperty(JSON_PROPERTY_SUM_KFZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSumKfz(Integer sumKfz) {
    this.sumKfz = sumKfz;
  }


  public TotalSumPerMessquerschnitt sumSv(Integer sumSv) {
    
    this.sumSv = sumSv;
    return this;
  }

   /**
   * Get sumSv
   * @return sumSv
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUM_SV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSumSv() {
    return sumSv;
  }


  @JsonProperty(JSON_PROPERTY_SUM_SV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSumSv(Integer sumSv) {
    this.sumSv = sumSv;
  }


  public TotalSumPerMessquerschnitt sumGv(Integer sumGv) {
    
    this.sumGv = sumGv;
    return this;
  }

   /**
   * Get sumGv
   * @return sumGv
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUM_GV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSumGv() {
    return sumGv;
  }


  @JsonProperty(JSON_PROPERTY_SUM_GV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSumGv(Integer sumGv) {
    this.sumGv = sumGv;
  }


  public TotalSumPerMessquerschnitt sumRad(Integer sumRad) {
    
    this.sumRad = sumRad;
    return this;
  }

   /**
   * Get sumRad
   * @return sumRad
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUM_RAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSumRad() {
    return sumRad;
  }


  @JsonProperty(JSON_PROPERTY_SUM_RAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSumRad(Integer sumRad) {
    this.sumRad = sumRad;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalSumPerMessquerschnitt totalSumPerMessquerschnitt = (TotalSumPerMessquerschnitt) o;
    return Objects.equals(this.mqId, totalSumPerMessquerschnitt.mqId) &&
        Objects.equals(this.sumKfz, totalSumPerMessquerschnitt.sumKfz) &&
        Objects.equals(this.sumSv, totalSumPerMessquerschnitt.sumSv) &&
        Objects.equals(this.sumGv, totalSumPerMessquerschnitt.sumGv) &&
        Objects.equals(this.sumRad, totalSumPerMessquerschnitt.sumRad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mqId, sumKfz, sumSv, sumGv, sumRad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalSumPerMessquerschnitt {\n");
    sb.append("    mqId: ").append(toIndentedString(mqId)).append("\n");
    sb.append("    sumKfz: ").append(toIndentedString(sumKfz)).append("\n");
    sb.append("    sumSv: ").append(toIndentedString(sumSv)).append("\n");
    sb.append("    sumGv: ").append(toIndentedString(sumGv)).append("\n");
    sb.append("    sumRad: ").append(toIndentedString(sumRad)).append("\n");
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

