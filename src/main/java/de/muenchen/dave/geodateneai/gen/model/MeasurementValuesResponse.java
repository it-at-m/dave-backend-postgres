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
import de.muenchen.dave.geodateneai.gen.model.AverageMeasurementValuesPerIntervalResponse;
import de.muenchen.dave.geodateneai.gen.model.TotalSumOfAllMessquerschnitte;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MeasurementValuesResponse
 */
@JsonPropertyOrder({
  MeasurementValuesResponse.JSON_PROPERTY_AVERAGE_MEASUREMENT_VALUES_PER_INTERVAL_RESPONSE,
  MeasurementValuesResponse.JSON_PROPERTY_TOTAL_SUM_OF_ALL_MESSQUERSCHNITTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MeasurementValuesResponse {
  public static final String JSON_PROPERTY_AVERAGE_MEASUREMENT_VALUES_PER_INTERVAL_RESPONSE = "averageMeasurementValuesPerIntervalResponse";
  private AverageMeasurementValuesPerIntervalResponse averageMeasurementValuesPerIntervalResponse;

  public static final String JSON_PROPERTY_TOTAL_SUM_OF_ALL_MESSQUERSCHNITTE = "totalSumOfAllMessquerschnitte";
  private TotalSumOfAllMessquerschnitte totalSumOfAllMessquerschnitte;

  public MeasurementValuesResponse() {
  }

  public MeasurementValuesResponse averageMeasurementValuesPerIntervalResponse(AverageMeasurementValuesPerIntervalResponse averageMeasurementValuesPerIntervalResponse) {
    
    this.averageMeasurementValuesPerIntervalResponse = averageMeasurementValuesPerIntervalResponse;
    return this;
  }

   /**
   * Get averageMeasurementValuesPerIntervalResponse
   * @return averageMeasurementValuesPerIntervalResponse
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_MEASUREMENT_VALUES_PER_INTERVAL_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AverageMeasurementValuesPerIntervalResponse getAverageMeasurementValuesPerIntervalResponse() {
    return averageMeasurementValuesPerIntervalResponse;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_MEASUREMENT_VALUES_PER_INTERVAL_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageMeasurementValuesPerIntervalResponse(AverageMeasurementValuesPerIntervalResponse averageMeasurementValuesPerIntervalResponse) {
    this.averageMeasurementValuesPerIntervalResponse = averageMeasurementValuesPerIntervalResponse;
  }


  public MeasurementValuesResponse totalSumOfAllMessquerschnitte(TotalSumOfAllMessquerschnitte totalSumOfAllMessquerschnitte) {
    
    this.totalSumOfAllMessquerschnitte = totalSumOfAllMessquerschnitte;
    return this;
  }

   /**
   * Get totalSumOfAllMessquerschnitte
   * @return totalSumOfAllMessquerschnitte
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SUM_OF_ALL_MESSQUERSCHNITTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TotalSumOfAllMessquerschnitte getTotalSumOfAllMessquerschnitte() {
    return totalSumOfAllMessquerschnitte;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SUM_OF_ALL_MESSQUERSCHNITTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalSumOfAllMessquerschnitte(TotalSumOfAllMessquerschnitte totalSumOfAllMessquerschnitte) {
    this.totalSumOfAllMessquerschnitte = totalSumOfAllMessquerschnitte;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementValuesResponse measurementValuesResponse = (MeasurementValuesResponse) o;
    return Objects.equals(this.averageMeasurementValuesPerIntervalResponse, measurementValuesResponse.averageMeasurementValuesPerIntervalResponse) &&
        Objects.equals(this.totalSumOfAllMessquerschnitte, measurementValuesResponse.totalSumOfAllMessquerschnitte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageMeasurementValuesPerIntervalResponse, totalSumOfAllMessquerschnitte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementValuesResponse {\n");
    sb.append("    averageMeasurementValuesPerIntervalResponse: ").append(toIndentedString(averageMeasurementValuesPerIntervalResponse)).append("\n");
    sb.append("    totalSumOfAllMessquerschnitte: ").append(toIndentedString(totalSumOfAllMessquerschnitte)).append("\n");
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

