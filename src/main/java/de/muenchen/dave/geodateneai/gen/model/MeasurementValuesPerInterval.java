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
import de.muenchen.dave.geodateneai.gen.model.ModelLocalTime;
import java.time.LocalTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MeasurementValuesPerInterval
 */
@JsonPropertyOrder({
  MeasurementValuesPerInterval.JSON_PROPERTY_START_UHRZEIT,
  MeasurementValuesPerInterval.JSON_PROPERTY_ENDE_UHRZEIT,
  MeasurementValuesPerInterval.JSON_PROPERTY_ANZAHL_LFW,
  MeasurementValuesPerInterval.JSON_PROPERTY_ANZAHL_KRAD,
  MeasurementValuesPerInterval.JSON_PROPERTY_ANZAHL_LKW,
  MeasurementValuesPerInterval.JSON_PROPERTY_ANZAHL_BUS,
  MeasurementValuesPerInterval.JSON_PROPERTY_ANZAHL_RAD,
  MeasurementValuesPerInterval.JSON_PROPERTY_ANZAHL_FUSS,
  MeasurementValuesPerInterval.JSON_PROPERTY_SUMME_ALLE_PKW,
  MeasurementValuesPerInterval.JSON_PROPERTY_SUMME_LASTZUG,
  MeasurementValuesPerInterval.JSON_PROPERTY_SUMME_GUETERVERKEHR,
  MeasurementValuesPerInterval.JSON_PROPERTY_SUMME_SCHWERVERKEHR,
  MeasurementValuesPerInterval.JSON_PROPERTY_SUMME_KRAFTFAHRZEUGVERKEHR,
  MeasurementValuesPerInterval.JSON_PROPERTY_PROZENT_SCHWERVERKEHR,
  MeasurementValuesPerInterval.JSON_PROPERTY_PROZENT_GUETERVERKEHR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MeasurementValuesPerInterval {
  public static final String JSON_PROPERTY_START_UHRZEIT = "startUhrzeit";
  private LocalTime startUhrzeit;

  public static final String JSON_PROPERTY_ENDE_UHRZEIT = "endeUhrzeit";
  private LocalTime endeUhrzeit;

  public static final String JSON_PROPERTY_ANZAHL_LFW = "anzahlLfw";
  private Integer anzahlLfw;

  public static final String JSON_PROPERTY_ANZAHL_KRAD = "anzahlKrad";
  private Integer anzahlKrad;

  public static final String JSON_PROPERTY_ANZAHL_LKW = "anzahlLkw";
  private Integer anzahlLkw;

  public static final String JSON_PROPERTY_ANZAHL_BUS = "anzahlBus";
  private Integer anzahlBus;

  public static final String JSON_PROPERTY_ANZAHL_RAD = "anzahlRad";
  private Integer anzahlRad;

  public static final String JSON_PROPERTY_ANZAHL_FUSS = "anzahlFuss";
  private Integer anzahlFuss;

  public static final String JSON_PROPERTY_SUMME_ALLE_PKW = "summeAllePkw";
  private Integer summeAllePkw;

  public static final String JSON_PROPERTY_SUMME_LASTZUG = "summeLastzug";
  private Integer summeLastzug;

  public static final String JSON_PROPERTY_SUMME_GUETERVERKEHR = "summeGueterverkehr";
  private Integer summeGueterverkehr;

  public static final String JSON_PROPERTY_SUMME_SCHWERVERKEHR = "summeSchwerverkehr";
  private Integer summeSchwerverkehr;

  public static final String JSON_PROPERTY_SUMME_KRAFTFAHRZEUGVERKEHR = "summeKraftfahrzeugverkehr";
  private Integer summeKraftfahrzeugverkehr;

  public static final String JSON_PROPERTY_PROZENT_SCHWERVERKEHR = "prozentSchwerverkehr";
  private Double prozentSchwerverkehr;

  public static final String JSON_PROPERTY_PROZENT_GUETERVERKEHR = "prozentGueterverkehr";
  private Double prozentGueterverkehr;

  public MeasurementValuesPerInterval() {
  }

  public MeasurementValuesPerInterval startUhrzeit(LocalTime startUhrzeit) {
    
    this.startUhrzeit = startUhrzeit;
    return this;
  }

   /**
   * Get startUhrzeit
   * @return startUhrzeit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_UHRZEIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalTime getStartUhrzeit() {
    return startUhrzeit;
  }


  @JsonProperty(JSON_PROPERTY_START_UHRZEIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartUhrzeit(LocalTime startUhrzeit) {
    this.startUhrzeit = startUhrzeit;
  }


  public MeasurementValuesPerInterval endeUhrzeit(LocalTime endeUhrzeit) {
    
    this.endeUhrzeit = endeUhrzeit;
    return this;
  }

   /**
   * Get endeUhrzeit
   * @return endeUhrzeit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENDE_UHRZEIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalTime getEndeUhrzeit() {
    return endeUhrzeit;
  }


  @JsonProperty(JSON_PROPERTY_ENDE_UHRZEIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndeUhrzeit(LocalTime endeUhrzeit) {
    this.endeUhrzeit = endeUhrzeit;
  }


  public MeasurementValuesPerInterval anzahlLfw(Integer anzahlLfw) {
    
    this.anzahlLfw = anzahlLfw;
    return this;
  }

   /**
   * Get anzahlLfw
   * @return anzahlLfw
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANZAHL_LFW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnzahlLfw() {
    return anzahlLfw;
  }


  @JsonProperty(JSON_PROPERTY_ANZAHL_LFW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnzahlLfw(Integer anzahlLfw) {
    this.anzahlLfw = anzahlLfw;
  }


  public MeasurementValuesPerInterval anzahlKrad(Integer anzahlKrad) {
    
    this.anzahlKrad = anzahlKrad;
    return this;
  }

   /**
   * Get anzahlKrad
   * @return anzahlKrad
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANZAHL_KRAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnzahlKrad() {
    return anzahlKrad;
  }


  @JsonProperty(JSON_PROPERTY_ANZAHL_KRAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnzahlKrad(Integer anzahlKrad) {
    this.anzahlKrad = anzahlKrad;
  }


  public MeasurementValuesPerInterval anzahlLkw(Integer anzahlLkw) {
    
    this.anzahlLkw = anzahlLkw;
    return this;
  }

   /**
   * Get anzahlLkw
   * @return anzahlLkw
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANZAHL_LKW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnzahlLkw() {
    return anzahlLkw;
  }


  @JsonProperty(JSON_PROPERTY_ANZAHL_LKW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnzahlLkw(Integer anzahlLkw) {
    this.anzahlLkw = anzahlLkw;
  }


  public MeasurementValuesPerInterval anzahlBus(Integer anzahlBus) {
    
    this.anzahlBus = anzahlBus;
    return this;
  }

   /**
   * Get anzahlBus
   * @return anzahlBus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANZAHL_BUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnzahlBus() {
    return anzahlBus;
  }


  @JsonProperty(JSON_PROPERTY_ANZAHL_BUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnzahlBus(Integer anzahlBus) {
    this.anzahlBus = anzahlBus;
  }


  public MeasurementValuesPerInterval anzahlRad(Integer anzahlRad) {
    
    this.anzahlRad = anzahlRad;
    return this;
  }

   /**
   * Get anzahlRad
   * @return anzahlRad
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANZAHL_RAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnzahlRad() {
    return anzahlRad;
  }


  @JsonProperty(JSON_PROPERTY_ANZAHL_RAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnzahlRad(Integer anzahlRad) {
    this.anzahlRad = anzahlRad;
  }


  public MeasurementValuesPerInterval anzahlFuss(Integer anzahlFuss) {
    
    this.anzahlFuss = anzahlFuss;
    return this;
  }

   /**
   * Get anzahlFuss
   * @return anzahlFuss
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANZAHL_FUSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnzahlFuss() {
    return anzahlFuss;
  }


  @JsonProperty(JSON_PROPERTY_ANZAHL_FUSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnzahlFuss(Integer anzahlFuss) {
    this.anzahlFuss = anzahlFuss;
  }


  public MeasurementValuesPerInterval summeAllePkw(Integer summeAllePkw) {
    
    this.summeAllePkw = summeAllePkw;
    return this;
  }

   /**
   * Get summeAllePkw
   * @return summeAllePkw
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMME_ALLE_PKW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSummeAllePkw() {
    return summeAllePkw;
  }


  @JsonProperty(JSON_PROPERTY_SUMME_ALLE_PKW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummeAllePkw(Integer summeAllePkw) {
    this.summeAllePkw = summeAllePkw;
  }


  public MeasurementValuesPerInterval summeLastzug(Integer summeLastzug) {
    
    this.summeLastzug = summeLastzug;
    return this;
  }

   /**
   * Get summeLastzug
   * @return summeLastzug
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMME_LASTZUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSummeLastzug() {
    return summeLastzug;
  }


  @JsonProperty(JSON_PROPERTY_SUMME_LASTZUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummeLastzug(Integer summeLastzug) {
    this.summeLastzug = summeLastzug;
  }


  public MeasurementValuesPerInterval summeGueterverkehr(Integer summeGueterverkehr) {
    
    this.summeGueterverkehr = summeGueterverkehr;
    return this;
  }

   /**
   * Get summeGueterverkehr
   * @return summeGueterverkehr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMME_GUETERVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSummeGueterverkehr() {
    return summeGueterverkehr;
  }


  @JsonProperty(JSON_PROPERTY_SUMME_GUETERVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummeGueterverkehr(Integer summeGueterverkehr) {
    this.summeGueterverkehr = summeGueterverkehr;
  }


  public MeasurementValuesPerInterval summeSchwerverkehr(Integer summeSchwerverkehr) {
    
    this.summeSchwerverkehr = summeSchwerverkehr;
    return this;
  }

   /**
   * Get summeSchwerverkehr
   * @return summeSchwerverkehr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMME_SCHWERVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSummeSchwerverkehr() {
    return summeSchwerverkehr;
  }


  @JsonProperty(JSON_PROPERTY_SUMME_SCHWERVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummeSchwerverkehr(Integer summeSchwerverkehr) {
    this.summeSchwerverkehr = summeSchwerverkehr;
  }


  public MeasurementValuesPerInterval summeKraftfahrzeugverkehr(Integer summeKraftfahrzeugverkehr) {
    
    this.summeKraftfahrzeugverkehr = summeKraftfahrzeugverkehr;
    return this;
  }

   /**
   * Get summeKraftfahrzeugverkehr
   * @return summeKraftfahrzeugverkehr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMME_KRAFTFAHRZEUGVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSummeKraftfahrzeugverkehr() {
    return summeKraftfahrzeugverkehr;
  }


  @JsonProperty(JSON_PROPERTY_SUMME_KRAFTFAHRZEUGVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummeKraftfahrzeugverkehr(Integer summeKraftfahrzeugverkehr) {
    this.summeKraftfahrzeugverkehr = summeKraftfahrzeugverkehr;
  }


  public MeasurementValuesPerInterval prozentSchwerverkehr(Double prozentSchwerverkehr) {
    
    this.prozentSchwerverkehr = prozentSchwerverkehr;
    return this;
  }

   /**
   * Get prozentSchwerverkehr
   * @return prozentSchwerverkehr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROZENT_SCHWERVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getProzentSchwerverkehr() {
    return prozentSchwerverkehr;
  }


  @JsonProperty(JSON_PROPERTY_PROZENT_SCHWERVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProzentSchwerverkehr(Double prozentSchwerverkehr) {
    this.prozentSchwerverkehr = prozentSchwerverkehr;
  }


  public MeasurementValuesPerInterval prozentGueterverkehr(Double prozentGueterverkehr) {
    
    this.prozentGueterverkehr = prozentGueterverkehr;
    return this;
  }

   /**
   * Get prozentGueterverkehr
   * @return prozentGueterverkehr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROZENT_GUETERVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getProzentGueterverkehr() {
    return prozentGueterverkehr;
  }


  @JsonProperty(JSON_PROPERTY_PROZENT_GUETERVERKEHR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProzentGueterverkehr(Double prozentGueterverkehr) {
    this.prozentGueterverkehr = prozentGueterverkehr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementValuesPerInterval measurementValuesPerInterval = (MeasurementValuesPerInterval) o;
    return Objects.equals(this.startUhrzeit, measurementValuesPerInterval.startUhrzeit) &&
        Objects.equals(this.endeUhrzeit, measurementValuesPerInterval.endeUhrzeit) &&
        Objects.equals(this.anzahlLfw, measurementValuesPerInterval.anzahlLfw) &&
        Objects.equals(this.anzahlKrad, measurementValuesPerInterval.anzahlKrad) &&
        Objects.equals(this.anzahlLkw, measurementValuesPerInterval.anzahlLkw) &&
        Objects.equals(this.anzahlBus, measurementValuesPerInterval.anzahlBus) &&
        Objects.equals(this.anzahlRad, measurementValuesPerInterval.anzahlRad) &&
        Objects.equals(this.anzahlFuss, measurementValuesPerInterval.anzahlFuss) &&
        Objects.equals(this.summeAllePkw, measurementValuesPerInterval.summeAllePkw) &&
        Objects.equals(this.summeLastzug, measurementValuesPerInterval.summeLastzug) &&
        Objects.equals(this.summeGueterverkehr, measurementValuesPerInterval.summeGueterverkehr) &&
        Objects.equals(this.summeSchwerverkehr, measurementValuesPerInterval.summeSchwerverkehr) &&
        Objects.equals(this.summeKraftfahrzeugverkehr, measurementValuesPerInterval.summeKraftfahrzeugverkehr) &&
        Objects.equals(this.prozentSchwerverkehr, measurementValuesPerInterval.prozentSchwerverkehr) &&
        Objects.equals(this.prozentGueterverkehr, measurementValuesPerInterval.prozentGueterverkehr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startUhrzeit, endeUhrzeit, anzahlLfw, anzahlKrad, anzahlLkw, anzahlBus, anzahlRad, anzahlFuss, summeAllePkw, summeLastzug, summeGueterverkehr, summeSchwerverkehr, summeKraftfahrzeugverkehr, prozentSchwerverkehr, prozentGueterverkehr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementValuesPerInterval {\n");
    sb.append("    startUhrzeit: ").append(toIndentedString(startUhrzeit)).append("\n");
    sb.append("    endeUhrzeit: ").append(toIndentedString(endeUhrzeit)).append("\n");
    sb.append("    anzahlLfw: ").append(toIndentedString(anzahlLfw)).append("\n");
    sb.append("    anzahlKrad: ").append(toIndentedString(anzahlKrad)).append("\n");
    sb.append("    anzahlLkw: ").append(toIndentedString(anzahlLkw)).append("\n");
    sb.append("    anzahlBus: ").append(toIndentedString(anzahlBus)).append("\n");
    sb.append("    anzahlRad: ").append(toIndentedString(anzahlRad)).append("\n");
    sb.append("    anzahlFuss: ").append(toIndentedString(anzahlFuss)).append("\n");
    sb.append("    summeAllePkw: ").append(toIndentedString(summeAllePkw)).append("\n");
    sb.append("    summeLastzug: ").append(toIndentedString(summeLastzug)).append("\n");
    sb.append("    summeGueterverkehr: ").append(toIndentedString(summeGueterverkehr)).append("\n");
    sb.append("    summeSchwerverkehr: ").append(toIndentedString(summeSchwerverkehr)).append("\n");
    sb.append("    summeKraftfahrzeugverkehr: ").append(toIndentedString(summeKraftfahrzeugverkehr)).append("\n");
    sb.append("    prozentSchwerverkehr: ").append(toIndentedString(prozentSchwerverkehr)).append("\n");
    sb.append("    prozentGueterverkehr: ").append(toIndentedString(prozentGueterverkehr)).append("\n");
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

